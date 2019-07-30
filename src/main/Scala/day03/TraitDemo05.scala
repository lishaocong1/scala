package day03

/**
  * 混合使用具体方法和抽象方法
  */
trait TraitDemo05 {
  def getName:String
  def valid:Boolean={
      getName=="leo"
  }
}
class Names(val name:String) extends TraitDemo05{
  override def getName:String= name
  println(valid)
}
object NamesTest{
  def main(args: Array[String]): Unit = {
    val names=new Names("jack")
    println(names.getName)
  }
}