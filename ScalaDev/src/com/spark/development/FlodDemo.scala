package com.spark.development
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext


object FlodDemo {
  
  def main(args:Array[String])={
    
    val conf = new SparkConf().setAppName("folddemo")
    val sc = new SparkContext(conf)
    
    val l = List(1,2,3,4,5)
    
    val rdd = sc.parallelize(l)
    
    val r =  rdd.fold(0)(_+_)
    
    val pair = List(("sc",("amit",1000)),("km",("ajay",2000)))
    
    val rdd2 = sc.parallelize(pair)
    
    //val r2 = rdd2.foldByKey("dummy",0)((x,y)=>if(x._2>y._2)x else y)
    
  }
}