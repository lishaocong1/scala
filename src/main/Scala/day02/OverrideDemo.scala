package day02

class OverrideDemo {
  private var name="张三"
  def getName=name
}
class OverrideStu extends OverrideDemo{
  private var score=100
  //利用override重写父类的方法，通过super来调用父类的getName
  override def getName=score+" "+super.getName
}
object OverrideDemoTest{
  def main(args: Array[String]): Unit = {
    val stu = new OverrideStu
    println(stu.getName)
  }
}