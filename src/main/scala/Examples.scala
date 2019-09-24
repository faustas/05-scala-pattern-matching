import Examples.myTypes.{IntType, ListType, StringType}

object Examples {

  /**
   * Simple pattern matching helper that identifies different basic data types.
   *
   * !!! Please use _never_ `Any` if possible. Try to create concrete data type.
   *
   * @param s Information about the found data type.
   */
  def generalMatch(s: Any): Unit = s match {
    case Some(value)  =>  println(s"Found an optional value of: $value.")
    case None         =>  println("Found a None.")
    case (v1, v2)     =>  println(s"Found a Pair or Tuple of : $v1 and $v2.")
    case l1 :: l2     =>  println(s"Found a list of: $l1 (head) and $l2 (tail).")
    case _            =>  println(s"Found everything else of: $s.")
  }

  /**
   * Just a nonsense definition to show some different types that could be matched.
   *
   * @param value A value that depends on the type.
   */
  abstract class myTypes(value: Any)

  object myTypes {

    /**
     * Integer object that also has a value of type integer.
     */
    case class IntType(value: Int = 1) extends myTypes(value)

    /**
     * String object that also has a value of type string.
     */
    case class StringType(value: String = "foo") extends myTypes(value)

    /**
     * List object that also has a value of type list.
     */
    case class ListType(value: List[Int] = List(1,2,3)) extends  myTypes(value)

  }

  /**
   * Match the concrete objects of a class with different concrete types.
   *
   * @param t Information about the type and it's value.
   */
  def typeMatch(t: myTypes): Unit = t match {
    case IntType(w) => println(s"Found IntType with value: $w")
    case StringType(s) => println(s"Found StringType with value: $s")
    case ListType(l) => println(s"Found ListType with value: $l")
    case _ => println("Found something else: $t")
  }

}
