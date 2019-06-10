val akkaV = "2.5.22"
val logbackV = "1.2.3"

scalaVersion := "2.12.8"

organization := "$package$"
name := "$systemname$"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "com.typesafe.akka" %% "akka-slf4j" % akkaV,
  "com.typesafe.akka" %% "akka-cluster" % akkaV,
  "ch.qos.logback" % "logback-classic" % logbackV,
)

fork in run := true

mainClass in(Compile, run) := Some("$package$.$classname$ClusterApp")
