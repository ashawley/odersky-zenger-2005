package epfl

object TestIter {
  def main(args: Array[String]): Unit = {
    class Iter extends StringIterator(args(0))
      with RichIterator
    val iter = new Iter
    iter foreach System.out.println
    class Iter2 extends StringIterator(args(0))
      with RichIterator with LoggedIterator with SyncIterator
    val iter2 = new Iter2
    iter2 foreach System.out.println
  }
}
