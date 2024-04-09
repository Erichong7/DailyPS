import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val nkpInput = br.readLine().split(" ").map { it.toInt() }
    val cream = br.readLine().split(" ").map { it.toInt() }
    val n = nkpInput[0]
    val k = nkpInput[1]
    val p = nkpInput[2]

    var count = 0
    for(i in 0..< n) {
        var no = 0
        for(j in 0..< k) {
            if (cream[(k * i) + j] == 0) {
                no++
            }
        }
        if(no < p) {
            count++
        }
    }
    println(count)
}