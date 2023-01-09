package lesson4

fun main() {
    val ageUser = 66
    //val compareAge = (ageUser >= AGE_OF_MAJORITY) and (ageUser <= RETIREMENT_AGE)
    // сокращенная запись этого же выражения
    val compareAge = ageUser in AGE_OF_MAJORITY.. RETIREMENT_AGE

    println("Проверка рабочего возраста: $compareAge")

}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65

