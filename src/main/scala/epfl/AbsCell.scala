package epfl

abstract class AbsCell {
  type T
  val init: T
  private var value: T = init
  def get: T = value
  def set(x: T): Unit = { value = x }
  def reset: Unit = set(init)
}
