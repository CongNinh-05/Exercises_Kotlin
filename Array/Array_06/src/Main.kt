/*Cho trước mảng chứa các số nguyên arrInt (tồn tại ít nhất một phần tử).
Bạn hãy viết chương trình để cập nhật giá trị các phần tử trong arrInt
bằng giá trị tuyệt đối của nó.*/


import kotlin.math.abs


fun main(){
    val arrInt = arrayOf(1, -2, 3, 4, -5, 6, 7)

    for (i in arrInt.indices){
        arrInt[i] = abs(arrInt[i])
    }

    println(arrInt.joinToString())
}