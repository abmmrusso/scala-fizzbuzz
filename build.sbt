lazy val root = (project in file(".")).settings(name := "scala-fizzbuzz", version := "1.0")

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.4" % "test"
