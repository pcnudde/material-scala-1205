import com.twitter.sbt._

name         := "example-5-ostrich"

version      := "0.0.1"

scalaVersion := "2.9.1"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked"
)

resolvers ++= Seq(
   "snapshots" at "http://scala-tools.org/repo-snapshots/"
  ,"releases"  at "http://scala-tools.org/repo-releases/"
  ,"twitter"   at "http://maven.twttr.com/"
)

libraryDependencies ++= Seq(
    "thrift"                   %  "libthrift"         % "0.5.0" from "http://maven.twttr.com/thrift/libthrift/0.5.0/libthrift-0.5.0.jar"
  , "com.twitter"             %% "scrooge-runtime"    % "1.1.3"
  , "com.twitter"             %% "util-core"          % "1.12.13"
  , "com.twitter"             %% "util-eval"          % "1.12.13"
  , "com.twitter"             %% "util-logging"       % "1.12.13"
  , "com.twitter"             %% "ostrich"            % "4.10.5"
  , "com.twitter"             %% "finagle-core"       % "2.0.1"
  , "com.twitter"             %% "finagle-http"       % "2.0.1"
  , "com.twitter"             %% "finagle-thrift"     % "2.0.1"
  , "com.twitter"             %% "finagle-ostrich4"   % "2.0.1"
)

seq(CompileThriftScrooge.newSettings: _*)
