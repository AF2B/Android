import org.junit.jupiter.api.*

class MainTest {
  @Test
  @DisplayName("Test example")
  fun transformStringToArrayTest(){
    val input = "a,b,c,d,e"
    val expected = println(input)
    val whenCalled = transformStringToArray(input)
    Assertions.assertEquals(expected, whenCalled)
  }

  @Test
  @Disabled
  fun metodoNaoImplementado() {}
}