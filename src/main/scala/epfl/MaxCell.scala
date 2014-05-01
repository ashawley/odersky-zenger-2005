package epfl

abstract class MaxCell extends AbsCell {
  type T <: Ordered { type O = T }
  def setMax(x: T) = if (get < x) set(x)
}
