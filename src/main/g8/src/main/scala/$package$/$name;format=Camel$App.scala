package $package$

import akka.actor.ActorSystem
import akka.cluster.Cluster
import com.typesafe.config.ConfigFactory

object $name$App
  extends App
    with AkkaComponents.Default
    with AkkaClusterComponents.Default
    with $name$Components.Default {

  val port = if (args.isEmpty) "0" else args(0)
  val config = ConfigFactory
    .parseString(s"akka.remote.netty.tcp.port=$port")
    .withFallback(ConfigFactory.load())

  override val actorSystem = ActorSystem("$name$", config)
  override val cluster = Cluster(actorSystem)

  init$name$Components
}
