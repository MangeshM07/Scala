package lectures.part1Basics

object Functions extends App {

  def aFunction(a: String, b: Int): String ={
    a + " " + b
  }
    println(aFunction("Hello", 3))

  def aParameterLessFunction(): Int = 33

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(a: String, b: Int): String = {
    if(b==1) a
    else a + aRepeatedFunction(a, b-1)
  }
  println(aRepeatedFunction("Hello", 3))

//  WHEN YOU NEED LOOPS, USE RECURSION.
  val n = 22
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(a : Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }


/*  TASKS:
    1. A greeting function (name, age) => "Hi, I am $name and I am $age years old"
    2. Factorial function
    3. A Fibonacci function
      1 1 2 3
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
    4. Test if a number is prime
*
* */

  def greeting(name: String, age: Int): String = {
    "Hi , I am "+ name + " and I am " + age + " years old"
}
  println(greeting("John", 10))

  def factorial(n: Int): Int = {
    if(n <= 0) 1
    else n * factorial(n-1)
  }
  println(factorial(5))

  def Fibonacci(n : Int): Int = {
    if (n <= 2) 1
    else Fibonacci(n-1) + Fibonacci(n-2)
  }
  println(Fibonacci(3))


  def isPrime(n : Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    }
    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}