// blank lines are important!

name := "Text Analytics"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.1" % "provided"
)

// additional libraries
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-mllib" % "1.5.1"
)

