package poo

class GetSet {
  var nome: String = ""
    get() {
      println("Get no kotlin, já vem por padrão embutido.")
      return field
    }

    set(value) {
      println("Set no kotlin, já vem por padrão embutido.")
      field = value
    }
}

fun main() {
  var getSet: GetSet = GetSet()
  getSet.nome = "André"
  println(getSet.nome)
}