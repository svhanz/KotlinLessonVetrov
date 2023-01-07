package lesson3

fun main() {
    // Конкатенация строк
    val name = "Ivan"
    val space = ' '
    println("Привет " + space + name + space + "," + space + "как дела?")
    // интерполяция строк
    val lastName = "Ivanov"
    println("Hi, $name $lastName, you ${40 + 10} years")
    // мультистрока
    val multiString = """ 
          string_1
         string_2
            string_3
    """.trimIndent() // функция создает отступ равный наименьшему
    println(multiString)

    val multiStringNew = """
              |string_4
          |string_5
            |string_6
        
    """.trimMargin() // функция прибивает всё к левому краю
    println(multiStringNew)

}