package poo

open class Componente() {
  open lateinit var marca: String
  open lateinit var modelo: String
  open lateinit var preco: String
  internal val memoria: String = "16GB"

  fun imprimir():Unit {
    println("Marca: $marca")
    println("Modelo: $modelo")
    println("Preço: $preco")
  }

  private fun lerDadosInternos(){}
}

class Desktop(marca: String, modelo: String, preco: String) : Componente() {
  override var marca: String = marca
  override var modelo: String = modelo
  override var preco: String = preco

  val imprimir = imprimir()
}

fun main() {
  val desktop: Desktop = Desktop("DELL", "Inspiron", "R$ 4.000,00")
  desktop.imprimir
  val comp: Componente = Componente()
  println(comp.memoria)
}