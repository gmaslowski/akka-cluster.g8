package $package$

import akka.actor.ActorSystem

object $classname$Components {

  trait Provides

  trait Requires {
    def actorSystem: ActorSystem
  }

  trait Default
    extends Requires
      with Provides {

    def init$classname$Components: Unit = {
      actorSystem.actorOf(ClusterListener.props)
    }
  }

}
