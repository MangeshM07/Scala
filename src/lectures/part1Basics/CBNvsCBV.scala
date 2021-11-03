package lectures.part1Basics

object CBNvsCBV extends App {

  def calledByValue(x: Long):Unit = {
    println("By Value: "+x)
    println("By Value: "+x)
  }

  def calledByName(x: => Long):Unit = {
    println("By Name: "+x)
    println("By Name: "+x)

  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite():Int = infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(),34 )
  printFirst(34, infinite())

}
