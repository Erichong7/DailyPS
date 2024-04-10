import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val t = nextInt()
    val r = ArrayList<Int>()
    val str = ArrayList<String>()

    repeat(t) {
        r.add(nextInt())
        str.add(next())
    }

    for (i in 0 until str.size) {
        val chars = str[i].toCharArray()
        chars.forEach {
            val s = it
            repeat(r[i]) {
                print("$s")
            }
        }
        println()
    }
}
