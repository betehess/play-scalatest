resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.4")

resolvers += "spray repo" at "http://repo.spray.io"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.2")

addSbtPlugin("fi.gekkio.sbtplugins" %% "sbt-jrebel-plugin" % "0.10.0")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "0.5.0")

addSbtPlugin("com.github.dwhjames" % "sbt-awseb" % "0.1.1")
