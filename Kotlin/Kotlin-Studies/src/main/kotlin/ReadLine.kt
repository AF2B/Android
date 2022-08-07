fun main() {
  var number1: Int 
  var number2: Int

  println("Enter first number: ")
  if (readLine() != null) {
    number1 = readLine()!!.toInt()
  } else {
    number1 = 0
  }
  println("Enter second number: ")
  if (readLine() != null) {
    number2 = readLine()!!.toInt()
  } else {
    number2 = 0
  }
  println("The sum of $number1 and $number2 is: ${number1 + number2}")
}

fun maiorOuMenor(num1: Int, num2: Int): String {
    if (num1 > num2) {
        return "O maior número é $num1"
    } else {
        return "O maior número é $num2"
    }
}