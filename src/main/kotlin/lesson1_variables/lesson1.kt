package lesson1_variables

fun main(){
    //println("hello GIT")
    // неявное объявление типа переменной
    val numberOfOrders = 42
    // явное объявление типа переменной
    val numberOfOrderNew: Int  = 20
    // строковые переменные (неявное объявление типа)
    val noticeText = "не забудьте маску и перчатки"
    // строковые переменные (явное объявление типа)
    val noticeTextNew = "без масок вход запрещен"
    // вывод на экран
    println(numberOfOrders)
    println(noticeText)
    // типы переменных:
    // целочисленные
    val intNumb: Int // содержит 32 бита информации в диапазоне от -2147483648 до 2147483647
    val longNumb: Long = 123L // содержит 64 бита информации
    val shortNumb: Short // содержит 16 бит информации
    val byteNumb: Byte // содержит 8 бит информации
    val unsignedTypesNumb: UInt = 12345u // 32 бита, только положительные числа

    // вещественые (числа с плавающей точкой)
    val doubleNum: Double = 1.25 // содержит 64 бита информации
    val floatNum: Float = 1.5f // содержит 32 бита и требует явного указания, что число флоат

    // строковые
    val stringValue = "я строка" // любой набор символов, заключенных в двойные кавычки
    val charValue: Char = '1' // содержит только один символ, заключенный в одинарные кавычки

    // логические
    val trueValue: Boolean = true // правда
    val falseValue: Boolean = false // ложь




}