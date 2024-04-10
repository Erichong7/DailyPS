import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val map = mapOf<String, Double>(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0
        )
    var totalGrade = 0.0
    var sum = 0.0

    repeat(20) {
        val (name, grade, score) = nextLine().trim().split(" ")
        if(score != "P") {
            totalGrade += grade.toDouble()
            sum += grade.toDouble() * map[score]!!
        }
    }

    println(sum / totalGrade)
}
