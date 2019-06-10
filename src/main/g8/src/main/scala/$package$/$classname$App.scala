package $package$

import akka.actor.ActorSystem
import akka.cluster.Cluster
import com.typesafe.config.ConfigFactory

object $classname$App
  extends App
    with AkkaComponents.Default
    with AkkaClusterComponents.Default
    with $classname$Components.Default {

  val port = if (args.isEmpty) "0" else args(0)
  val config = ConfigFactory
    .parseString("akka.remote.netty.tcp.port=" + port)
    .withFallback(ConfigFactory.load())

  override val actorSystem = ActorSystem("$systemname$", config)
  override val cluster = Cluster(actorSystem)

  init$classname$Components
}
