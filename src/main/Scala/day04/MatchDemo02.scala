package day04

import scala.util.Random

/**
  * 用模式匹配进行匹配类型
  */
object MatchDemo02 {
  def main(args: Array[String]): Unit = {
    val cc=new CaseClass
    val arr=Array("String",12,true,cc)
    val arr2 = arr(Random.nextInt(arr.length))
    arr2 match {
      case  str:String => println("match string"+s"${str}")
      case  int:Int=>println("match Int"+s"${int}")
      case bool:Boolean=>println("match boolean")
      case caseclass:CaseClass=>println("match caseclass")
      case _=>println("nothing......")
     }
    }
}
class CaseClass