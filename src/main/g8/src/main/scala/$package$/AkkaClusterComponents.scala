package $package$

import akka.cluster.Cluster

object AkkaClusterComponents {

  trait Provides {
    def cluster: Cluster
  }

  trait Requires
    extends AkkaComponents.Provides

  trait Default
    extends Requires
      with Provides
}
