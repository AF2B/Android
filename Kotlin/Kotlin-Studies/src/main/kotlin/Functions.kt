fun main() {
  // Tipo de retorno
  // Unit -> void
  // Double, Int, String, Boolean -> tipo primitivo
  // Array, List, Set, Map -> tipo de coleção
  // Char, Byte, Short, Long -> tipo de número
  // Instancia de classes -> tipo de referência

  fun imprimirSoma(a: Int, b: Int): Unit {
    println(a + b)
  }

  fun imprimirSoma2(a: Double, b: Double = 5.6, c: Double): Double {
    return a + b + c
  }

  fun multiplicacao(a: Int, b: Int): Int = a * b
  fun subtracao(a: Int, b: Int): Int = a - b
  fun divisao(a: Int, b: Int): Int = a / b

  fun helloWorld(): String {
    return "Hello World"
  }

  fun lengthString(str: String): Int {
    return str.length
  }

  var name: String = "André"
  var result: Int
  result = lengthString(name)
  println(result)
  println(name.length)

  println("Primeira letra da string: ${name[0]}")
  println(name.startsWith("André"))
  println(name.endsWith("é"))
  println(name.contains("André"))
  println(name.replace("André", "Borba"))
  println(name.substring(0, 3))
  println(name.toUpperCase())
  println(name.toLowerCase())
  println(name.capitalize())
  println(name.decapitalize())
  println(name.repeat(2))
  println(name.trim())
  println(name.trimMargin())
  println(name.trimIndent())
  println(name.padStart(10, ' '))
  println(name.padEnd(10, ' '))
}