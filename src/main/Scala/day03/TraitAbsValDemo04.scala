package day03

/**
  * 在trait中定义抽象字段
  */
trait TraitAbsValDemo04 {
  val name:String
  def sayHello(age:Int)=println(name+" "+age)
}
 class pig (val names:String) extends TraitAbsValDemo04{
   val name:String=names
   def getHello(num:Int): Unit ={
      sayHello(num)
   }
 }
 object TraitAbsDemo{
   def main(args: Array[String]): Unit = {
     val pig = new pig("huahua")
     pig.sayHello(5)
   }
 }