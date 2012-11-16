package tp

import annotation.tailrec

object Functions {

  def fibonacci(n: Int): Int = {
    var u0 = 0;
    var u1 = 1;
    var un = u1;
    var i = n;

    while (i >= 2) {
         un = u0 + u1;
         u0 = u1;
         u1 = un;
         i = i - 1;
    }
    return un; 
  }

  def fibonacciRec(n: Int): Int = {
    if (n <= 0)
      0
    else if (n <= 2)
      1
    else
    	fibonacciRec(n-1) + fibonacciRec(n-2)
  }
  
  def fibonacciRecTerm(n: Int, i : Int = 1, j : Int = 0): Int = {
    if (n == 0)
      j
    else
    	fibonacciRecTerm(n-1, j, i+j)
  }

  def show(f: Int => Int, xs: Int*): Unit = {
    for (x <- xs) {
      println(f(x))
    }
  }

}
