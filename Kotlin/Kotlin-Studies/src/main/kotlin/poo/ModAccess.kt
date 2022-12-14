package poo

open class Componente() {
  protected open lateinit var marca: String
  protected open lateinit var modelo: String
  protected open lateinit var preco: String
  internal val memoria: String = "16GB"
  private var corrente: Boolean = false

  fun imprimir():Unit {
    println("Marca: $marca")
    println("Modelo: $modelo")
    println("Preço: $preco")
  }

  protected open fun ligar():Unit {
    this.corrente = true
    println("Ligando...")
  }

  protected open fun desligar():Unit {
    this.corrente = false
    println("Desligando...")
  }

  private fun lerDadosInternos(){}
}

class Desktop(marca: String, modelo: String, preco: String) : Componente() {
  override var marca: String = marca
  override var modelo: String = modelo
  override var preco: String = preco
  private var hibernar: Boolean = false

  val imprimir = imprimir()

  private fun save() {
    println("Salvando...")
  }
  private fun save(hibernar: Boolean) {
    this.hibernar = true
    save()
    println("Hibernando...")
  }

  public override fun ligar() {
    super.ligar()
  }

  public override fun desligar() {
    save()
    super.desligar()
  }

  fun hibernar() {
    save(true)
  }
}

fun main() {
  val desktop: Desktop = Desktop("DELL", "Inspiron", "R$ 4.000,00")
  desktop.imprimir
  val comp: Componente = Componente()
  println(comp.memoria)
  println("===============================================")
  desktop.ligar()
  desktop.desligar()
  println("===============================================")
  desktop.hibernar()
}