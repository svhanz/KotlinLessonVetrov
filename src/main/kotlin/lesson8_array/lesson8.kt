package lesson8_array

fun main() {
    val ingradient1 = "яйцо"
    val ingradient2 = "помидор"
    val ingradient3= "зелень"
    val ingradient4 = "перец"
    val ingradient5 = "лук"
    // объявление и инициализация массива
    val arrayIngradients = arrayOf("яйцо", "помидор", "зелень", "перец", "лук")

    // явное объявление типа массива
    val intArray1: Array<Int> = arrayOf(1, 2, 3)
    val intArray2 = intArrayOf(1, 2, 3 )// такая запись уходит корнями в джаву

    //val intArray3 = arrayOf() // такую запись нельзя оставить пустой без значений
    val intArray4 = intArrayOf() // такую запись можно оставить пустой без значений

    // вывод в консоль размер массива
    println("Список Инградиенты содержит: ${arrayIngradients.size} названий продуктов")


}