/*Cho trước số nguyên dương yourNumber. Bạn hãy viết chương trình để in ra yourNumber
có phải là số toàn chẵn hay không? */


fun checkNumber(n: Int): String {
    var temp = n
    while (temp > 0) {
        val digit = temp % 10
        if (digit % 2 != 0) {
            return "Không phải số toàn chẵn"
        }
        temp /= 10
    }
    return "Là số toàn chẵn"
}

fun main() {
    print("Nhập vào số bạn muốn: ")
    val n = readln()!!.toInt()
    val result = checkNumber(n)
    println("$n $result")
}
