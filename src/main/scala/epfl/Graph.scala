package epfl

abstract class Graph {
  type Node <: BaseNode
  // Errata: requires was deprecated in 2.6 for selftype
  class BaseNode { self: Node =>
    def connectWith(n: Node): Edge =
      // new Edge(this, n) // illegal!
      new Edge(self, n)
    // def self: Node

  }
  class Edge(from: Node, to: Node) {
    def source() = from
    def target() = to
  }
}
