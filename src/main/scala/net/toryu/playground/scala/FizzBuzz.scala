package net.toryu.playground.scala

object FizzBuzz {

  def translate(toTranslate: Int): String = {
    if(toTranslate % 15 == 0) {
      return "FizzBuzz"
    }

    if(toTranslate % 3 == 0) {
      return "Fizz"
    }

    if(toTranslate % 5 == 0) {
      return "Buzz"
    }

    return toTranslate.toString
  }

  def main (args: Array[String]) {
    if(args.length == 0) {
      throw new IllegalArgumentException("No argument provided")
    }

    val upperBound = args(0).toInt

    if(upperBound < 1) {
      throw new IllegalArgumentException("Provided upper bound is lower than one.")
    }

    (1 to upperBound).map(translate _ andThen println)
  }
}
