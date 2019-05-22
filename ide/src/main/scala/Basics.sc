// Print HelloWorld to the console
println("Hello World")

// add two numbers together
2 + 3

// add two numbers and store them to a variable
val s = 2 + 3

// define a function that adds 1 to an Integer
def addOne(m: Int): Int = { m + 1 }

// use the function above to add 1 to 5
addOne(5)

// create a list
val lInit = List(1, 2, 3)

// add 1 to each element of the list
val lPlusOne = lInit.map(addOne)

// duplicate each element of the list
val lDups = lPlusOne.flatMap(el => List(el, el))
println(lDups)

// sum all the elements of the above list
lPlusOne.sum


// keep only the even numbers in lEven
val lEven = lPlusOne.filter(_ % 2 == 0)
println(lEven)

// create a tuple and match on it
val tuple = ("myKey", 4)

val tRes = tuple match {
  case (key, value) => s"The key was $key with the value $value"
}

println(tRes)

// create an Option element and apply a method on it
val opt = Option("mobile")
opt.map(v => s"Value was $v").getOrElse("Nothing to print")
None.map(v => s"Value was $v").getOrElse("Nothing to print")

// parse a string to an Int
import scala.util.Try
val i = "2".toInt
val iSafe = Try("2".toInt)
val iSafeOpt = Try("2".toInt).toOption

