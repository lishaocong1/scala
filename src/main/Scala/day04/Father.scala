package day04

/**
  * 泛型：下边界
  */
class Father(val name:String) {

}
class Child(name:String) extends Father(name)
class FatherAndChild{
  def getFC[R>:Child](r:R): Unit ={
    if (r.getClass==classOf[Child]){
      println("领取成功！")
    }else if (r.getClass==classOf[Father]){
      println("先签字，在领取")
    }else{
      println("sorry,你没有领取的资格！")
    }
  }
}
object  FatherAndChildTest{
  def main(args: Array[String]): Unit = {
    val father=new Father("father")
    val child =new Child("child")
    val fc = new FatherAndChild
    fc.getFC(father)
  }
}