// Scala - Reduce, fold or scan (Left/Right)
// reduceLeft, reduceRight, foldLeft, foldRight, scanLeft, scanRight
package ProgrammingKnowledge

object reduce_fold_scan {
  val lst1 = List(1,2,3,5,7,10,13)
  val lst2 = List("A", "B", "C")

  def main(args:Array[String]): Unit ={
    //Reduce
    println(lst2.reduceLeft(_+_))
    println(lst1.reduceLeft(_+_))

    //println(lst2.reduceLeft(_ - _))
    println(lst1.reduceLeft(_-_))

    println(lst2.reduceRight(_+_))
    println(lst1.reduceLeft((x,y) => {println(x +","+ y); x+y}))

    //fold
    println(lst1.foldLeft(0)(_ + _))
    println(lst1.foldLeft(141)(_ + _))
    println(lst2.foldLeft("z")(_ + _))

    //scan
    println(lst1.scanLeft(100)(_+_))
    println(lst2.scanLeft("z")(_+_))








  }
}
