@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

package lesson5_conditionals

fun main() {
    //conditionalIf()
    conditionalWhen()
}
fun conditionalIf() {
    val ageUser = readln().toInt()
    val ageResult = if (ageUser == AGE_OF_MAJORITY) {
        println("Вход разрешен")
    } else if (ageUser in 20 .. 40){
        println("Вполне себе взрослый чувак")
    }
    else {
        println("Вход запрещен")
    }
    println(ageResult)
}

fun conditionalWhen(){
    val ageUser = readln().toInt()
    val outputResult = when(ageUser){
        10 -> "Пошел в жопу малолетка!"
        15 -> "Приходи через три года, щегол!"
        20 -> "Это ты удачно зашел!"
        in 21..65 -> "Заходи в любое время,  мужик!"
        else -> "Ничего не подошло"
    }
    println(outputResult)
}
const val AGE_OF_MAJORITY = 18
