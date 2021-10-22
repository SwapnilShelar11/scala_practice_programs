name := "Practice_Project"

version := "0.1"

scalaVersion := "3.0.1"


libraryDependencies += "org.scalameta" %% "munit" % "0.7.27"
libraryDependencies += "org.scalameta" %% "munit-scalacheck" % "0.7.28" % Test
testFrameworks += new TestFramework("munit.Framework")
