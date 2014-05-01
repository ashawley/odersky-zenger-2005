package epfl

trait AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}
