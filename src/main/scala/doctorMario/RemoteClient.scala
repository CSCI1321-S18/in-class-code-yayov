package doctorMario

@remote trait RemoteClient {
  def drawStuff(myGrid: PassableGrid, theirGrid: PassableGrid): Unit
}