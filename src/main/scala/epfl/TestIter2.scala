package epfl

object TestIter2 {
  def main(args: Array[String]): Unit = {
    class Iter2 extends StringIterator(args(0))
      with RichIterator with LoggedIterator with SyncIterator
    val iter2 = new Iter2
    iter2 foreach System.out.println
  }
}
