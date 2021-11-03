package lectures.part1Basics

import java.security.KeyStore.TrustedCertificateEntry

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

//  VALS are immutable

//  COMPILER can infer types

  val aString: String = "MM"

//  Semi colon after declaration is optional. It is used to separate 2 declarations in same line
  val bString = "Hello"; val cString = "world"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Integer = x
  val ashort: Short = 4433
  val aLong: Long = 53430980332435L
  val aFloat: Float = 43.42f
  val aDouble: Double = 3.14

  // Variables
  var aVariable: Int = 56

  aVariable = 65  // side effects
  println(aVariable)

}
