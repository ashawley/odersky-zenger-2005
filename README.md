Scalable Component Abstractions
===============================

Martin Odersky and Matthias Zenger, EPFL Lausanne

OOPSLA 2005

http://lampwww.epfl.ch/~odersky/papers/ScalableComponent.html

Abstract Type Members
---------------------
* [AbsCell.scala](src/main/scala/epfl/AbsCell.scala)

### Path-dependent types
* [AbsCell.scala](src/main/scala/epfl/AbsCell.scala)
* [FlipCell.scala](src/main/scala/epfl/FlipCell.scala)

### Type selection and singleton types
* [D.scala](src/main/scala/epfl/D.scala)

### Parameter bounds
* [Ordered.scala](src/main/scala/epfl/Ordered.scala)
* [OrderedInt.scala](src/main/scala/epfl/OrderedInt.scala)
* [MaxCell.scala](src/main/scala/epfl/MaxCell.scala)

Modular Mixin Composition
-------------------------
* [AbsIterator.scala](src/main/scala/epfl/AbsIterator.scala)
* [RichIterator.scala](src/main/scala/epfl/RichIterator.scala)
* [StringIterator.scala](src/main/scala/epfl/StringIterator.scala)
* [TestIter.scala](src/main/scala/epfl/TestIter.scala)

### Super calls
* [SyncIterator.scala](src/main/scala/epfl/SyncIterator.scala)
* [LoggedIterator.scala](src/main/scala/epfl/LoggedIterator.scala)
* [TestIter2.scala](src/main/scala/epfl/TestIter2.scala)

Selftype Annotations
--------------------
* [Graph.scala](src/main/scala/epfl/Graph.scala)
* [LabeledGraph.scala](src/main/scala/epfl/LabeledGraph.scala)

Case Study: Subject/Observer
----------------------------
* [SubjectObserver.scala](src/main/scala/epfl/SubjectObserver.scala)
* [SensorReader.scala](src/main/scala/epfl/SensorReader.scala)
* [TestSensorReader.scala](src/main/scala/epfl/TestSensorReader.scala)

Test suite output
-----------------
    AbsCellSpec:
    A cell
      initialized with an integer 1
      - should not provide access to 'value property (59 milliseconds)
        + Given an integer 1
        + Then should not have a value property
      - should be equal to 1 (1 millisecond)
        + Given an integer 1
        + Then the value should be 1
      - should be equal to 2 when doubled (1 millisecond)
        + Given an integer 1
        + When multiplied by 2
        + Then the value should be 2
      - should be reset to 2 (2 milliseconds)
        + Given an integer 1
        + When multiplied by 2
        + Then the value should be 2
        + When reset
        + Then the value should be 1 again
        flipping should not work
    DSpec:
    A D class
      can have an instance
      - than can be incremented and decremented (3 milliseconds)
        + Given D object
        + And incrementing and decrementing should be identical
    OrderedIntSpec:
    Ordered integers
      initialized with two numbers
      - should be comparable (48 milliseconds)
        + Given an integer 1
        + And an integer 2
        + Then 1 should be less than 2
    MaxCellSpec:
    A cell
      initialized with an integer 1
      - should be 2 if bigger (47 milliseconds)
        + Given an integer 1
        + And an integer 2
        + When set the max as 2
        + Then the value should be 2
      - should stay as 1 (1 millisecond)
        + Given an integer 1
        + When set the max to 1
        + Then the value should be 1
    StringIteratorSpec:
    A string iterator
      with a rich mixin
      - should print one character per line (37 milliseconds)
        + Given some string
        + When passed in to an iterator
      with a sync mixin
      - should print one character per line (3 milliseconds)
        + Given some string
        + When passed in to an iterator
      - regardless of the order of mixing in (8 milliseconds)
        + Given some string
        + When passed in to an iterator
    Run completed in 361 milliseconds.
    Total number of tests run: 11
    Suites: completed 5, aborted 0
    Tests: succeeded 11, failed 0, canceled 0, ignored 0, pending 0
    All tests passed.
