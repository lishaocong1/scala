package day02

import scala.collection.mutable.ArrayBuffer

//1.通过使用if守卫的方式，使用for循环取出非零的偶数
//for(i<- 0 to 10)
class test {
  }
 object test {
  def main(args: Array[String]): Unit = {
       for(i<- 0 to 10 if i%2==0&i!=0){
        print(i)
       }
  }
}
object test1{
 //使用for循环的推导式，取偶数，生成新的集合
 //for(i<- 0 to 10)
 def main(args: Array[String]): Unit = {
     for(i<- 0 to 10 if i%2==0)yield i

 }
}

object test2{
 //使用until函数，实现循环取奇数
 //for(i<- 0 to 10)
 def main(args: Array[String]): Unit = {
     for(i<- 0 until 10 if i%2==1)
      print(i)
 }
}

object test3{
 //4.创建一个5位的空数组
 def main(args: Array[String]): Unit = {
  var arr=new Array[Int](5)
   arr(0)=15
   arr(1)=16
   arr(2)=17
   arr(3)=18
   arr(4)=19
   println(arr.toBuffer)
 }
}
object test4{
  def main(args: Array[String]): Unit = {
        //4.创建一个5位的空数组将空数组赋值然后添加一个新的数组，组合成一个新的数组
        //7.遍历组合后的数组元素，用多种方式实现遍历（最少两种）
      val arr=new ArrayBuffer[Int](5)
      arr+=(1,2,3,4,5)
    print(arr)
    println()
    arr++=Array(6,7,8,9)
    println(arr)
    for(i<- 0 until arr.length) print(arr(i))
    println()
    for(e<-arr)print(e)
  }
}

/**
  * // map案例实战：为List中每个元素都添加一个前缀 “name is”
  *   List("Leo", "Jen", "Peter", "Jack")
  */
object test5{
  def main(args: Array[String]): Unit = {
    val list =List("Leo", "Jen", "Peter", "Jack")
    val list1 = list.map("name is "+_)
    print(list1)
  }
}

/**
  *faltMap案例实战：将List中的多行句子拆分成单词
  *List("Hello World", "You Me")
  */
object test6{
  def main(args: Array[String]): Unit = {
    val list=List("Hello World","You Me")
    println(list.flatMap(_.split(" ")))
  }
}

/**
  * foreach案例实战：打印List中的每个单词
  * List("I", "have", "a", "beautiful", "house")
  */
object test7{
  def main(args: Array[String]): Unit = {
      val list=List("I", "have", "a", "beautiful", "house")
      list.foreach(println(_))
  }
}

/**
  * zip案例实战：对学生姓名和学生成绩进行关联
    List("Leo", "Jen", "Peter", "Jack")
    List(100, 90, 75, 83)
  */
object test8{
  def main(args: Array[String]): Unit = {
      val list1=List("Leo","Jen","Peter","Jack")
      val list2=List(100,90,75,83)
    println(list1.zip(list2))
  }
}