package epfl

abstract class Ordered {
  type O
  def <(that: O): Boolean
  def <=(that: O): Boolean =
    this < that || this == that
}
