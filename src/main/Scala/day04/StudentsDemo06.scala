package day04

class StudentsDemo06[T] (val locald:T){
def getLocald(name:T)=println("name is "+name+" local "+locald)
}
object StudentsTest{
  def main(args: Array[String]): Unit = {
    val stu = new StudentsDemo06[Int](210711)
    stu.getLocald(56)
  }
}