package ReverseKT.Traits

class square extends polygon with shape {

  override def area(sides: Int) = sides*sides

  override def NameShape(shp: String)  = shp
}
object square extends App{
  val sqObj = new square
  println(sqObj.area(4))
  println(sqObj.NameShape("four sided"))
  println(sqObj.fun1())

}
