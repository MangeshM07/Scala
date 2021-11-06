package ProgrammingKnowledge
import java.util.Date

object partiallyAppliedFunctions {
  def log(date: Date, message: String): Unit ={
    println(date + "    " + message)
  }

  def main(args: Array[String]): Unit ={
    val sum = (a: Int, b: Int, c: Int) => a+b+c
    val f = sum(10, _:Int, _:Int)
    println(f(20,100))

    val date = new Date
    val newLog = log(date, _:String)
    newLog("The message 1")
    newLog("The message 2")
    newLog("The message 3")
    newLog("The message 4")

  }
}
