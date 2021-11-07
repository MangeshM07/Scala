/*
* Scala - Currying
* Currying is the technique of transforming a function
* that takes multiple arguments into a function
* that takes a single argument
* */

package ProgrammingKnowledge

object functionCurrying {
  def add(x: Int, y:Int) = x+y

  def add2(x:Int) = (y:Int) => x+y

  def add3(x:Int)(y:Int) = x+y

  def main(args:Array[String]): Unit ={
    println(add(20,40))
    println(add2(20)(40))

    val sum40 = add2(40)
    println(sum40(50))

    println(add3(10)(25))

    val sum50 = add3(50)(30)
    println(sum50)

    val sum60 = add3(50)_
    println(sum60(400))
  }
}
