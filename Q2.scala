object Main extends App {
  def countLetterOccurrences(words: List[String]): Int = {
    val totLength = words.map(_.length).reduce(_ + _)
    totLength
  }

  val words = List("apple", "banana", "cherry", "date")
  val totCount = countLetterOccurrences(words)
  println(s"Total count of letter occurrences: $totalCount")
}
