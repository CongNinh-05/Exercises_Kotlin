/*Cho trước số nguyên dương yourNumber. Bạn hãy viết chương trình để in ra giai thừa
của số đã cho*/


fun giaThua(number : Int): Int{
    var number1 = 1
    for (i in 1..number){
        number1 *= i
    }
    return number1
}


fun main(){
    print("Số gia thừa bạn muốn là: ")
    val number = readln()!!.toInt()
    val result = giaThua(number)
    println("Giai thua của $number là $result")
}