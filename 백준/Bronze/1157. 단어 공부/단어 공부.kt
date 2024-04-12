import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = nextLine().uppercase().trim().toCharArray()
    val alphabet = MutableList(26) { 0 }

    for (i in input.indices) {
        val index = input[i] - 'A'
        alphabet[index]++
    }

    val max = alphabet.maxBy { it }
    if (alphabet.count { it == max } > 1) {
        println("?")
    } else {
        val maxIndex = alphabet.indexOf(max)
        val answer : Char = 'A' + maxIndex
        println(answer)
    }
}