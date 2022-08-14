package poo

abstract class Engenharia {
  abstract fun calcularArea(): Double
  abstract fun calcularPerimetro(): Double
  abstract fun calcularDiagonal(): Double
  abstract fun calcularVolume(): Double
}

class EngenhariaDeConstrucao : Engenharia() {
  override fun calcularArea(): Double {
    TODO("Not yet implemented")
  }

  override fun calcularPerimetro(): Double {
    TODO("Not yet implemented")
  }

  override fun calcularDiagonal(): Double {
    TODO("Not yet implemented")
  }

  override fun calcularVolume(): Double {
    TODO("Not yet implemented")
  }
}

fun main() {
  val engenharia: EngenhariaDeConstrucao = EngenhariaDeConstrucao()
}