package day03

class classDemo {

}
class classOf02Demo extends classDemo{

}
object classOfTest{
  def main(args: Array[String]): Unit = {
    val demo: classDemo = new classOf02Demo
    println(demo.isInstanceOf[classDemo])
    println(demo.getClass == classOf[classDemo])

    println(demo.getClass == classOf[classOf02Demo])
  }
}