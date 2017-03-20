library("plyr", quietly=T, verbose=F, warn.conflicts=FALSE)
source("constants.R")
results <-read.csv2(resultsPath, header=TRUE)

changes <- unique(results$ChangeSet)
metricName <- "elements"

for (change in changes){
  subData <- subset(results, ChangeSet == change)
  queries <- unique(subData$Query)
  for (query in queries){
    fileName <- paste("../results/",change, "-", query, ".csv", sep="")
    if (file.exists(fileName)){
      file.remove(fileName)  
    }
    
    firstRow <- list("Size")
    subData2 <- subset(subData, Query == query)
    iterations <- unique(subData2$Iteration)
    for (iter in iterations){
      firstRow <- paste(firstRow, iter, sep="\t")
    }
    write(firstRow, fileName, append=TRUE)
    sizes <- unique(subData2$Size)
    for (size in sizes){
      row <- list(size)
      for (iter in iterations){
        metricValue <- subset(subData2, Size==size & Iteration==iter & MetricName==metricName & RunIndex==1)$MetricValue
        row <- paste(row, metricValue, sep="\t")
      }
      write(row, fileName, append=TRUE)
    }
    
  }
}
