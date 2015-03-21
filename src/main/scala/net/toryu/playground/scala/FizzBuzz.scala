package net.toryu.playground.scala

object FizzBuzz {

  def main (args: Array[String]) {
    if(args.length == 0) {
      throw new IllegalArgumentException("No argument provided")
    }

    val upperBound = args(0).toInt

    if(upperBound < 1) {
      throw new IllegalArgumentException("Provided upper bound is lower than one.")
    }

    for(i <- 1 to upperBound) {
      if(i % 3 == 0) {
        print("Fizz")
      }
      if(i % 5 == 0) {
        print("Buzz")
      }
      if(i % 3 != 0 && i % 5 != 0) {
        print(i)
      }
      println()
    }
  }
}
