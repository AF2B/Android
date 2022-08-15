fun main() {
  var str: String? = "Hello"

  str?.let {
    println(it)
  }
}

// Explicação do da função let:
// let é uma função que recebe um lambda como parâmetro e executa o lambda apenas se o valor do
// parâmetro não for nulo.