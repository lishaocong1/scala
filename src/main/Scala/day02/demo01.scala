package day02

/**
  * 辅助构造器
  */
class demo01 {
    var name =""
  var age=0
  def this(name:String){
    this()
    this.name=name
    print("123")
  }
  def this(name:String,age:Int){
      this(name)
    this.age=age
    println("321")
  }
}
object demo01Test{
  def main(args: Array[String]): Unit = {
    val test = new demo01("Leo",23)
  }
}