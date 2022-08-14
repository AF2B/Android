package poo

class TestClass {
  private var testFala: String = ""

  constructor(animal: String){
   when (animal) {
     "Cão" -> {
       this.testFala = "Late..."
     }
     "Gato" -> {
       this.testFala = "Mia..."
     }
     else -> {
       this.testFala = "Desconhecido..."
     }
   }
  }

  fun checarFalaAnimal():String {
    return testFala
  }
}

class TestInit {
  init {
    println("Inicializando...")
  }
}

fun main() {
  var test: TestClass = TestClass("Cão")
  println(test.checarFalaAnimal())

  val test2: TestInit = TestInit()
  println(test2.toString())
}