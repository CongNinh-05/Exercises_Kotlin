/*Cho trước mảng chứa các số nguyên arrInt (tồn tại ít nhất một phần tử)
và số tự nhiên yourNumber. Bạn hãy viết chương trình để in ra sự tồn tại
của yourNumber trong arrInt */

fun main() {
    val arrInt = arrayOf(1, 6, 2, 4)

    print("Nhập số cần kiểm tra: ")
    val yourNumber = readln().toInt()

    var found = false

    for (i in arrInt.indices) {
        if (arrInt[i] == yourNumber) {
            found = true
            break
        }
    }

    if (found) {
        println("Tồn tại")
    } else {
        println("Không tồn tại")
    }
}
