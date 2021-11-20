val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Data Structures and Algorithms in Scala 3",
    organization := "jp.ac.titech.is.prg1",
    organizationName := "MCS.T224: プログラミング第一",
    organizationHomepage := Some(url("https://wakita.github.io/classes/")),
    startYear := Some(2021),
    description := "プログラミング第一外伝（データ構造とアルゴリズム）",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    exportJars := true,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",

    run/fork := true,
    run/connectInput := true,
    Global/cancelable := true,
    Compile/scalaSource := baseDirectory.value/"src",
    Test/scalaSource := baseDirectory.value/"test",
  )
