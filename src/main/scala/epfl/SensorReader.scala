package epfl

object SensorReader extends SubjectObserver {
  type S = Sensor
  type O = Display
  abstract class Sensor extends Subject {
    val label: String
    var value: Double = 0.0
    def changeValue(v: Double) = {
      value = v
      publish
    }
  }
  class Display extends Observer {
    def println(s: String) = System.out.println(s)
    def notify(sub: Sensor) =
      println(sub.label + " has value " + sub.value)
  }
}
