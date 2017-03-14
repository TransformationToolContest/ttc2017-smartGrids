using CommandLine;
using NMF.Models;
using NMF.Models.Repository;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TTC2017.SmartGrids.Generator
{
    public class Options
    {
        [Option("cim", HelpText = "The path to the cim model", Required = true)]
        public string CimPath { get; set; }

        [Option("cosem", HelpText = "The path to the cosem model", Required = true)]
        public string CosemPath { get; set; }

        [Option("substation", HelpText = "The path to the substation model", Required = true)]
        public string SubstationPath { get; set; }

        [Option("cimOut", HelpText = "The path to which the changed cim model should be saved to", Required = true)]
        public string CimOutPath { get; set; }

        [Option("cosemOut", HelpText = "The path to which the changed cosem model should be saved to", Required = true)]
        public string CosemOutPath { get; set; }

        [Option("substationOut", HelpText = "The path to which the changed substation model should be saved to", Required = true)]
        public string SubstationOutPath { get; set; }

        [Option('n', "changes", HelpText = "The number of changes to generate", Required = true)]
        public int Changes { get; set; }
    }

    class Program
    {
        private Model cim;
        private Model cosem;
        private Model substation;
        private Random rnd = new Random();

        static void Main(string[] args)
        {
            var parser = new Parser();
            var options = new Options();
            if (parser.ParseArguments(args, options))
            {
                var program = new Program();
                program.GenerateChanges(options);
                Console.WriteLine("Successfully generated changes");
            }
            else
            {
                Console.WriteLine("You are using me wrongly.");
                Console.WriteLine(CommandLine.Text.HelpText.AutoBuild(options));
            }
        }

        internal void GenerateChanges(Options options)
        {
            var repository = new ModelRepository();
            cim = repository.Resolve(options.CimPath);
            cosem = repository.Resolve(options.CosemPath);
            substation = repository.Resolve(options.SubstationPath);

            for (int i = 0; i < options.Changes; i++)
            {
                GenerateChanges();
            }

            repository.Save(cim, options.CimOutPath);
            repository.Save(cosem, options.CosemOutPath);
            repository.Save(substation, options.SubstationOutPath);
        }

        private void GenerateChanges()
        {

        }
    }
}
