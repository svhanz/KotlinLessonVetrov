package lesson3

fun main() {
    // мультистрока
    val multiString = """ 
        строка 1
           строка 2
         строка 3
    """.trimIndent() // создает минимальный отступ
    println(multiString)
}