// A Principal diferença entre a class e a data class é que os metodos hashcode, tostring e equals
// são automaticamente criados e adaptados para a classe data class.
// Por padrão a class cria uma inferência do tipo memória. Já a data class cria uma inferência do tipo do item.
// Ou seja, você passa a poder comparar por exemplo, se os valores são de fato iguais e não se a posição
// de memoria é a mesma.
package poo

data class Endereco(val rua: String, val numero: Int, val cidade: String)
class Pessoa(val nome: String, val sobrenome: String)

fun testClass(param: Pessoa, param2: Pessoa) {
  println(param.equals(param2))
}

fun testDataClass(param: Endereco, param2: Endereco):Unit {
  println(param.equals(param2))
}

fun main() {
  val endereco = Endereco("Rua Vergueiro", 1234, "São Paulo")
  val endereco2 = Endereco("Rua Vergueiro", 1234, "São Paulo")
  val pessoa: Pessoa = Pessoa("André", "Filipe")
  val pessoa2: Pessoa = Pessoa("André", "Filipe")

  testClass(pessoa, pessoa2)
  testDataClass(endereco, endereco2)
}