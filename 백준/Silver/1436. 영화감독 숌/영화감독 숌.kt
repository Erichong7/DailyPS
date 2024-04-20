import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var n = nextInt()
    var num = 665

    while (n != 0) {
        num++
        if(num.toString().contains("666")) n--
    }

    println(num)
}
