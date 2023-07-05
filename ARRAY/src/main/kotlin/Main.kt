
fun findMax(numbers: Array<Int>): Int? {
    return numbers.maxOrNull()
}

fun findMin(numbers: Array<Int>): Int? {
    return numbers.minOrNull()
}

fun main(args: Array<String>) {
    val numbers: Array<Int> = arrayOf(20, 30, 40, 5)
    numbers.set(0,15)
    val maxNumber = findMax(numbers)
    val minNumber = findMin(numbers)
    println("Maximum number: $maxNumber")
    println("Minimum number: $minNumber")
}


