package poo

fun main() {
  val p: Pessoa = Pessoa("Fonsêca", "Borba")
  p.codar()

  with(p) {
    codar()
  }
}
