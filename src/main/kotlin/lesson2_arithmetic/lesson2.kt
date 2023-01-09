package lesson2_arithmetic

fun main() {
    val a = 5
    val b = 7
    val sum = a + b
    println(sum)
    println(sum::class.simpleName)// проверить тип переменной

    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2)

    val floatNum1: Float = 10f
    val floatNum2: Float = 3f
    println(floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2)

    val res = a + floatNum1 + doubleNum1
    println(res)
    println(res::class.simpleName)

}