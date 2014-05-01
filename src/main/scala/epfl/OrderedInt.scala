package epfl

class OrderedInt(val x: Int) extends Ordered {
  type O = OrderedInt
  def <(that: OrderedInt): Boolean = this.x < that.x

}
