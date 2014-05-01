package epfl.test

import epfl.AbsCell

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen
import org.scalatest.exceptions.TestFailedException

class AbsCellSpec extends FreeSpec with ShouldMatchers with GivenWhenThen {

  def reset(c: AbsCell): Unit = c.set(c.init)

  "A cell" - {
    "initialized with an integer 1" - {
      "should not provide access to 'value property" in {
        Given("an integer 1")
        val cell = new { type T = Int; val init = 1 } with AbsCell
        Then("should not have a value property")
        intercept[TestFailedException] {
          cell should have('value(1))
        }
      }
      "should be equal to 1" in {
        Given("an integer 1")
        val cell = new { type T = Int; val init = 1 } with AbsCell
        Then("the value should be 1")
        cell.get should be(1)
      }
      "should be equal to 2 when doubled" in {
        Given("an integer 1")
        val cell = new { type T = Int; val init = 1 } with AbsCell
        When("multiplied by 2")
        cell.set(cell.get * 2)
        Then("the value should be 2")
        cell.get should be(2)
      }
      "should be reset to 2" in {
        Given("an integer 1")
        val cell = new { type T = Int; val init = 1 } with AbsCell
        When("multiplied by 2")
        cell.set(cell.get * 2)
        Then("the value should be 2")
        cell.get should be(2)
        When("reset")
        reset(cell)
        Then("the value should be 1 again")
        cell.get should be(1)
      }
      "flipping should not work" - { // Ignore
        val cell = new { type T = Int; val init = 1 } with AbsCell
        // f().set(f().get)
      }
    }
  }
}
