// - Qual a diferença entre o List e o Set?
// List é um conjunto ordenado de elementos, conforme você vai adicionando novos elementos,
// Eles vão sendo adicionados ao final. Já o Set não tem uma sequência ordenada.
// Set não permite elementos duplicados!

package collections

val set1: Set<String> = setOf("a", "b", "c")
var listaDeCompras: MutableSet<String> = mutableSetOf("Kiwi", "Laranja", "Melancia")


fun main() {
  listaDeCompras.add("Maçã")
  listaDeCompras.size
  listaDeCompras.contains("Maçã")
  listaDeCompras.remove("Laranja")
  listaDeCompras.remove("Maçã")
  println(listaDeCompras)
  listaDeCompras.clear()
}