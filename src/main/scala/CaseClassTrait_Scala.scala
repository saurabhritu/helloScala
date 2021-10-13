import java.awt.Polygon
trait Shape{
  def color: String
}
abstract class Polygon{
  def area: Double
}

class Rectangle(var width: Double, var height: Double) extends Polygon with Shape {
  override def area: Double = width * height

  def color: String = "Sky_blue"
}

class Triangle(var width: Double, var height: Double) extends Polygon with Shape {
  override def area: Double = (width * height)/2

  def color: String = "Forest_green"
}

object CaseClassTrait_Scala {
  def main(args: Array[String]){
//    var poly = new Polygon // it can't be instantiated because Polygon is abstracted
    var rect = new Rectangle(20, 10)
    var tri = new Triangle(20, 10)

    printArea(rect)
    println(rect.color)

    printArea(tri)
    println(tri.color)
  }

  def printArea(p: Polygon){
    print(p.area + " ")
  }
}
