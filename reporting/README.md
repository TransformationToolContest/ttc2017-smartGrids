# TTC 2017 Smart Grids Benchmark reporting tools

## Dependencies

1. Install R: the `r-base`, `r-base-dev` packages are required. The code is tested with R 3.0 (you can check your version with the `R --version` command).

    ```bash
    sudo apt-get install -y r-base r-base-dev
    ```

1. Install the required R packages by issuing the following command:

    ```bash
    cd reporting/
    sudo R -f install.R
    ```

  As a consequence, the `ggplot2`, `jsonlite`, `plyr` packages will be installed.

## Usage
    
1. Adjust the configuration parameters in the `config/reporting.json` file.
1. Use the `scripts/run.py -v` command.
1. Alternatively, execute the following command from the `reporting` directory:

     `Rscript generate_diagrams.R` 
    
### Configuration

* An example of the configuration file can be seen below:

     ```json
{
  "Dimensions": {
    "X_Dimensions": {
      "Size": true,
      "Iteration": true
    },
    "Groups": {
      "Query": true,
      "Tool": true
    }
  },
  "Summarize_Functions": [
    {
      "Phases": [
        "check",
        "transformation"
      ],
      "Metric": "time",
      "Y_Label": "Time (ms)",
      "Y_Axis_Scale": -6
    },
    {
      "Phases": [
        "result"
      ],
      "Metric": "scalar",
      "Y_Label": "Invalid elements",
      "Y_Axis_Scale": 0
    }
  ],
  "Extension": ["png", "pdf"]
}
     ```

* An arbitrary number of functions can be declared.
 
* The dimension and group parameters can be changed independently from each other, which means for example every variable can be `true` at the same time. As a consequence, more diagrams will be generated.
