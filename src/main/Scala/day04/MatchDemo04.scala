package day04

/**
  * 样例类的模式匹配
  * 如果创建样例类的对象不需要用new
  */
class MatchDemo04 {

}
case class Studented(name:String) extends MatchDemo04
case class Teacher(name:String) extends  MatchDemo04
object MatchCaseTest{
  def main(args: Array[String]): Unit = {
    val teacher:MatchDemo04 = Teacher("zhangsan")
    val student:MatchDemo04 = Studented("lisi")
    teacher match {
      case Teacher(name) =>println("teacher ,name is "+name)
      case Studented(name) =>println("student ,name is "+name)
      case _ => println("nothing")
    }
  }
}