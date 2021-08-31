object Main {
  class Person(val name : String, val age : Int){
    def <(that : Person) =
      if (this.name.length()==that.name.length) {
        this.age < that.age
      }
      else {
        this.name.length()<that.name.length
      }
  }
  def main(args: Array[String]): Unit = {
    var a = new Person("test",24)
    var b = new Person("test",25)
    println(a<b)
    var c = new Person("TestAgain",24)
    println(c<b)
  }
}