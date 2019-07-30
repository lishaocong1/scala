package day02

object EnumDemo extends Enumeration {
  val Spring=Value(0,"spring")
  val Summer=Value(1,"summer")
  val autumn=Value(2,"autumn")
  val winter=Value(3,"winter")
}
object EnumTest{
  def main(args: Array[String]): Unit = {
    //println(EnumDemo(0))
    //println(EnumDemo.withName("spring"))
    //进行循环遍历枚举
    for(i<-EnumDemo.values)println(i)
  }
}