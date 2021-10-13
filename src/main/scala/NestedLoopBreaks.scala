import scala.util.control.Breaks
import scala.util.control.Breaks._

object NestedLoopBreaks {
def main(args: Array[String]){
  // instance of Breaks
  val outer = new Breaks
  val inner = new Breaks

  outer.breakable{
    for(i <- 1 to 3){
      inner.breakable{
        for(j <- 1 to 10){
          println(j)
          if(j==4){
            inner.break // break inner loop
//            outer.break // we can break outer loop direct from here by using outer instances
          }
        }
      }
      println("###")
    }
  }
}
}
