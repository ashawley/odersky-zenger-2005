package epfl

object TestSensorReader {
  import SensorReader._
  val s1 = new Sensor { val label = "sensor1" }
  val s2 = new Sensor { val label = "sensor2" }
  def main(args: Array[String]) = {
    val d1 = new Display
    val d2 = new Display;
    s1.subscribe(d1)
    s1.subscribe(d2)
    s2.subscribe(d1)
    s1.changeValue(2)
    s2.changeValue(3);
  }
}
