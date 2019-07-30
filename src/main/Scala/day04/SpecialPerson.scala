package day04

class SpecialPerson(val name:String)

class Studenteds(val name:String)

class Older(val name:String)

class PersonTest1{
  var number = 0
  def SPecial(p:SpecialPerson): Unit ={
    number += 1
    println("T-"+number)
  }
}
object ImplicitTest{
  def main(args: Array[String]): Unit = {
    import day04.Implicits.object2SpecialPerson
    val zhangsan = new Studenteds("zhangsan")
    val wangwu = new Older("wangwu")
    val personTest = new PersonTest1
    personTest.SPecial(wangwu)
  }
}