package ProgrammingKnowledge

object forLoops {
  def main(args:Array[String]): Unit ={

    for (i <- 1 to 5)
      println(i)


    for (i <- 1 until 6 ){
      println("i is "+i)
    }

    for (i <- 1 until 4; j <- 1 to 5){
      println("Value of i is "+i+" Value of j is "+j)
    }

    val lst = List(1,2,3,4,5,6,7,8,9)
    for (item <- lst){
      println("Item is "+item)
    }

    for (i <- lst; if i>6){
      println("Value is "+i)
    }

    val result = for {i <- lst; if i < 5} yield (i*i)

    println(result)

    val nresult = for {
      i <- lst
      if i < 5}
      yield (i*i)


    println(nresult)
  }

}
