name := "LambdaMART"

version := "3.0"

scalaVersion := "2.11.8"
scalaBinaryVersion := "2.11"

dependencyOverrides ++= Set(
  "org.scala-lang" % "scala-library" % scalaVersion.value,
  "org.scala-lang" % "scala-compiler" % scalaVersion.value,
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "2.1.0" % "provided",
  "com.github.scopt" %% "scopt" % "3.5.0"
)
