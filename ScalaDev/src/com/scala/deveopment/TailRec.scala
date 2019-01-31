package com.scala.deveopment

import scala.annotation.tailrec

object TailRec {

  def main(args:Array[String])={
    println("factorial="+ factorial(5)) 
    println("adding message")
    
    
  }
  
  def factorial(n:Int):Int={
    @tailrec
    def fact(i:Int,acc:Int):Int={
    if(i<=1)
       acc
    else
       fact(i-1,i*acc)
  }
    fact(n,1)

    }
}
  