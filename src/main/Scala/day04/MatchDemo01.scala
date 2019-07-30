package day04

/**
  * 匹配字符串
  */
object MatchDemo01 {
  def main(args: Array[String]): Unit = {
    val strings ="A"
    strings match {
      case "A" =>println("优秀")
      case "B" =>println("很好")
      case "C" =>println("一般般")
      case _ =>println("还需努力学习啊")
    }
  }
}
