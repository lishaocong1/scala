package day02

class privateDemo01 {
  private [this]val hello="张三"
  private var name1=""
  val name2 =""
}
object PrivateTest{
  def main(args: Array[String]): Unit = {
    val pri = new privateDemo01
    pri.name2
  }
}
object privateDemo01{
  //伴生对象也无法访问private[this]修饰的变量
  def main(args: Array[String]): Unit = {
    val pri = new privateDemo01
    pri.name1
  }
}