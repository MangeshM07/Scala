package ProgrammingKnowledge

object scalaFunctions {

  object Math {
    def add(x: Int, y: Int):Int ={
      return x+y
    }

    def square(x: Int)= x*x
  }

  def add(x: Int, y: Int):Int ={
    return x+y
  }

  def subtract(x: Int, y: Int):Int = {
    x-y
  }

  def multiply(x:Int, y:Int):Int= x*y

  def divide(x:Int, y:Int)=x/y

  def main(args:Array[String]): Unit ={
    println(Math.add(45,55))
    println(add(45,55))
    println(subtract(100,30))
    println(multiply(5,10))
    println(divide(10,3))
    println(Math square 9)
  }

}
