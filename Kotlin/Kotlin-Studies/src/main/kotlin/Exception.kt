fun main() {
  try {
    val str: String? = null
    println(str!!.length)
  }
  catch(e: NullPointerException) {
    println("Variável nula!!! ${e.message}")
  } finally {
    println("Executando o finally")
  }
}