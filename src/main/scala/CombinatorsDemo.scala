object CombinatorsDemo {
  def main(args: Array[String]){

    val Number = List(1,3,5,2,4,-7)
    val Number2 = List(11, 13, 12, 17, 45, 50, 35)
    val Number3 = List(2,5,8,9,7,6)
    val Letters = List("A", "B", "C")

    val NumSquare = Number.map((i:Int) => i*2) // map combinators
    println(NumSquare)

    println(Number.reduceLeft(_+_))
//    println(Letters.reduceLeft(_+_))
//    println(Number.reduceLeft((x,y) => {println(x + " , " + y); x+y})

    println(Number.foldLeft(0)(_+_))
//    println(Letters.foldLeft("Z")(_+_))

    println(Number.scanLeft(0)(_+_))
//    println(Letters.scanLeft("Z")(_+_))

    println(Number zip Number2) // Take collection as parameter and return updated collection pair as result

  }
}
