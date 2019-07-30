package day02

//内部会有默认的get和set方法
class student {
      var name="leo"
}
object StudentTest{
  def main(args: Array[String]): Unit = {
    val stu = new student
    stu.name="12222"
    println(stu.name)
  }
}