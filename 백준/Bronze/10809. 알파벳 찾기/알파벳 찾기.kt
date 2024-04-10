import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val word = nextLine()
    val answer = Array<Int>(26) { -1 }

    for (i in word.indices) {
        val index = word[i] - 'a'
        if (answer[index] == -1) {
            answer[index] = i
        }
    }

    answer.forEach { print("$it ") }
}
