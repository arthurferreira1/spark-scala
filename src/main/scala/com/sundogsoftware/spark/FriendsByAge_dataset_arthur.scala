package com.sundogsoftware.spark

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession


object FriendsByAge_dataset_arthur {
  case class FriendsByAge(id:Int, name:String, age:Int, friends:Int)


  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession
      .builder
      .appName("FriendsByAge_dataset_arthur")
      .master("local[*]")
      .getOrCreate()

    import spark.implicits._
    val friendsByAge = spark.read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("data/fakefriends.csv")
      .as[FriendsByAge]

    val columns = friendsByAge.select("age", "friends")

    friendsByAge.printSchema()
    //friendsByAge.createOrReplaceTempView("friendsByAge")

    columns.groupBy("age").avg("friends").sort("age").show()

  }
}
