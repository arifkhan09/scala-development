package com.spark.development

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

class WordCount2 {

  def get(url: String,sc:SparkContext):RDD[(String,Int)] = {
      val data = sc.textFile("/user/arif/", 2)
      data.flatMap(x=>x.split(" ")).map(x=>(x,1)).reduceByKey(_+_)
  }
}