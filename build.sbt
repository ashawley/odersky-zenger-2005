// build.sbt --- Scala build tool settings

scalaVersion := "2.11.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8", "-Ywarn-adapted-args", "-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-inaccessible")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.6" % "test"

testOptions in Test += Tests.Argument("-oD")

scalariformSettings
