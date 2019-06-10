package $package$

import akka.actor.ActorSystem

object $name$Components {

  trait Provides

  trait Requires {
    def actorSystem: ActorSystem
  }

  trait Default
    extends Requires
      with Provides {

    def init$name$Components: Unit = {
      actorSystem.actorOf(ClusterListener.props)
    }
  }

}
