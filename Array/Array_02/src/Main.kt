/*Đếm xem số chẵn và số lẻ trong mảng có bao nhiêu*/

fun main() {
    val arr = intArrayOf(2, 5, 7, 8, 10, 13)

    var even = 0
    var odd = 0

    for (x in arr) {
        if (x % 2 == 0) even++
        else odd++
    }

    println("Có $even số chẵn, $odd số lẻ")
}
