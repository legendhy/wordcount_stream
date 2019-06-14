package parseLog

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession


class parseLog {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org.apache.spark").setLevel(Level.ERROR)

    val spark = SparkSession.builder().appName("parse imooc log")

  }
}
