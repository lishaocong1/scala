package day02

class day02 {
    private var name="leo";
    def sayhello(): Unit ={
      println("hello"+name)
    }
      def getName=name
}
object HelloWorldTest{
  def main(args: Array[String]): Unit = {
    var world =new day02
    world.sayhello()
    println(world.getName)
  }
}