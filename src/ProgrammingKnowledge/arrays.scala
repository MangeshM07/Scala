package ProgrammingKnowledge
import Array._

object arrays {
  val myarray : Array[Int] = new Array[Int](4)
  val myarray2 = new Array[Int](5)
  val myarray3 = Array(1,2,3,4)

  def main(args:Array[String]): Unit ={
    myarray(0) = 20
    myarray(1) = 30
    myarray(2) = 45
    myarray(3) = 12

    for (x <- myarray2){
      println(x)
    }

    for (i <- 0 to (myarray.length-1)){
      println(myarray(i))
    }

    for (i <- 0 to myarray3.length-1){
      println(myarray3(i))
    }

    val result = concat(myarray, myarray3)
    for (i <- result){
      println(i)
    }


  }
}
