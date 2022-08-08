fun main() {
  var result: Float

  result = media(5f, 10f, 15f, 20f)
  println(result)
}

fun media(vararg notas: Float): Float {
    var soma = 0F
    for (nota in notas) {
        soma += nota
    }
    return (soma / notas.size)
}