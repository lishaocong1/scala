package day03

/**
  * 用Scala实现wordCount
  */
object ScalaWC {
  def main(args: Array[String]): Unit = {
    //数据源
    val lines=List("hello tom hello jerry hello lsc hello","hello tom hello lsc","hello tom")
    //把数据切分并压平
    val words= lines.flatMap(_.split(" "))
    //过滤空格
    val filtered = words.filter(_!=" ")
    //生成一个元组:(hello,1)
    val tuples = filtered.map((_,1))
    val grouped: Map[String, List[(String, Int)]] =
      tuples.groupBy(x=>x._1)
    //开始统计分组后相同单词的个数，其实只需要统计单词对应的list长度就可以了
    //val result = grouped.map(x=>(x._1,x._2.size))
    var result=grouped.mapValues(_.size)
    //降序排序
    val reverse = result.toList.sortBy(_._2).reverse
    //打印输出
    println(reverse)
  }
}
