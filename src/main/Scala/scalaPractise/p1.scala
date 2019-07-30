package scalaPractise

import scala.collection.mutable.ArrayBuffer

/**
  * 算法案例：移除第一个负数之后的负数
  */
class p1 {
}
object p1test{
  def main(args: Array[String]): Unit = {
    val a=ArrayBuffer[Int]()
    a+=(1,2,3,4,5,-1,-3,-5,-9)
    var flag=true
    var arrayLenth=a.length
    var index=0
    while(index<arrayLenth){
      if (a(index)>=0){
        index+=1
      }else
      {
        if (flag){
          flag=false
          index+=1
        }else{
          a.remove(index)
          arrayLenth-=1
        }
      }
    }
    print(a)
  }
}