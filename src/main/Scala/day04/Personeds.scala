package day04

/**
  * 泛型上下文界定
  * @param name
  */
class Personeds (val name:String) {
  def sayHello=println("Hello I am "+name)
  def mkPerson (p:Personeds): Unit ={
    p.sayHello
  }
}
class Personeds02(name:String)extends Personeds(name)
class Dogs(val name:String)
class Partys[T<% Personeds](p1:T){
  def play=p1.mkPerson(p1)
}
object ViewBoundsTest{
  def main(args: Array[String]): Unit = {
    import day04.dogss.dog2person
    val lisi = new Personeds("lisi")
    val zhaoliu = new Personeds02("zhaoliu")
    val dahuang = new Dogs("dahuang")
    val py = new Partys(dahuang)
    py.play
  }
}
