package day02

class InstanceDemo {

}
class InstanceDemo2 extends  InstanceDemo{

}
object InstanceTest{
  def main(args: Array[String]): Unit = {
    //子类返回父类的类型
    val demo: InstanceDemo = new InstanceDemo2
    //先创建一个InstanceDemo2空类
    var demo02:InstanceDemo2=null
    //接下来进行类型转换，首先进行类型的判断
    if(demo.isInstanceOf[InstanceDemo2]){
      demo02=demo.asInstanceOf[InstanceDemo2]
    }
  }
}