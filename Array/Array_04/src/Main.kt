/*Cho trước mảng chứa các số nguyên arrInt.
Bạn hãy viết chương trình để in ra tổng của phần tử đầu tiên
và cuối cùng trong mảng arrInt*/


fun main(){
    val arrInt = arrayOf(1, 3, 4, 5, 6, 8, 9)
    val sum = arrInt.first() + arrInt.last()
    println(sum)
}