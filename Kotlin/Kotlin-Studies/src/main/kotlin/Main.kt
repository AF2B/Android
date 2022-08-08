fun main() {
    var hello_world: String = "Hello World"
    var char: String = "a"
    var str: String = "Text lorem ipsum..."
    var bool: Boolean = true
    var double: Double = 1.0
    var float: Float = 1.0f
    var int: Int = 1
    var long: Long = 1L
    var short: Short = 50
    var byte: Byte = 100

    //val são constantes, não podem ser alteradas
    val test: UInt = 0u
    val test2: ULong = 0uL
    val test3: UByte = 0u
    val test4: UShort = 0u

    val nome: String = "André"
    //nome = "Filipe" ~> erro de compilação
    val sobrenome: String = "Borba"
    val nomeCompleto: String = "$nome $sobrenome"
    val nomeCompleto2: String = "${nome} ${sobrenome}"
    println(nomeCompleto)
    println(nomeCompleto2)

    var idade: Int = 24
    idade = idade + 1
    println(idade)
    idade += 1
    println(idade)
    idade -= 1
    println(idade)
    idade *= 2
    println(idade)
    idade /= 2
    println(idade)
    idade %= 2
    println(idade)
    idade++
    println(idade)
    idade--
    println(idade)

    println(hello_world)

//    println("ULong max value: ${ulong.MAX_VALUE}")
//    println("ULong min value: ${ulong.MIN_VALUE}")
//    println("UInt max value: ${uint.MAX_VALUE}")
//    println("UInt min value: ${uint.MIN_VALUE}")
//    println("UShort max value: ${ushort.MAX_VALUE}")
//    println("UShort min value: ${ushort.MIN_VALUE}")
//    println("UByte max value: ${ubyte.MAX_VALUE}")
//    println("UByte min value: ${ubyte.MIN_VALUE}")

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