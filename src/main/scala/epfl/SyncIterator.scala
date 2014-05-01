package epfl

// Errata: This was defined as an abstract class.
trait SyncIterator extends AbsIterator {
  abstract override def hasNext: Boolean =
    synchronized(super.hasNext)
  abstract override def next: T =
    synchronized(super.next)
}
