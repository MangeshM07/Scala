package lectures.part1Basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
//  Math Expression and its operators are + - * % / | << >> >>>(right shift with zero extension)

  println(1 == x)
//  == != > >= < <= - RELATIONAL OPERATORS

  println(!(1 == x))
//  ! && ||

  var aVariable = 2
  aVariable += 3
  println(aVariable)

// Instructions(DO) vs Expressions(VALUE)

//  IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 100 else 200 // IF expression
  println(aConditionedValue)
  println(if(aCondition) 100 else 200)

//  NEVER write below again
  var i = 10
  while (i > 0) {
    println(i)
    i -= 1
  }

//  Everything in scala is an expression

  val aWeirdValue = (aVariable = 3)  // Unit === void
  println(aWeirdValue)

//  Side effects : println(), whiles, reassigning

//  Code blocks
  val codeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "Goodbye"
  }

//  Exercises below
  val someValue = {
    2 < 3
  }
  println(someValue)

  val someotherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someotherValue)
}
