package com.scala.deveopment

abstract class abstractDemo {
  
  def mod
  def display(a:String){
    println("from display")
  }
}

abstract class abst{
  def add
}

class child2 extends abstractDemo{
  
  def mod{
    println("from mod")
  }
}

object Test2{
  
  def main(args:Array[String])={
    val obj = new child2
    obj.mod
    obj.display("")
  }
}