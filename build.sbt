name := "scalacheck on scalatest"

organization := "net.ssanj"

version := "0.0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"   % "2.2.6"  % "test",
  "org.scalacheck" %% "scalacheck"  % "1.12.5" % "test",
  "org.pegdown"    %  "pegdown"     % "1.6.0"  % "test"
)

scalacOptions ++= Seq(
                      "-unchecked",
                      "-deprecation",
                      "-feature",
                      "-Xfatal-warnings",
                      "-Xlint:_",
                      "-Ywarn-dead-code",
                      "-Ywarn-inaccessible",
                      "-Ywarn-unused-import",
                      "-Ywarn-infer-any",
                      "-Ywarn-nullary-override",
                      "-Ywarn-nullary-unit"
                     )


testOptions in Test ++= Seq(Tests.Argument(TestFrameworks.ScalaTest, "-o"), Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports"))