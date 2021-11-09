package ProgrammingKnowledge

import scala.collection.mutable

// set is a collection  of different elements of same data type.
// set cannot have duplicate values inside them.
// set can be mutable and immutable.
// sets are not ordered
// sets cannot be indexed
object sets {
  // Immutable set
  val myset : Set[Int] = Set(1,54,65,3,5,7,9,4)
  val myset2: Set[Int] = Set(32,54,65,53,86,98)

  //Mutable set
  val mutset: mutable.Set[Int] = scala.collection.mutable.Set(1,5,6,3,5,7,9,4)

  def main(args:Array[String]): Unit ={
    println(myset+10)
    println(myset)
    println(myset(8))
    println(myset.head)
    println(myset.tail)
    println(myset.isEmpty)
    //concat two sets
    println(myset.concat(myset2))
    println(myset ++ myset2)
    println(myset.++( myset2))

    //Intersection between two sets
    println(myset.&(myset2))
    println(myset & myset2)
    println(myset.intersect(myset2))

    println(myset.max)
    println(myset.min)

    for (x <- myset){
      println(x)
    }

    myset.foreach(println)

    println(mutset)
  }

}
