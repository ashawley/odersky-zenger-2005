package epfl

// Errata: This was defined as an abstract class.
trait LoggedIterator extends AbsIterator {
  abstract override def next: T = {
    val x = super.next; System.out.println(x); x
  }
}
