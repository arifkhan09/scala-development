package com.scala.deveopment

object Curring extends App {
  
  
  def adder(m: Int)(n: Int)(p: Int) = m + n + p

val currAdder = adder _

val add2 = currAdder(2)

val add5 = add2(3)

println(add5(10))
  println("adding message")
}
