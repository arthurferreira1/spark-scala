package com.sundogsoftware.spark

object Fibonacci {
  def fibonacci(n: Int): Int = {
    var a = 0
    var b = 1

    for (_ <- 1 to n) {
      val temp = a + b
      a = b
      b = temp
    }

    a
  }

  def main(args: Array[String]): Unit = {
    val n = 10
    for (i <- 0 to n) {
      println(s"Fibonacci($i) = ${fibonacci(i)}")
    }
  }
}