package day02

/**
  * object相当于class的单个实例，通常在里面放一些静态的变量或者方法
  * 第一次调用object方法时，就会执行object构造器，也就是objec内部不在方法中的代码
  * 但是object不能定义接收参数的构造器
  * 注意：object的构造器只会在第一次调用时执行一次，以后再次调用就不会再次执行构造器了
  */
object ObjectDemo01 {
  private var num=2
  println("this ObjectDemo object!!!!")
  def getNum=num
}
object ObjectTest{
  def main(args: Array[String]): Unit = {
    //通过方法获取里面private声明的变量
    val num = ObjectDemo01.getNum
    println(num)
  }
}