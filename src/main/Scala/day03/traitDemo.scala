package day03

/**
  * 将trait作为接口使用
  */
trait traitDemo {
  //在trait中可以定义抽象方法，就与抽象类中的抽象方法一样
  //只要不给出方法的具体实现即可
def sayHello(name:String)
}
trait MakeTrait{
  def makeTrait(age:Int)
}
class Traits(val name:String) extends traitDemo with MakeTrait{
  override def sayHello(name: String): Unit = {
      println("Hello , "+name)
  }

  override def makeTrait(age: Int): Unit = {
      println("Hello , "+name +age)
  }
}
object traitTest{
  def main(args: Array[String]): Unit = {
    val traits = new Traits("lisi")
    println(traits.name)
    traits.sayHello("李四")
    traits.makeTrait(23)
  }
}