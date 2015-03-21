package net.toryu.playground.scala

import java.io.{ByteArrayOutputStream, PrintStream}

import org.scalatest.FunSuite

class FizzBuzzTestSuite extends FunSuite{

  test("Given no parameters, should trigger IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      FizzBuzz.main(Array())
    }
  }

  test("Given non-numeric parameter, should trigger IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      FizzBuzz.main(Array("NaN"))
    }
  }

  test("Given parameter lower than one, should trigger IllegalArgumentException") {
    intercept[IllegalArgumentException] {
      FizzBuzz.main(Array("0"))
    }
  }

  test("Given parameter, should perform expected FizzBuzz output") {
    val testOutput = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(testOutput)) {
      FizzBuzz.main(Array("15"))
    }

    val outputLines = new String(testOutput.toByteArray).split(System.lineSeparator()).toSeq
    val expected = Array("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz").toSeq
    assert(outputLines == expected)
  }
}
