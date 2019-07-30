package day03

abstract class absValDemo {
  val name:String
}
class absValDemo02 extends absValDemo{
  override val name: String = "Leo"
}
object absValTest{
  def main(args: Array[String]): Unit = {
    val absVal = new absValDemo02
    println(absVal.name)
  }
}