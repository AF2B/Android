fun main() {
  val result: Float
  result = media(10f, 8)
  println(result)
}

fun <T> media(vararg notas: T): Float {
  var soma: Float = 0.0f

  for (nota in notas) {
    if (nota is Float) {
      soma += nota
    }else if (nota is Int) {
      soma += nota.toFloat()
    }else {
      println("Tipo de dado inválido")
    }
  }
  return soma / notas.size
}