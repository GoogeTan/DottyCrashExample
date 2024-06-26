import scala.collection.Seq

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.2"
/*
lazy val root = (project in file("."))
  .settings(
    name := "deco4s",
    idePackagePrefix := Some("me.zahara")
  )*/

lazy val common = (project in file("./common"))
  .settings(
    name := "common",
    idePackagePrefix := Some("me.katze.deco4s.common"),
    libraryDependencies := defaultLibraries
  )

lazy val layout = (project in file("./layout"))
  .settings(
    name := "layout",
    idePackagePrefix := Some("me.katze.deco4s.layout"),
    libraryDependencies := defaultLibraries
  ).dependsOn(common)


def defaultLibraries = Seq(
  "org.typelevel" %% "cats-mtl" % "1.4.0",
)
