package epfl.test

import epfl.D

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen

class DSpec extends FreeSpec with ShouldMatchers with GivenWhenThen {

  "A D class" - {
    "can have an instance" - {
      "than can be incremented and decremented" in {
        Given("D object")
        val d = new D
        And("incrementing and decrementing should be identical")
        d.incr.decr should be theSameInstanceAs d
      }
    }
  }
}
