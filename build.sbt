// build.sbt --- Scala build tool settings

scalaVersion := "2.11.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-Ywarn-adapted-args", "-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-inaccessible")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.5" % "test"

testOptions in Test += Tests.Argument("-oD")

scalariformSettings
