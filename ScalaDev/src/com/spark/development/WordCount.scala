package com.spark.development

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCount {
  
  def main(args:Array[String])={
    
    val conf = new SparkConf().setAppName("wordcount")
    
    val sc = new SparkContext(conf)
    
    val data = sc.textFile("/user/arif/", 2)
    
    val result = data.flatMap(x=>x.split(" ")).map(x=>(x,1)).reduceByKey(_+_)
    
    result.collect().foreach(println)
  }
}