package day03

/**
  * 使用while循环将LinkedList中的每个元素都乘以2
  */
object LinkedListDemo {
  def main(args: Array[String]): Unit = {
    var list=scala.collection.mutable.LinkedList(1,2,3,4,5)
    var lists=list
    while(lists!=Nil){
      lists.elem=lists.elem * 2
      lists=lists.next
    }
    list.foreach(print)
  }
}
