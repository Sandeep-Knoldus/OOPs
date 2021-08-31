 object Main {
   def main(a: Array[String]) {
     val input_1 = 65
     val input_2 = 75
     val input_3 = 85
     val input_4 = 95
     val input_5 = 11
     val input_6 = 12
     val input_7 = 13
     val input_8 = 14

     val doubleQueue = new DoubleQueue()

     print("Implementing Double-queue \n")
     doubleQueue.enqueue(input_1)
     doubleQueue.enqueue(input_2)
     doubleQueue.enqueue(input_3)
     doubleQueue.enqueue(input_4)
     print(doubleQueue.getQueue + "\n")
     doubleQueue.dequeue
     print(doubleQueue.getQueue + "\n")
     doubleQueue.dequeue
     print(doubleQueue.getQueue + "\n")

     val squareQueue = new SquareQueue()

     print("Implementing Square queue: \n")
     squareQueue.enqueue(input_5)
     squareQueue.enqueue(input_6)
     squareQueue.enqueue(input_7)
     squareQueue.enqueue(input_8)
     print(squareQueue.getQueue + "\n")
     squareQueue.dequeue
     print(squareQueue.getQueue + "\n")
     squareQueue.dequeue
     print(squareQueue.getQueue + "\n")
   }
 }