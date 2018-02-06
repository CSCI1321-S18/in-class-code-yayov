package doctorMario


class Pill extends Entity {
 private var x = 3
  private var y = 0
  val interval = 1.0
  private var delaySum = 0.0
  
  val _colors = List(Block.Colors(util.Random.nextInt(3)),
      Block.Colors(util.Random.nextInt(3)))
  
  def colors: List[Block.Colors.Value] = _colors
  
  def locations: List[(Int, Int)] = List((x, y), (x+1, y))
  
   def selfSupporting: Boolean = false
  
  def move(dx: Int): Unit = {
    val oldx = x
    x += dx
    if(!locations.forall(p => p._1 >= 0 && p._1 < 13)) {
      x = oldx
    }
  }
  
  def update(delay: Double): Unit = {
    delaySum += delay
    if(delaySum >= interval) {
      y += 1
      delaySum = 0.0
    }
  }
}