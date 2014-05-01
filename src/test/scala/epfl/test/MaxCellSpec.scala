package epfl.test

import epfl.MaxCell
import epfl.OrderedInt

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen

class MaxCellSpec extends FreeSpec with ShouldMatchers with GivenWhenThen {
  "A cell" - {
    "initialized with an integer 1" - {
      "should be 2 if bigger" in {
        Given("an integer 1")
        val ordInt1 = new OrderedInt(1)
        And("an integer 2")
        val ordInt2 = new OrderedInt(2)
        val cell = new { type T = OrderedInt; val init = ordInt1 } with MaxCell
        When("set the max as 2")
        cell.setMax(ordInt2)
        Then("the value should be 2")
        cell.get.x should be(2)
      }
      "should stay as 1" in {
        Given("an integer 1")
        val ordInt1 = new OrderedInt(1)
        val cell = new { type T = OrderedInt; val init = ordInt1 } with MaxCell
        When("set the max to 1")
        cell.setMax(ordInt1)
        Then("the value should be 1")
        cell.get.x should be(1)
      }
    }
  }
}
