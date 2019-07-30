package day04

object dogss {
  implicit  def dog2person(dog:Object):Personeds=
    if(dog.isInstanceOf[Dogs]){
      val dogs = dog.asInstanceOf[Dogs]
      new Personeds(dogs.name)
    }else{
      Nil
    }
}
