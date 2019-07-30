package day04

/**
  * 匹配数组
  */
object MatchDemo03 {
  def main(args: Array[String]): Unit = {
    val arr=Array(1,2,3,4)
    arr match {
      case Array(1,x,y,n)=>println(s"${x},${y},${n}")
      case Array(1,x,y)=>println(s"${x},${y}")
      case _ =>println("nonthing")
    }
  }
}
object MatchList{
  def main(args: Array[String]): Unit = {
    var list=List("leo","jack","jen")
    list match {
      case "leo" :: Nil=>println("Hello")
      case list01 :: list02:: list03::Nil => println("hi "+list01+" hi "+list02
      +" hi, "+list03)
      case _ => println("nothing")
    }
  }
}
