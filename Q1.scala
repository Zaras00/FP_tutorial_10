object TempConv {
  def main(a: Array[String]): Unit = {
    val temperatures = List(0, 10, 20, 30)
    val avg = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $avg")
  }

  def calculateAverage(temps: List[Int]): Double = {
    val f = temperatures.map(_ * (9.0 / 5.0) + 32.0)
    f.reduce(_ + _) / f.length
  }
}
