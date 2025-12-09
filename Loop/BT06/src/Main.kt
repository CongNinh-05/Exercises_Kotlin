/*Cho trước số nguyên dương yourNumber. Bạn hãy viết chương trình để in ra số chữ số
của số đã cho*/


fun checkNumber(n: Int): Int{
    if (n == 0 ) return 1
    var count = 0
    var temp = n
    while (temp > 0){
        count += 1
        temp /= 10
    }
    return count
}


fun main(){
    print("Nhập vào số bạn muốn: ")
    var n = readln()!!.toInt()
    val result = checkNumber(n)
    println("Số chữ số của bạn đã nhập là: $result")
}