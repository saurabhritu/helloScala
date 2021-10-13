import scala.util.control.Breaks._
class binary_search{

  var B:Array[Int] = Array(5,4,17,6,3,23,56,12)
  var A: Array[Int] = B.sorted

  def display(): Unit ={
    print("B: ")
    for(i <- B){
      print(i + " ")
    }
    println(" ")
    print("A: ")
    for(i <- A){
      print(i + " ")
    }
    println(" ")
  }

  def l_search(x:Int){
    breakable{
      for(i <- B; if x==B(i)){
        println("Linear Search: Element Found on: " + i + " position in B")
        break
      }
    }
  }

  def b_search(x:Int){
    // essential variables
    var el = 0
    var er = A.length
    var mid = 0

    breakable{
      while(true){

        mid = (el + er) / 2 // calculating mid value

        if(x < A(el) || x > A(er-1)){
          println("Binary Search: No Elements Found in A")
          break
        }
        else if(x < A(mid)){
          er = mid
        }
        else if(x > A(mid)){
          el = mid
        }
        else if(x == A(mid)) {
          println("Binary Seaarch: Element found on: " + (mid+1) + " position in A")
          break
        }
      }
    }
  }
}
object SearchAlgo extends binary_search {

  def main(args:Array[String]): Unit ={

    var a = new binary_search()
    a.display()
    a.b_search(20)
    a.l_search(23)
  }
}
