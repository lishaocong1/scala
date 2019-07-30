package day04

class contextBounds [T:Ordering](val number1:T,val number2:T) {
  def  max(implicit ordering: Ordering[T])=
    if (ordering.compare(number1,number2)>0) number1 else number2
}
object contextTest{
  def main(args: Array[String]): Unit = {
    val context = new contextBounds(5,8)
    println(context.max)
  }
}