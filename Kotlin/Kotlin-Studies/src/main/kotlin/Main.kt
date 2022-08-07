fun main() {
    var hello_world: String = "Hello World"
    var char: Char = "a"
    var str: String = "Text lorem ipsum..."
    var bool: Boolean = true
    var double: Double = 1.0
    var float: Float = 1.0f
    var int: Int = 1
    var long: Long = 1L
    var short: Short = 50
    var byte: Byte = 100

    println(hello_world)

    println("Double max value: ${Double.MAX_VALUE}") // 1.7976931348623157e+308
    println("Double min value: ${Double.MIN_VALUE}") // 4.9e-324
    println("Float max value: ${Float.MAX_VALUE}") // 3.4028235E38
    println("Float min value: ${Float.MIN_VALUE}") // 1.4E-45
    println("Int max value: ${Int.MAX_VALUE}") // 2147483647
    println("Int min value: ${Int.MIN_VALUE}") // -2147483648
    println("Long max value: ${Long.MAX_VALUE}") // 9223372036854775807
    println("Long min value: ${Long.MIN_VALUE}") // -9223372036854775808
    println("Short max value: ${Short.MAX_VALUE}") // 32767
    println("Short min value: ${Short.MIN_VALUE}") // -32768
    println("Byte max value: ${Byte.MAX_VALUE}") // 127
    println("Byte min value: ${Byte.MIN_VALUE}") // -128
    println("Char max value: ${Char.MAX_VALUE}") // '\uFFFF'
    println("Char min value: ${Char.MIN_VALUE}") // '\u0000'
}

/**
Type Bit
Double 64 bit
Float 32 bit
Long 64 bit
Int 32 bit
Short 16 bit
Byte 8 bit
Boolean true or false
Char 16 bit
String text
 */