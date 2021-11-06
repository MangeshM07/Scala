package ProgrammingKnowledge

/* A closure is a function which uses one or more variables
* which are declared outside the main function
*
* Pure Closure -> Variable declared as val is called as pure closure
* Impure closure -> variable declared as var is called as impure closure
*  */

object closures {

  var number = 100
  val add = (x : Int )=> {
    number = x + number
    number
  }
  def main(args: Array[String]): Unit ={
    number = 5
    println(add(55))
    println(number)

  }
}
