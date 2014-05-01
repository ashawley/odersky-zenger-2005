package epfl.test

import epfl.StringIterator
import epfl.RichIterator
import epfl.SyncIterator
import epfl.LoggedIterator

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen

class StringIteratorSpec extends FreeSpec
    with ShouldMatchers
    with GivenWhenThen {
  "A string iterator" - {
    "with a rich mixin" - {
      "should print one character per line" in {
        Given("some string")
        val someString: String = "word"
        When("passed in to an iterator")
        val iter = new StringIterator(someString) with RichIterator
        val stream = new java.io.ByteArrayOutputStream()
        Console.withOut(stream) {
          iter foreach println shouldBe ((): Unit)
        }
        stream.toString shouldBe ("w\no\nr\nd\n")
      }
    }
    "with a sync mixin" - {
      "should print one character per line" in {
        Given("some string")
        val someString: String = "word"
        When("passed in to an iterator")
        val iter = new StringIterator(someString) with RichIterator with SyncIterator
        val stream = new java.io.ByteArrayOutputStream()
        Console.withOut(stream) {
          iter foreach println shouldBe ((): Unit)
        }
        stream.toString shouldBe ("w\no\nr\nd\n")
      }
      "regardless of the order of mixing in" in {
        Given("some string")
        val someString: String = "word"
        When("passed in to an iterator")
        val iter = new StringIterator(someString) with SyncIterator with RichIterator
        val stream = new java.io.ByteArrayOutputStream()
        Console.withOut(stream) {
          iter foreach println shouldBe ((): Unit)
        }
        stream.toString shouldBe ("w\no\nr\nd\n")
      }
    }
  }
}
