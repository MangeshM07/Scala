package ProgrammingKnowledge

// Map method is used to iterate over a collection(list/array/set/..) and then apply a function to each
// element of that collection.
object higher_order_methods {
  val lst = List(1, 2, 3)
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John" )

  def main(args: Array[String]): Unit ={
    //Map examples
    println(lst.map(_ * 2))
    // OR
    println(lst.map(x => x * 2))

    println(lst.map(x => x + 10))

    println(lst.map(x => "hi"*x))

    println(mymap.map(x => "hi" + x))

    println(mymap.view.mapValues(x => "hi"+x))

    println("hello".map(_.toUpper))

    //Flatten
    println(List(List(1,2,3), List(3,4,5)))
    println(List(List(1,2,3), List(3,4,5)).flatten)

    //flatmap
    println(lst.flatMap(x => List(x, x+1)))
    println(lst.map(x => List(x, x+1)))

    println(lst.filter(x => x%2 !=0))
  }
}
