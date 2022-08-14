package poo

class Receita() {
  lateinit var instrucoes: String

  fun geraReceita() {
    instrucoes = "Lavar as mãos..."
  }

  fun imprimeReceita():String {
    if(this::instrucoes.isInitialized) {
      return "Receita: $instrucoes"
    } else {
      return "Receita não foi criada"
    }
  }
}

fun main() {
  val receita: Receita = Receita()
  receita.geraReceita()
  println(receita.imprimeReceita())
}