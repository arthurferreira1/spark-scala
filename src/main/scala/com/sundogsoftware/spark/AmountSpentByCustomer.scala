package com.sundogsoftware.spark

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

object AmountSpentByCustomer {

  def parseLines(line:String): (Int, Float) = {
    val fields = line.split(",")
    val id = fields(0).toInt
    val amount = fields(3).toFloat
    (id, amount)
  }

  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    val sc = new SparkContext("local[*]", "AmountSpentByCustomer")

    val lines = sc.textFile("data/customer-orders.csv")

    val parsedLines = lines.map(parseLines)

    val amountSpent = parsedLines.reduceByKey( (x,y) => x + y )

    val results = amountSpent.collect()

    // Print the results.
    results.foreach(println)

  }

}