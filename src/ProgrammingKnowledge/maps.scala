package ProgrammingKnowledge

// Map is a collection of key value pair
// Key is unique
object maps {
  val mymap: Map[Int, String] = Map(1 -> "Kane", 2 -> "Tim", 3 -> "Jimmy", 3 -> "Jimmy Nesham")
  val mymap2: Map[Int, String] = Map(4 -> "Darrell Mitchell", 5 -> "Trent Bolt")

  def main(args: Array[String]): Unit ={
    println(mymap)
    println(mymap(3))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)

    mymap.keys.foreach { key =>
      println("Key: " + key + "  Value: " + mymap(key))
    }

    println(mymap.contains(7))
    println(mymap.contains(3))

    println(mymap ++ mymap2)
    println(mymap.size)
  }
}
