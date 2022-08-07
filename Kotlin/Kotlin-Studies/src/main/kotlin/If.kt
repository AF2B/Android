fun main() {
  println(bomDia("manha"))
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