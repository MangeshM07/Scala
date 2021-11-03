package lectures.part1Basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n<=1) 1
    else {
      println("Computing the factorial of " + n )
      val result = n * factorial(n-1)
      println("Need to calculate factorial of " + (n-1) )

      result
    }

//  println(factorial(5000)) // Will give StackOverflowError

  def anotherFactorial(n : Int): BigInt = {
    @tailrec
    def factorHelper(x: Int, accumulator: BigInt): BigInt ={
      if (x<=1) accumulator
      else factorHelper(x-1, x * accumulator) //TAIL RECURSION = use recursive call as the LAST expression

    }
    factorHelper(n,1)
  }
//  println(anotherFactorial(5000))

//  WHEN YOU NEED LOOPS , USE TAIL_RECURSION.
  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive
  * */

  @tailrec
  def nConcat(aString: String, num: Int, accumulator: String): String = {
    if (num <= 0) accumulator
    else nConcat(aString, num-1, aString + accumulator)

  }
//  println(nConcat("Mangesh", 1,""))

  def nPrime(n: Int): Boolean = {
    @tailrec
    def nCheckPrime(t: Int, accumulator: Boolean): Boolean={
      if (!accumulator) false
      else if (t <= 1) true
      else  nCheckPrime(t-1, n % t != 0 && accumulator)

    }
    nCheckPrime(n/2, true)
  }
  println(nPrime(70))


  def fibonacci(n: Int):Int = {
    def fiboTailRec(i: Int, last : Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailRec(i+1, last + nextToLast, last)
    }
     if (n <= 2) 1
     else fiboTailRec(2,1,1)

  }
  println(fibonacci(8))
}
