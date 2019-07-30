package day02

abstract class objectDemo03(var message:String) {
  def sayHello(name:String):Unit
}
object objectDemo03Test extends objectDemo03("hello") {
  override def sayHello(name: String): Unit = {
    println(message+" "+name)
  }

  def main(args: Array[String]): Unit = {
    objectDemo03Test.sayHello("Leo")
  }
}