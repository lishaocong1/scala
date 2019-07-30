package day03

/**
  *在trait中定义抽象字段
  */
trait TraitValDemo03 {
  val num:Int=2
}
class dog(val name:String) extends TraitValDemo03{
  def sayHello=println("Hi,I am " +name+" i have "+num+"eyes")
}
object dogTest{
  def main(args: Array[String]): Unit = {
    val dog=new dog("dahuang")
    dog.sayHello
  }
}