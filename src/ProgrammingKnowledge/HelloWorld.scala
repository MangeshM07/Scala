package ProgrammingKnowledge

object HelloWorld {
  def main(args:Array[String]): Unit ={
    val name = "Mark"
    val age = 18.5
    println("Name is "+name+" and age is "+age)
    println(s"$name is $age years old")
    println(f"$name%s is $age%f years old ")
    println(s"Hello \nworld")
    println(raw"Hello \nworld")

  }

}
