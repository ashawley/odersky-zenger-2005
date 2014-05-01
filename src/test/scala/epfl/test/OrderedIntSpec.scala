package epfl.test

import epfl.OrderedInt

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen

class OrderedIntSpec extends FreeSpec with ShouldMatchers with GivenWhenThen {
  "Ordered integers" - {
    "initialized with two numbers" - {
      "should be comparable" in {
        Given("an integer 1")
        val ordInt1 = new OrderedInt(1)
        And("an integer 2")
        val ordInt2 = new OrderedInt(2)
        Then("1 should be less than 2")
        (ordInt1 < ordInt2) should be(true)
      }
    }
  }
}
