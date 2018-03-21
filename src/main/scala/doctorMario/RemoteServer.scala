package doctorMario

@remote trait RemoteServer {
  def connect(client: RemoteClient): RemoteGrid
}