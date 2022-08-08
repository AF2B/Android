import org.junit.jupiter.api.*

class MainTest {
  @Test
  @DisplayName("transformStringToArray")
  fun transformStringToArrayTest(){
    val input = "a,b,c,d,e"
    val expected = println(input)
    val whenCalled = transformStringToArray(input)
    Assertions.assertEquals(expected, whenCalled)
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