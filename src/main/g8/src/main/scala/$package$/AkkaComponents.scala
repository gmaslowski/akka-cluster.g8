package $package$

import akka.actor.ActorSystem
import com.typesafe.config.Config

object AkkaComponents {

  trait Provides {
    def actorSystem: ActorSystem
  }

  trait Requires {
    def config: Config
  }

  trait Default
    extends Requires
      with Provides

}
