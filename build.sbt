name := """my-playful-prelaunch"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.0"

val playVersion = "2.3.0"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  ws,
  "com.typesafe.play" %% "anorm" % "2.4.0",
  "com.typesafe.play" %% "play" % playVersion,
  "org.webjars" %% "webjars-play" % playVersion,
  "org.postgresql" % "postgresql" % "9.3-1101-jdbc41",
  "org.seleniumhq.selenium" % "selenium-java" % "2.42.2",
  "org.webjars" % "bootstrap" % "3.1.1-2"
)

scalacOptions ++= Seq(
  "-feature",
  "-language:postfixOps" //This allows the postfix operator * to be enabled
)