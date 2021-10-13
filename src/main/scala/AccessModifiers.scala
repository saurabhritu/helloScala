class Class1{

  private var a:Int = 0

  var c: Int = 0 //by default public ( No public keyword )

  def display(){
    a = 7
    println("printing a from c1 : " + a)
  }
}

class Class2 extends Class1 {
  protected  var b:Int = 0
  // we have only one protected variable
}

class Class3 extends Class2 {
  def ChangeVar(){
    b = 10
    println("printing b from c3: " + b)
  }
}
object AccessModifiers extends Class1 {
def main(args:  Array[String]){

  var d = new Class1()
  var e = new Class3()

  d.display()
  e.ChangeVar()

  // We can't access or modify a/b directly from here but it's not true for c

  c = 20
  println("printing c from c1 but modified in main function: " + c)

  }
}
