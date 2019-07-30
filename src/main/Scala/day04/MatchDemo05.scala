package day04

object MatchDemo05 {
  def main(args: Array[String]): Unit = {
    val grades=Map("Leo"->"A","Jack"->"b","Jen"->"C")
    val option:Option[String]=grades.get("Leo")
    option match {
      case Some(grade) =>println("your grade is "+grade)
      case None=>println("sorry, your grade information is not in the system ")
    }
  }
}
