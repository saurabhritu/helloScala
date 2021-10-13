object DemoFunction {
  def main(args: Array[String]) {
    println("addInt Results: " + addInt(10,7))
    println("Anonymous fun add: " + add(30,50))

    val result = Higher_fun(20, 13, (x,y)=>x+y) // we can use _+_ wildcard in place of anonymous function
    println("Higher order function: " + result)

}
  // Function definition
  def addInt(a:Int = 10, b:Int = 5): Int ={
    var sum:Int = 0
    sum = a + b
//    println("by operator method: " + 8.+(7))
    return sum // if a function doesn't return anything we use Unit Keyword (means void type)
  }

//  Anonymous Function
//  Functions are first class citizens in scala so we can assign it into variables and can use it
  var add = (x: Int, y: Int) => x+y

//  Higher order function
  def Higher_fun(x: Int, y:Int, fun: (Int, Int)=> Int): Int = fun(x,y) // in addition of more params we can use f(f() + New_params) concept without breaking the structure
}
