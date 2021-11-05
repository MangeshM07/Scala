package ProgrammingKnowledge

object anonymousFunctions {

  object Math{
    def add(x:Int=45, y:Int=15):Int = {
      return x+y
    }
    def square(x:Int) = x*x
  }
  def main(args:Array[String]): Unit ={
      println(Math.add())
      println(Math.add(60))
      println(Math.add(60,50))

    // Anonymous function
    val add = (x: Int, y: Int) => x+y
    print(add(10,20))

  }
}
