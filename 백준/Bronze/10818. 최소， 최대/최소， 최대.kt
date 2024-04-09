import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val arr = ArrayList<Int>()

    repeat(n) {
        arr.add(nextInt())
    }

    val min = arr.min()
    val max = arr.max()
    print("$min $max")

//    var max = Int.MIN_VALUE
//    var min = Int.MAX_VALUE
//    for(i in arr) {
//        if(i > max) {
//            max = i
//        }
//        if(i < min) {
//            min = i
//        }
//    }
}