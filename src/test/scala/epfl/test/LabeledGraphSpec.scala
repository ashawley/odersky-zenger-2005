package epfl.test

import epfl.LabeledGraph

import org.scalatest.FreeSpec
import org.scalatest.ShouldMatchers
import org.scalatest.GivenWhenThen

class LabeledGraphSpec extends FreeSpec
    with ShouldMatchers
    with GivenWhenThen {
  "A labeled graph" - {
    "with an edge" - {
      "should have labeled nodes" in {
        Given("a labeled graph and two nodes")
        val labeled = new LabeledGraph
        val n1 = new labeled.Node("1")
        val n2 = new labeled.Node("2")

        When("an edge is made")
        val e = new labeled.Edge(n1, n2)

        Then("the ends should have labels")
        e.source.getLabel === "1"
        e.target.getLabel === "2"
      }
    }
  }
}
