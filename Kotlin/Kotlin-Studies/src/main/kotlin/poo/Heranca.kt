package poo

open class Eletronico(marca: String, modelo: String, valor: Float) {
  fun ligar(){}
  fun desligar(){}
}

class Notebook() : Eletronico("Asus", "Notebook", 2000.0f) {
  lateinit var marca: String
  lateinit var modelo: String
  lateinit var valor: String

  constructor(marca: String, modelo: String, valor: String) : this() {
    this.marca = marca
    this.modelo = modelo
    this.valor = valor
  }

  fun instalarSoftware(){}
  fun processar(){}
}

class Celular() : Eletronico("Motorola", "Celular", 1000.0f)

fun main() {
  val notebook: Notebook = Notebook("DELL", "Nave", "R$ 2.360,35")
  val celular: Celular = Celular()

  notebook.ligar()
  println("Marca: ${notebook.marca} \n Modelo: ${notebook.modelo} \n Valor: ${notebook.valor}")
}