package ProgrammingKnowledge

// Tuples is a class that can contains elements of different data types
// Fixed size, immutable
object tuples {
  val mytuple = (1, 2, "hello", true )
  val mytuple2 = new Tuple3(101, 102, "T20") // Tuple3 since it contains 3 elements
  val mytuple3 = new Tuple6(1, 2, 4, ("Germany", "Berlin"), true, "Maxwell")
  def main(args: Array[String]): Unit ={
    println(mytuple)
    println(mytuple2)
    println(mytuple3)

    println(mytuple3._1)
    println(mytuple3._2)
    println(mytuple3._3)
    println(mytuple3._4)
    println(mytuple3._5)

    println(mytuple3._4._2)
    println(mytuple3._4._1)

    mytuple.productIterator.foreach{
      i => println(i)
    }

    println(1 -> "Tom")
    println(2 -> "Rock" -> "Dwayne")

  }
}
