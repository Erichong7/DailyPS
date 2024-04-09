import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var count = 0

    repeat(n) {
        val word = scanner.next()
        val seen = mutableSetOf<Char>()
        var prevChar: Char? = null
        var isGroupWord = true

        for (char in word.toCharArray()) {
            if (prevChar != null && prevChar != char && seen.contains(char)) {
                isGroupWord = false
                break
            }
            seen.add(char)
            prevChar = char
        }

        if (isGroupWord) {
            count++
        }
    }

    println(count)
}
