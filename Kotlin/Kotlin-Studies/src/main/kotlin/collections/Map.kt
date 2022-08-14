package collections

val mapping: Map<String, String> = mapOf("key" to "value", "key2" to "value2")
var linguagens: MutableMap<String, String> = mutableMapOf("Web" to "Typescript", "Mobile" to "Kotlin")

fun main() {
  println(mapping["key"])
  println(mapping.entries)
  println(mapping.values)
  println(mapping.keys)
  println("=============================")
  println(linguagens["Web"])
  println(linguagens["Mobile"])
  println(linguagens.keys)
  println(linguagens.values)
  linguagens["Desktop"] = "Java"
  linguagens["WebOldDev"] = "JavaScript"
  println(linguagens)
  linguagens.remove("WebOldDev")
  println(linguagens)
  linguagens.clear()
  println(linguagens)
}