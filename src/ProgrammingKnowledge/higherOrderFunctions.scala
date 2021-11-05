package ProgrammingKnowledge

object higherOrderFunctions {

    //Higher order Functions are those functions which can take functions as their arguments and return function as their result
    def math(x: Double, y: Double, f:(Double, Double)=>Double):Double = f(x,y)
    def math1(x: Double, y:Double, z:Double, f: (Double, Double) => Double):Double = f(f(x,y),z)

    def main(args:Array[String]): Unit = {
      val result = math(15,90,(x,y)=>x*y)
      println(result)

      val minimum = math(15,90,(x,y)=>x min y)
      println(minimum)

      val maximum = math(15,90,(x,y)=>x max y)
      println(maximum)

      val result1 = math1(15,90,100,(x,y)=>x*y)
      println(result1)
      // OR
      val result2 = math1(15,90,100,_*_)
      println(result2)

      val minimum1 = math1(15,90,66,(x,y)=>x min y)
      println(minimum1)

      val maximum1 = math1(15,90,99,(x,y)=>x max y)
      println(maximum1)



    }
}
