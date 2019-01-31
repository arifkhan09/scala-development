package com.scala.deveopment

object HigherOrderFun {
  def main(args:Array[String])={
    
  println(apply(square_layout, 10))
println(apply(curly_layout, 10.2))
  }
  
  def apply(f :Any=>String,v:Any)=f(v)
  
  def square_layout(x:Any)= { "[" + x.toString() + "]"}
  
  def curly_layout(x:Any)={ "{" + x.toString() + "}" }
  
    

}