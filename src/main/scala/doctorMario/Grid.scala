package doctorMario


class Grid {
 // 8 by 16
  private var _currentPill = new Pill
  private var _entities = _currentPill :: List.fill(10)(new Virus(util.Random.nextInt(8),
    util.Random.nextInt(16)))

  private var up = false
  private var down = false
  private var left = false
  private var right = false
  private var space = false

  val moveInterval = 0.1
  private var moveDelay = 0.0

  def entities = _entities

  def currentPill = _currentPill

  def update(delay: Double): Unit = {
    moveDelay += delay
    if (moveDelay >= moveInterval) {
      if (left) _currentPill.move(-1)
      if (right) _currentPill.move(1)
      moveDelay = 0.0
    }
    _currentPill.update(delay)
  }

  def upPressed(): Unit = up = true
  def upReleased(): Unit = up = false
  def downPressed(): Unit = down = true
  def downReleased(): Unit = down = false
  def leftPressed(): Unit = left = true
  def leftReleased(): Unit = left = false
  def rightPressed(): Unit = right = true
  def rightReleased(): Unit = right = false
  def spacePressed(): Unit = space = true
  def spaceReleased(): Unit = space = false
  
   
  def isClear(locations: List[(Int, Int)]): Boolean = {
    ???
  }
}