package epfl

class LabeledGraph extends Graph {
  class Node(label: String) extends BaseNode {
    def getLabel: String = label
    def self: Node = this
  }
}
