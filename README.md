# The TTC 2017 Smart Grid Case

## Case description

The `docs/2017_TTC_SmartGrid.pdf` file contains the [case description](https://georghinkel.github.io/ttc2017smartGrids/2017_TTC_SmartGrid.pdf).

## Prerequisites

* 64-bit operating system
* Python 2.7 or higher
* R

## Solution Prerequisites

* ModelJoin: Java 1.8
* NMF: .NET Framework 4.5.1 and MSBuild on the path

## Using the framework

The `scripts` directory contains the `run.py` script which is used for the following purposes:
* `run.py -b` -- builds the projects
* `run.py -b -s` -- builds the projects without testing
* `run.py -g` -- generates the instance models
* `run.py -m` -- runs the benchmark
* `run.py -v` -- visualizes the results of the latest benchmark

The `config` directory contains the configuration for the scripts:
* `config.json` -- configuration for the model generation and the benchmark
* `reporting.json` -- configuration for the visualization

### Running the benchmark

The script runs the benchmark for the given number of runs, for the specified tools and change sequences.

The benchmark results are stored in a CSV file. The header for the CSV file is stored in the `output/header.csv` file.

## Reporting and visualization

Make sure you read the `README.md` file in the `reporting` directory and install all the requirements for R.

## Running the example solution

1. Start with Eclipse Modeling or Eclipse for DSL Developers.
1. Add the <http://download.eclipse.org/mmt/qvto/updates/releases> update site and install the **QVT Operational SDK**, version **3.6.0.v20160606-1156**.
1. Import the `solutions/ModelJoin` project.
1. If you get compile errors related to character encoding, change the encoding of the project to **ISO-8859-1**.

Run the `de.fzi.ttc2017.smartGrids.App` class as a Java Application with the required settings. For example:

* Arguments
  * `-view outageDetection`
* Environment
  * `ChangePath`: `../../changes/changeSequence1`
  * `Sequences`: `1`

## Implementing the benchmark for a new tool

To implement a tool, you need to create a new directory in the solutions directory and give it a suitable name.
