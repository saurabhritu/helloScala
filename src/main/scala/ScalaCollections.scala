object ScalaCollections {
  def main(args: Array[String]): Unit = {

    //### List ###
    val lst1 = List(1, 3, 5, 2, 4, -7)

    // type safe method
    val lst2: List[Int] = List(1, 2, 4, 3, 7)
    println(lst1.head)
    println(lst1.tail)
    println(lst1.isEmpty)
    println(List.concat(lst1, lst2)) // ::: operator can also be used

    //for loop
    for (x <- lst1) {
      print(x + " ")
    }
    println("")

    //### Set ###
    val Myset: Set[Int] = Set(1, 2, 3, 5, 4, 4, 6, 7, 8)
    var Myset2 = scala.collection.mutable.Set(1, 2, 3, 5, 4, 4, 6, 7, 8, 10)

    println(Myset)
    // adding value to mutable set
    println(Myset2 + 10)

    //traversing set
    println(Myset(8))

    // head, tail & isEmpty applied as List
    println(Myset.head)
    println(Myset.tail)
    println(Myset2.isEmpty)

    println(Myset ++ Myset2) // unique value from both the set

    println(Myset & Myset2) // intersection of two sets
    println(Myset2.max)

    //### Map ###
    val Mymap: Map[Int, String] = Map(171 -> "Saurabh", 172 -> "Ritu", 173 -> "Stacksr", 173 -> "StacksrX")
    println(Mymap)
    println(Mymap(172))
    println(Mymap(173)) // only last assigned value is printed
    println(Mymap.keys)
    println(Mymap.values)

    //for loop (traversing through Map)
    Mymap.keys.foreach {
      key => println(key + " " + Mymap(key))
    }
    println(Mymap.contains(171)) // check for availability for specified key to avoid exception
    // use ++ method to concat two Maps

    //### tuples ###
    // can store hetrogenous data types
    val Mytuple = (1, 2, "Saurabh", true) // they are imutable
    val Mytubple3 = new Tuple3(9, "Ritu", (10, "Stacksr")) // Tuple2, Tuple3 ... is allowed upto 22
    println(Mytuple)
    //    println(Mytuple + Mytubple2) // Learn about this problem
    println(Mytuple._3) // accessing tuple values
    println(Mytubple3._3._2) //  accessing nested tuple elements

    // for loop (using product iterator)
    Mytuple.productIterator.foreach {
      i => print(i + " ")
    }
    println("")

    //Note: In Map the key -> value pair is stored in tuple (Just chaeck this: println(1 -> "hello" -> true)

    //### Options ###
    println(lst1.find(_ > 2)) // return some
    println(lst1.find(_ > 6)) // return None
    println(Mymap.get(171).get) // extract the value from some
    println(Mymap.get(177).getOrElse("No Name Found")) // to overcome not element exception use it

//    //### iterator ### not a collection but way to access the elements of a collection
    val it = Iterator("a", "number", "of", "words")

    while (it.hasNext){
      println(it.next())
    }
  }
}
