@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

package lesson5_conditionals

fun main() {
    conditionalIf()
}
fun conditionalIf() {
    val ageUser = readln().toInt()
    if (ageUser == AGE_OF_MAJORITY) {
        println("Вход разрешен")
    } else if (ageUser in 20 .. 40){
        println("Вполне себе взрослый чувак")
    }
    else {
        println("Вход запрещен")
    }
}

const val AGE_OF_MAJORITY = 18
