package epfl

object TestIter {
  def main(args: Array[String]): Unit = {
    class Iter extends StringIterator(args(0))
      with RichIterator
    val iter = new Iter
    iter foreach System.out.println
  }
}
