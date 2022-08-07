fun main() {
  println(bomDia("manha"))
  println(bomDia("tarde"))
  println(bomDia("noite"))

  println(salario("dev"))
  println(salario(""))
}

fun bomDia(horario: String): Unit {
  if (horario == "manha") {
    println("Bom dia")
  } else if (horario == "tarde") {
    println("Boa tarde")
  } else if (horario == "noite") {
    println("Boa noite")
  } else {
    println("Boa noite")
  }
}

fun salario(cargo: String): String {
  return when (cargo) {
    "engenheiro" -> "R$ 4.000,00"
    "dba" -> "R$ 4.500,00"
    "dev" -> "R$ 5.000,00"
    else -> "R$ 0.000,00"
  }
}