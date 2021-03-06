package tp

import concurrent.{ Await, Future }
import concurrent.ExecutionContext.Implicits.global
import concurrent.duration._
import java.util.Date

class OPower {
  def energy(person: String): Int = {
    val future = Future {
      Thread.sleep(1000)
      (math.random * 5000).toInt
    }
    Await.result(future, 2.seconds)
  }
}

trait Cache extends OPower {
  var cache: Option[(Date, Int)] = None

  override def energy(person: String) = {
    cache match {
      case Some((t, b)) if (t.getTime + 10000 > new Date().getTime ) => {
        b
      }
      case _ => {
        val time = new Date()
        val e = super.energy(person)
        cache = Some(time, e)
        e
      }
    }
  }
}

trait RichOPower extends OPower {
  def energyInJoules(person: String): Int = {
    val e = super.energy(person)
    e * 3600
  }
}

class RichOPowerCached extends OPower with Cache with RichOPower {

}