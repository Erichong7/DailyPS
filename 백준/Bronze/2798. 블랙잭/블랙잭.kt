import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val (n, m) = nextLine().trim().split(" ").map { it.toInt() }
    val cards = nextLine().trim().split(" ").map { it.toInt() }.toMutableList()

    var max = 0
    for (one in 0 until n){
        for(two in one + 1 until n){
            for(three in two + 1 until n){
                val sum = cards[one] + cards[two] + cards[three]
                if (sum > max && sum <= m) max = sum
            }
        }
    }

    println(max)
}
