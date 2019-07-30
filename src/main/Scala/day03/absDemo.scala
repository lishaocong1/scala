package day03

/**
  * 如果在父类中有某些方法无法立即实现，需要依赖不同的子类来覆盖
  * 重写实现自己不同的方法，此时可以将父类中的这些方法不给出具体的实现，只有方法名字，这种方法叫做抽象方法
  * 而一个类中如果只有一个抽象方法，那么这个类就必须用abstract来声明为抽象类
  * 此时抽象类时不可以被实例化
  */
abstract class absDemo {
    def sayHello:Unit
}
class abstractDemo(name:String) extends absDemo{
  override def sayHello: Unit = {
    println("hello , "+name)
  }
}
object absTest{
  def main(args: Array[String]): Unit = {
    //抽象类不能被实例化
    val arr=new abstractDemo("张三")
    arr.sayHello
  }
}