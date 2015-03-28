package net.toryu.playground.scala

object FizzBuzz {

  def translate(toTranslate: Int): String = {
    return (toTranslate % 3, toTranslate % 5) match {
      case (0,0) => "FizzBuzz"
      case (0,_) => "Fizz"
      case (_,0) => "Buzz"
      case _ => toTranslate.toString
    }
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
