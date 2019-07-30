package day03

/**
  * 在spark中使用了trait来定义了通用的日志打印方法
  */
trait TraitLoggerDemo02 {
  def log(message:String)=message
}
class Loggers(val name:String) extends TraitLoggerDemo02{
  def makeTrait(age:Int): Unit ={
    println(log(name)+" 进行打印log..... "+age)
  }
}
object LoggersTest{
  def main(args: Array[String]): Unit = {
    val loggers=new Loggers("hahah")
    loggers.makeTrait(25)
  }
}