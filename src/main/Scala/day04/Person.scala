package day04

class Person (val name:String) {
  def sayHello=println("hello,i am "+name)
  def makePerson(p:Person): Unit ={
    sayHello
    p.sayHello
  }
}
class Person02(name:String) extends Person(name)
class Party[T<:Person](p1:T,p2:T){
  def play=p1.makePerson(p2)
}
object PersonTest{
  def main(args: Array[String]): Unit = {
    val zs = new Person02("zhangsan")
    val ls = new Person("lisi")
    val py = new Party(zs,ls)
    py.play
  }
}