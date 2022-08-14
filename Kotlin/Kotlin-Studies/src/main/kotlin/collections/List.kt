package collections

val numerosInt: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // Deste forma não é possível adicionar valores novos!
val numerosIntMutable: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun main() {
  println(numerosIntMutable.size)
  println(numerosIntMutable[0])
  numerosIntMutable.add(11)
  println(numerosIntMutable.get(10))
  println("=======================================")
  numerosIntMutable.remove(11)
  numerosIntMutable.removeAt(9)
  numerosIntMutable.contains(10)
  println(numerosIntMutable.size)
  println(numerosIntMutable)
  numerosIntMutable.clear()
  println(numerosIntMutable)
}