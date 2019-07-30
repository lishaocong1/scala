package day03

class MyClass {
  def printMsg(msg:String)=println(msg)
}
trait MyTrait extends MyClass{
  def log(msg:String)=println("log "+msg)
}
class MyTrait02(val name:String) extends MyTrait{
  def sayHello: Unit ={
    log(name+"000")
    printMsg(name+"111")
  }
}
object MyTraitTest{
  def main(args: Array[String]): Unit = {
    val myTrait = new MyTrait02("A")
    myTrait.sayHello
  }
}