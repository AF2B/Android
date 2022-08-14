package poo

enum class Prioridade {
  BAIXA, MEDIA, ALTA
}

enum class Animais {
  CACHORRO, GATO, VACA, PORCO, PEIXE, OUTRO
}

fun x(prioridade: Prioridade) {
  when (prioridade) {
    Prioridade.BAIXA -> println("Baixa")
    Prioridade.MEDIA -> println("Media")
    Prioridade.ALTA -> println("Alta")
  }
}

fun main() {
  x(Prioridade.ALTA)
  x(Prioridade.MEDIA)
  x(Prioridade.BAIXA)
  println("\n")

  for (a in Animais.values()) {
    println(a)
  }
}