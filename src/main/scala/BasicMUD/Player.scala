package BasicMUD


class Player(name:String, location:String, items: Item) {
  // commands: get Item; search Room, 
  def parseCommand(command:String):String = {
    ???
  }
  
  def processCommand(command: String): Unit = {
  
  }

  def getFromInventory(itemName: String): Option[Item] = {
    ???
  }

  def addToInventory(item: Item): Unit = {

  }
  
  def inventoryListing(): String = {
    ???
  }
  
  def move(dir: String): Unit = {

  }
  def searchRoom(command: String, room:Array[Int]):List[Item] =  {
    ???
  }
}