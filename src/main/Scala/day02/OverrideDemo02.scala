package day02

/**
  * 覆盖变量
  */
class OverrideDemo02 {
  val name ="李四"
  def age=0
}
class Overridestu02 extends OverrideDemo02{
  override val name:String="leo"
  override def age: Int = 30
}
object OverrideTest02{
  def main(args: Array[String]): Unit = {
    val o = new OverrideDemo02
    println(o.name)
    println(o.age)
    val os = new Overridestu02
    println(os.name)
    println(os.age)
  }
}