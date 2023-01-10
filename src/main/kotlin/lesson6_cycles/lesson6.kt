package lesson6_cycles

fun main() {
    whileCycle()
    doWhile()
}


// while
fun whileCycle(){
    println("Так работает цикл while (пока условие в while истинно, будет выполняться то, что в фигурных скобках)")
    var counter = 5
    while (counter > 0){
        println("Реклама закончится через $counter")
        counter--
        Thread.sleep(1000) // делает паузу на 1 сек между итерациями
    }
    println("счетчик counter стал равным нулю и цикл прекратил работу")
}

// do-while
fun doWhile(){
    println("Так работает цикл do-while (делай то, что в фигурных скобках, пока условие в while истинно)")
    var  counter = 5
    do {
        println("Реклама закончится через $counter")
        counter--
        Thread.sleep(1000) // делает паузу на 1 сек между итерациями
    } while (counter > 0)
    println("счетчик counter стал равным нулю и do перестало выполнять то, что в фигурных скобках (цикл закончился)")
}