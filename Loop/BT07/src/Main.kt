/*Cho trước số nguyên dương n. Bạn hãy viết chương trình để in hiệu giữa chữ số
lớn nhất và nhỏ nhất của n*/


fun checkNumber(n: Int): Int {
    var temp = n
    var maxDigit = 0
    var minDigit = 9

    while (temp > 0) {
        val digit = temp % 10  // lấy chữ số cuối
        if (digit > maxDigit) maxDigit = digit
        if (digit < minDigit) minDigit = digit
        temp /= 10  // bỏ chữ số cuối
    }

    return maxDigit - minDigit
}

fun main() {
    print("Nhập vào số bạn muốn: ")
    val n = readln()!!.toInt()
    val result = checkNumber(n)
    println("Hiệu giữa chữ số lớn nhất và nhỏ nhất: $result")
}
