package poo

class Matematica {
  companion object {
    val PI: Double = 3.1415

    fun circunferencia(raio: Double): Double {
      return 2.0 * PI * raio
    }
  }

  object Constantes {
    val PI: Double = 3.1415
    val FIBONACCI = arrayOf(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
  }

  object Constantes2 {
    val TESTE: String = "TESTE"
  }
}

fun main() {
  println(Matematica.PI)
  println(Matematica.circunferencia(10.0))
  println(Matematica.Constantes.FIBONACCI)
  println(Matematica.Constantes2.TESTE)
}