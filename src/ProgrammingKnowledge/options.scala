package ProgrammingKnowledge
// Options is container that can give 2 values.
// It can give you instance of some or instance of none

object options {
  val lst = List(1, 2, 3)
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John" )
  val opt : Option[Int] = Some(55)
//  val opt : Option[Int] = None

  def main(args:Array[String]): Unit ={

    println(lst.find(_ > 6))
    println(lst.find(_ > 2))
    println(map.get(1))

    println(lst.find(_ > 6).getOrElse("No value found"))
    println(lst.find(_ > 2).get)
    println(map(1))
    println(map.getOrElse(6, "No entry found"))

    println(opt.isEmpty)
  }
}
