package day02

/**
  *伴生类
  */
class objectDemo02(x:Int,y:Int) {
  def getObject: Unit ={
    println(x+" "+y+" "+objectDemo02.age+" "+objectDemo02
      .name)
  }
}

/**
  * 伴生对象
  */
object objectDemo02{
  private val name ="张三"
  private  val age=20
}
object ObjectDemo02Test{
  def main(args: Array[String]): Unit = {
    val demo = new objectDemo02(99,88)
    demo.getObject
    //在普通的对象中无法访问private修饰的变量
    //objectDemo02.name
  }
}