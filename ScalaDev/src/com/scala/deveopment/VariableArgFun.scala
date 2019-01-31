package com.scala.deveopment

object VariableArgFun extends App {
  
  def printStrings(args: String*) = {
    var i : Int = 0;
    for (arg <- args) {
        println("Arg value[" + i + "] = " + arg )
        i = i + 1;
    }
  }
   
printStrings("SICS", "Scala", "BigData","spark") 
}