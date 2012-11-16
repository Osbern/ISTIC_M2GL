package tp

/**
 * IntList public interface
 */
sealed abstract class IntList {

  def foreach(f: Int => Unit): Unit

  def map(f: Int => Int): IntList

  def filter(p: Int => Boolean): IntList

  def sum: Int

  def product: Int

  def fold(z: Int, op: (Int, Int) => Int): Int

  def forall(p: Int => Boolean): Boolean

  def foldBool(z: Boolean, op: (Int, Boolean) => Boolean): Boolean

}

/**
 * Empty list
 */
class Nil extends IntList {

  override def toString = "nil"

  def foreach(f: Int => Unit) : Unit = {
    
  }

  def map(f: Int => Int): IntList = new Nil

  def filter(p: (Int) => Boolean) = new Nil

  def sum = 0

  def product = 1

  def fold(z: Int, op: (Int, Int) => Int): Int = {
    z
  }

  def forall(p: Int => Boolean): Boolean = ???

  def foldBool(z: Boolean, op: (Int, Boolean) => Boolean): Boolean = ???
}

/**
 * List with a `head` element and a `tail` list
 * @param head Head element
 * @param tail Tail list
 */
class Cons(head: Int, tail: IntList) extends IntList {

  override def toString = head + " :: " + tail

  def foreach(f: Int => Unit) : Unit = {
    f(head)
    tail.foreach(f)
  }

  def map(f: Int => Int): IntList = {
   new Cons(f(head), tail.map(f))
  }

  def filter(p: (Int) => Boolean) = {
    if (p(head))
      new Cons(head, tail.filter(p))
    else
      tail.filter(p)
  }

  def sum = head+tail.sum

  def product = head*tail.product

  def fold(z: Int, op: (Int, Int) => Int) = {
    op(head, tail.fold(z, op))
  }

  def forall(p: (Int) => Boolean) = ???

  def foldBool(z: Boolean, op: (Int, Boolean) => Boolean) = ???
}

/**
 * Convenient factories
 */
object IntList {

  /** @return an empty list */
  def nil: IntList = new Nil

  /** @return a list with a `head` element and a `tail` list */
  def cons(head: Int, tail: IntList): IntList = new Cons(head, tail)

  /** @example IntList(1, 2, 3) */
  def apply(xs: Int*): IntList = xs.foldRight(nil)(cons)

}