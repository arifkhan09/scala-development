package com.scala.deveopment

class Point(val xc: Int, val yc: Int) {
    var x: Int = xc
    var y: Int = yc
}
object Point{
      def main(args:Array[String])={
        
        val p = new Point(4,5)
        println(p.x +" " + p.y)
      }
    }