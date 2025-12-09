/*Cho trước số nguyên dương n (n >= 10). Bạn hãy viết chương trình để in ra chữ số đầu
tiên và chữ số cuối cùng của n*/
fun main(){
    print("Nhập giá trị n >= 10: ")
    val n = readln()!!.toInt()
    if(n < 10){
        println("Vui lòng nhập giá trị n >= 10")
        return
    }

    var lastDigit = n%10
    var firstDigit = n
    while (firstDigit >= 10){
        firstDigit /= 10
    }

    println("Chữ số đầu tiên: $firstDigit")
    println("Chữ số cuối cùng: $lastDigit")
}