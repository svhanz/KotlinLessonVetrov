package lesson7_for

fun main() {
    //cycleFor()
    //rangeIn()
    cycleForBreak()
    cycleForContinue()
}
// диапазоны (интервалы)
fun rangeIn(){
    val range1 = 1..10
    val range2 = 1 until 5 // 5 не будет включено в диапазон
    val range3: LongRange = 1L..15L
    val range4: CharRange = 'a'..'z'
    val range5: IntProgression = 1..20 step 2 // возрастающая прогрессия с шагом 2
    val range6: IntProgression = 10 downTo 1 step 2 // уменьшающаяся прогрессия с шагом 2

    // проверка принадлежности к диапазону
    val a = 5 in range1
    val b = 5 !in range1
    println(a)
    println(b)

}
// цикл for
fun cycleFor(){
    for (i in 6 downTo  1) {
        println("Реклама закончится через: $i")
        Thread.sleep(1000)

    }
}

// оператор break
fun cycleForBreak() {
    for (i in 10 downTo 1) {
        if (i == 5) {
            println("Пользователь нажал \"Пропустить\"")
            break
        }
        println("Реклама закончится через: $i")
        Thread.sleep(1000)
    }
    println("Цикл был прерван на пятой итерации")
}


// оператор continue
fun cycleForContinue(){
    for (i in 10 downTo 1){
        if (i == 6){
            println("Пользователь нажал \"Продолжить\"")
            continue
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }
    println("Цикл был выполнен с пропуском шестой итерации")
}

