class SquareQueue extends Queue {
  override def enqueue(item: Double): String = {
    if(rearOfQueue == -1 && frontOfQueue == -1){
      frontOfQueue= frontOfQueue + 1
      rearOfQueue = rearOfQueue + 1
      queue = queue ::: List(item * item)
      "Item enqueued.."
    }
    else {
      rearOfQueue = rearOfQueue + 1
      queue = queue ::: List(item * item)
      "Item enqueued.."
    }
  }
}