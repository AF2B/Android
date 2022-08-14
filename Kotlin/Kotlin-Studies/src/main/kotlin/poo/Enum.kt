package poo

enum class Prioridade {
  BAIXA, MEDIA, ALTA
}

enum class Animais {
  CACHORRO, GATO, VACA, PORCO, PEIXE, OUTRO
}

enum class Cor(val rgb: Int) {
  VERMELHO(0xFF0000),
  VERDE(0x00FF00),
  AZUL(0x0000FF),
  AMARELO(0xFFFF00),
  ROSA(0xFF00FF),
  LARANJA(0xFFA500),
  CINZA(0x808080),
  PRETO(0x000000),
  BRANCO(0xFFFFFF)
}

fun x(prioridade: Prioridade) {
  when (prioridade) {
    Prioridade.BAIXA -> println("Baixa")
    Prioridade.MEDIA -> println("Media")
    Prioridade.ALTA -> println("Alta")
  }
}

fun main() {
  for (cores in Cor.values()) {
    if(cores.rgb == 0xFF0000) {
      println("Vermelho \n")
    }
  }

  x(Prioridade.ALTA)
  x(Prioridade.MEDIA)
  x(Prioridade.BAIXA)
  println("\n")

  for (a in Animais.values()) {
    println(a)
  }
}