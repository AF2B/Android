package poo

interface Funcionario {
  var salario: Float

  fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
  override fun bonus(): Float = salario * 0.4f
}

class Analista(override var salario: Float) : Funcionario {
  override fun bonus(): Float = salario * 0.3f
}

fun mostraBonus(funcionario: Funcionario) {
  println("O bonus é ${funcionario.bonus()}")
}

fun main() {
  mostraBonus(Gerente(3500f))
  mostraBonus(Analista(4500f))
}