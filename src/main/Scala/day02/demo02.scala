package day02

/**
  * 主构造器
  * @param name
  * @param age
  */
class demo02(val name:String,val age:Int) {
  println(name+" "+age)
}
object demo02Test{
  def main(args: Array[String]): Unit = {
    val test = new demo02("张三",20)
  }
}
class demo022(val name:String,val age:Int=20){
  println(name+" "+age)
}