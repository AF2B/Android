fun main() {
  var str: String = "André Filipe F Borba"
  transformStringToArray(str)
}

fun transformStringToArray(str: String): Unit {
  if (str.contains(",")) {
    val arrayVar = str.split(",")
    println(arrayVar)
  } else if (str.contains(" ")) {
    val arrayVar = str.split(" ")
    println(arrayVar)
  } else {
    println("Virgula ou espaço!")
  }
}