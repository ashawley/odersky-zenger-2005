package epfl

abstract class FlipCell extends AbsCell {
  type T
  var flip = false
  def f(): AbsCell = {
    flip = !flip
    if (flip) new { type T = Int; val init = 1 } with AbsCell
    else new { type T = String; val init = "" } with AbsCell
  }
  // f().set(f().get) // illegal!
}
