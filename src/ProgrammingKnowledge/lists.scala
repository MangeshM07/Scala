// Scala Lists

// Scala arrays and lists are similar in terms of containing elements of same data types.
// Difference between both
// Arrays are mutable while lists are immutable
// Lists represent linked list while arrays are flat

package ProgrammingKnowledge

object lists {
  val mylist: List[Int] = List(1, 3, 5, 8, 9, 6, 4)
  val names: List[String] = List("Max", "Tom", "John")

  def main(args:Array[String]): Unit ={
     println(mylist)
     println(names)

    println(0 :: mylist)
    println(mylist)

    println(1 :: 5 :: 8 ::Nil)

    println(mylist.head)
    println(mylist.tail)
    println(names.tail)
    println(mylist.reverse)
    println(List.fill(5)(2))
    println(mylist.isEmpty)

    mylist.foreach(println)
    var sum: Int = 0
    mylist.foreach(sum += _)
    println(sum)

    for (name <- names){
      println(name)
    }

  }

}
