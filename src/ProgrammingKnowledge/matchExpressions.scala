package ProgrammingKnowledge

object matchExpressions {
  def main(args:Array[String]): Unit ={
    val age = 30

    age match {
      case 10 => println(age)
      case 20 => println(age)
      case 25 => println(age)
      case 30 => println(age)
      case 32 => println(age)
      case _ => println("default")
    }
    val result = age match {
      case 10 => age
      case 20 => age
      case 25 => age
      case 30 => age
      case 32 => age
      case _ => "default"
    }

    println("Result is "+result)

    val i=7
    i match{
      case 1|3|5|7|9 => println("Given number is odd")
      case 2|4|6|8   => println("Given number is even")
    }
  }

}
