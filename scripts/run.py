#!/usr/bin/python
"""
@author: Zsolt Kovari, Georg Hinkel

"""
import argparse
import os
import shutil
import subprocess
import sys
import ConfigParser
import json
from subprocess import CalledProcessError

BASE_DIRECTORY = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
print "Running benchmark with root directory " + BASE_DIRECTORY

class JSONObject(object):
    def __init__(self, d):
        self.__dict__ = d


def build(conf, skip_tests=False):
    """
    Builds all solutions
    """
    for tool in conf.Tools:
        config = ConfigParser.ConfigParser()
        config.read(os.path.join(BASE_DIRECTORY, "solutions", tool, "solution.ini"))
        set_working_directory("solutions", tool)
        if skip_tests:
            subprocess.check_call(config.get('build', 'skipTests'), shell=True)
        else:
            subprocess.check_call(config.get('build', 'default'), shell=True)


def generate(conf):
    """
    Generates additional change sequences
    """
    clean_dir("changes")
    set_working_directory("generator")
    generator_bin = os.path.join("bin", "Release", "Generator.exe")
    models_dir = os.path.join(BASE_DIRECTORY, "models")
    for change_set in conf.ChangeSets:
        full_change_path = os.path.abspath(os.path.join(BASE_DIRECTORY, "changes", change_set))
        subprocess.check_call([generator_bin,
                               "--cim", os.path.join(models_dir, "CIM_DCIM.xmi"),
                               "--cosem", os.path.join(models_dir, "COSEM.xmi"),
                               "--substation", os.path.join(models_dir, "Substandard.xmi"),
                               "--cimOut", os.path.join(full_change_path, "CIM_DCIM"),
                               "--cosemOut", os.path.join(full_change_path, "COSEM"),
                               "--substationOut", os.path.join(full_change_path, "Substandard"),
                               "-n", str(conf.SequenceLength), "-d", str(conf.Sequences)])


def benchmark(conf):
    """
    Runs measurements
    """
    header = os.path.join(BASE_DIRECTORY, "output", "header.csv")
    result_file = os.path.join(BASE_DIRECTORY, "output", "output.csv")
    if os.path.exists(result_file):
        os.remove(result_file)
    shutil.copy(header, result_file)
    os.environ['Sequences'] = str(conf.Sequences)
    os.environ['SequenceLength'] = str(conf.SequenceLength)
    os.environ['Runs'] = str(conf.Runs)
    for r in range(0, conf.Runs):
        os.environ['RunIndex'] = str(r)
        for tool in conf.Tools:
            config = ConfigParser.ConfigParser()
            config.read(os.path.join(BASE_DIRECTORY, "solutions", tool, "solution.ini"))
            set_working_directory("solutions", tool)
            os.environ['Tool'] = tool
            for change_set in conf.ChangeSets:
                full_change_path = os.path.abspath(os.path.join(BASE_DIRECTORY, "changes", change_set))
                os.environ['ChangeSet'] = change_set
                os.environ['ChangePath'] = full_change_path
                for view in conf.Views:
                    os.environ['View'] = view
                    print("Running benchmark: tool = " + tool + ", change set = " + change_set +
                          ", view = " + view)
                    try:
                        output = subprocess.check_output(config.get('run', view), shell=True)
                        with open(result_file, "ab") as file:
                            file.write(output)
                    except CalledProcessError as e:
                        print("Program exited with error")


def clean_dir(*path):
    dir = os.path.join(BASE_DIRECTORY, *path)
    if os.path.exists(dir):
        shutil.rmtree(dir)
    os.mkdir(dir)


def set_working_directory(*path):
    dir = os.path.join(BASE_DIRECTORY, *path)
    os.chdir(dir)


def visualize():
    """
    Visualizes the benchmark results
    """
    clean_dir("diagrams")
    set_working_directory("reporting")
    subprocess.call(["Rscript", "visualize.R", os.path.join(BASE_DIRECTORY, "config", "reporting.json")])


def extract_results():
    """
    Extracts the benchmark results
    """
    clean_dir("results")
    set_working_directory("reporting")
    subprocess.call(["Rscript", "extract_results.R"])


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("-b", "--build",
                        help="build the project",
                        action="store_true")
    parser.add_argument("-g", "--generate",
                        help="generate models",
                        action="store_true")
    parser.add_argument("-m", "--measure",
                        help="run the benchmark",
                        action="store_true")
    parser.add_argument("-s", "--skip-tests",
                        help="skip JUNIT tests",
                        action="store_true")
    parser.add_argument("-v", "--visualize",
                        help="create visualizations",
                        action="store_true")
    parser.add_argument("-e", "--extract",
                        help="extract results",
                        action="store_true")
    parser.add_argument("-t", "--test",
                        help="run test",
                        action="store_true")
    args = parser.parse_args()


    set_working_directory("config")
    with open("config.json", "r") as config_file:
        config = json.load(config_file, object_hook = JSONObject)

    if args.build:
        build(config, args.skip_tests)
    if args.generate:
        generate(config)
    if args.measure:
        benchmark(config)
    if args.test:
        build(config, False)
    if args.visualize:
        visualize()
    if args.extract:
        extract_results()

    # if there are no args, execute a full sequence
    # with the test and the visualization/reporting
    no_args = all(val==False for val in vars(args).values())
    if no_args:
        build(config, False)
        benchmark(config)
        visualize()
        extract_results()
