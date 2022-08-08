import org.junit.jupiter.api.*

class MainTest {
  @Test
  @DisplayName("transformStringToArray")
  fun transformStringToArrayTest(){
    val input = "a,b,c,d,e"
    val input2 = "a.b.c.d.e"
    val expected = println(input)
    val expected2 = println("Virgula ou espaço!")
    val whenCalled = transformStringToArray(input)
    val whenCalled2 = transformStringToArray(input2)
    Assertions.assertEquals(expected, whenCalled)
    Assertions.assertEquals(expected2, whenCalled2)
  }

  @Test
  @DisplayName("transformStringToArray Invalid input")
  fun transformStringToArrayInvalidInputTest(){
    val input = "a.b.c.d.e"
    val expected = println("Virgula ou espaço!")
    val whenCalled = transformStringToArray(input)
    Assertions.assertEquals(expected, whenCalled)
  }

  @Test
  @Disabled
  fun metodoNaoImplementado() {}
}