package day04
//统计所有单词的总数
object
ScalaWordCounts {
  def main(args: Array[String]): Unit = {
    //使用scala的io包将文件内容的数据读取出来
    val lines01=scala.io.Source.fromFile("D:\\a.txt").mkString
    val lines02=scala.io.Source.fromFile("D://b.txt").mkString
    //将两个文件的数据放入List集合中
    val lines=List(lines01,lines02)
    //接下来就进行单词总数的统计了
    val result = lines.flatMap(_.split("\n")).flatMap(_.split(" ")).map((_,1)).map(_._2).reduceLeft(_+_)
    //进行打印操作
    println(result)
  }
}
