package scalaPractise

import scala.collection.mutable.ArrayBuffer

/**
  * 需求：当前字段只切割第一个空格的数据，以元组的形式返回
*需求结果展示（a0000038db0c302，com.yunlian.wewe,com.octinn.birthdayplus com.
*elinkway.infinitemovies）
  */
object day03Test {
  def main(args: Array[String]): Unit = {
    val strings = Array("a0000038db0c302 com.yunlian.wewe,com.octinn.birthdayplus com.elinkway.infinitemovies")
    val buffer = strings.toBuffer
    val array= buffer.flatMap(_.split(" ",2))
    val tuple1=(array(0),array(1))
    print(tuple1)
  }

}