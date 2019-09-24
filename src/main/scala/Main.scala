import Examples._
import Examples.myTypes.{IntType, ListType, StringType}

object Main {

  def main(args: Array[String]): Unit = {

    generalMatch(Option(1))
    generalMatch(None)
    generalMatch(("2", 1))
    generalMatch(List(1, 2, 3))
    generalMatch("foo")

    // Found an optional value of: 1.
    // Found a None.
    // Found a Pair or Tuple of : 2 and 1.
    // Found a list of: 1 and List(2, 3).
    // Found everything else of: foo.

    typeMatch(IntType())
    typeMatch(StringType())
    typeMatch(ListType())

    // Found IntType with value: 1
    // Found StringType with value: foo
    // Found ListType with value: List(1, 2, 3)

  }
}
