package multithreading

import akka.actor.Actor
import akka.pattern._
import scala.concurrent.duration._
import akka.util.Timeout

/**
 * This actor represents one pixel that can float around until it sticks in place.
 */
class CrystalFloaty extends Actor {
  implicit val timeout = new Timeout(1.seconds)
  implicit val ec = context.dispatcher
  
  import CrystalFloaty._
  def receive = {
    case m =>
      println("Got a message floaty doesn't process: m")
  }
}

/**
 * I put the messages that can be sent to an actor in the companion object for that actor.
 * This isn't required, but it helps organize things and makes it more clear.
 */
object CrystalFloaty {
}