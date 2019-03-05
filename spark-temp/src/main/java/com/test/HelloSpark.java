package com.test;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class HelloSpark {

	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("Sulabh").setMaster("local");
		JavaSparkContext sc = new JavaSparkContext(conf);
		String filePath = "D:/hackathon/avengers/spark-temp/src/main/resources/data/AAPL.csv";
		JavaRDD<String> apple = sc.textFile(filePath);
		System.out.println(apple);
		// first 10 rows
		System.out.println(apple.take(10));
		// count number of rows
		System.out.println(apple.count());
		// first row
		System.out.println(apple.first());
		// get all the rows
		System.out.println(apple.collect());
	}
}
