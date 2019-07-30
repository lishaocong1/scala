package day02

class ApplyDemo (val name : String){

}
object ApplyDemo{
  def apply(name:String): ApplyDemo = new ApplyDemo(name)
}
object ApplyTest{
  def main(args: Array[String]): Unit = {
    //不加new的话也是可以的，因为apply进行了一次隐式的调用，实现初始化操作
        val applys = new ApplyDemo("zhangsan")
         applys.name

  }
}