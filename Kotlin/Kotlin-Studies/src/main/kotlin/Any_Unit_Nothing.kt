fun main() {
  println(greetings("Teste"));
  println(greetings(5));
  println(greetings(true));
  printConsole("Unit test");
  something();
}

fun greetings(param: Any):Any {
  return "Hello, ${param}";
}

fun printConsole(param: String):Unit {
  print(param + "\n");
}

fun something():Nothing {
  TODO("Not implemented");
}

fun save():Nothing {
  TODO("Another time i will implement this...");
}

fun dropSave():Nothing {
  TODO("Need to be implemented later");
}