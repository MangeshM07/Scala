package ProgrammingKnowledge

object loops {
  def main(args:Array[String]): Unit ={
    var x = 0;

    while (x < 10){
      println("x = "+x)
      x = x+1
    }

    var y=0;
    do{
      println("Y ="+y)
      y+=1
    }while(y<10)
  }

}
