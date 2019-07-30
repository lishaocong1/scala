package day02

class extendsDemo01 {
  var name1="lsc"
  private var name="leo"
  def getName=name
}
class extendsDemo011 extends extendsDemo01{
  private var score="100"
  def getScore =score
}
object extendsDemoTest{
  def main(args: Array[String]): Unit = {
    val demo = new extendsDemo011
    println(demo.getName)
    println(demo.getScore)
    println(demo.name1)
  }
}