lazy val root = (project in file("."))
  .settings(
    organization in ThisBuild := "com.example",
    scalaVersion in ThisBuild := "2.12.8",
    version      in ThisBuild := "0.1.0-SNAPSHOT",
    name := "scala-workshop"
  )
