package org.apache.spark.deploy.history;

import org.apache.spark.SparkConf;

public class Test {
  public Test() {
    SparkConf conf = new SparkConf();
    org.apache.spark.SecurityManager securityManager =
          new org.apache.spark.SecurityManager(conf);
  }
}
