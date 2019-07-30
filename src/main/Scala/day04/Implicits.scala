package day04

object Implicits {
  implicit def object2SpecialPerson(obj:Object):SpecialPerson={
    if(obj.getClass == classOf[Studenteds]){
      val stu = obj.asInstanceOf[Studenteds]
      new SpecialPerson(stu.name)
    }else if (obj.getClass == classOf[Older]){
      val older = obj.asInstanceOf[Older]
      new SpecialPerson(older.name)
    }else null
  }
}
