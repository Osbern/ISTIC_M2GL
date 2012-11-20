import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "tp-play"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "org.ow2.easybeans.osgi" % "easybeans-component-smartclient" % "1.2.3"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      resolvers += "Local M2" at Path.userHome.asURL + ".m2/repository"
    )

}
