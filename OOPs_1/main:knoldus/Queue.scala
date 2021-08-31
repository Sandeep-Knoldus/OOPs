trait Queue {
  var queue: List[Double] = List.empty
  var frontOfQueue: Int = -1
  var rearOfQueue: Int= -1

  def enqueue(item: Double): String = {
    if(rearOfQueue == -1 && frontOfQueue == -1){
      frontOfQueue= frontOfQueue + 1
      rearOfQueue = rearOfQueue + 1
      queue = queue ::: List(item)
      "Item enqueued.."
    }
    else{
      rearOfQueue = rearOfQueue + 1
      queue = queue ::: List(item)
      "Item enqueued.."

    }

  }

  def dequeue: Any = {
    if(frontOfQueue == -1 && rearOfQueue == -1){
      "Empty"
    }
    else if(frontOfQueue == rearOfQueue){
      queue = queue.drop(1)
      frontOfQueue = -1
      rearOfQueue = -1
      "Item dequeued"
    }
    else{
      queue = queue.drop(1)
      frontOfQueue = frontOfQueue + 1
      "Item dequeued"
    }
  }

  def getQueue: List[Double] = {
    queue
  }
}