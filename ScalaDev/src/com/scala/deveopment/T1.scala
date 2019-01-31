package com.scala.deveopment

trait T1 {
  def show
  def mod(){
    println("from trait")
  }
}

trait T2{
  def display
}
class child extends T1 with T2{
     def show (){
     println("show")
   }

def display{
  println("from display")
   }
}

object Test{
  
  def main(args:Array[String])={
    
    val obj = new child
    
    obj.show
    obj.mod()
    
    
  }
}