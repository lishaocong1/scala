package day03

/**
  * 用递归的方法来给List中的每个元素加上指定的前缀，并打印上前缀的元素
  */
class ListNameDemo {
  def Lists(list:List[Int],x:String): Unit ={
    if (list!=Nil){
        println(x+list.head)
        List(list.tail,x)
    }
  }
}
object ListTest{
  def main(args: Array[String]): Unit = {
    val lists=new ListNameDemo
    lists.Lists(List(1,2,3,4),"+")
  }
}