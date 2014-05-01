package epfl

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length()
  def next = { val x = s.charAt(i); i = i + 1; x }
}
