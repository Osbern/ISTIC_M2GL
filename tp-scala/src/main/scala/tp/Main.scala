package tp

/**
 * The code inside this object will be executed when you'll hit `sbt run`
 */
object Main extends App {

  println(Functions.fibonacci(20))
  println(Functions.fibonacciRec(20))
  println(Functions.fibonacciRecTerm(20))

  Functions.show(x => x * x, 1, 2, 3)

  println(IntList())
  val xs = IntList(1, 2)
  println(xs)

  IntList(1, 2, 3, 5).foreach(x => println(x % 2 == 1))

  println(IntList(1, 2, 3).map(x => x + 1))

  println(IntList(1, 2, 3, 4).filter(x => x % 2 == 0))
  println(IntList(1, 2, 3, 4).sum)
  println(IntList(1, 2, 3, 4).product)

  println(IntList(1, 2, 3, 4).fold(0, (x, y) => x + y))
  println(IntList(1, 2, 3, 4).fold(1, (x, y) => x * y))
  
  val cachedOpower = new OPower with Cache
  println(cachedOpower.energy("julien"))
  println(cachedOpower.energy("julien"))
  

}
