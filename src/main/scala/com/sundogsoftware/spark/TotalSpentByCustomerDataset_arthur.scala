package com.sundogsoftware.spark

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{round, sum, _}
import org.apache.spark.sql.types.{DoubleType, IntegerType, StructType}

object TotalSpentByCustomerDataset_arthur {
  case class CustomerOrders(cust_id: Int, item_id: Int, amount_spent: Double)

  def main (args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    val spark = SparkSession
      .builder
      .appName("CustomerOrders")
      .master("local[*]")
      .getOrCreate()

    val CustomerOrdersSchema = new StructType()
      .add("cust_id", IntegerType, nullable = true)
      .add("item_id", IntegerType, nullable = true)
      .add("amount_spent", DoubleType, nullable = true)

    import spark.implicits._
    val ds = spark.read
      .schema(CustomerOrdersSchema)
      .csv("data/customer-orders.csv")
      .as[CustomerOrders]

    ds.printSchema()

    val totalSpentByCustomer = ds
      .groupBy("cust_id")
      .agg(round(sum("amount_spent"), 2)
      .alias("total_spent")
      )

    val totalSpentByCustomerSorted = totalSpentByCustomer.sort("total_spent")

    totalSpentByCustomerSorted.show(totalSpentByCustomer.count.toInt)
  }
}
