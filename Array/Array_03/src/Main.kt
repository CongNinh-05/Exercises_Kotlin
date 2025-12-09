/*Cho trước mảng chứa các số nguyên arrInt. Bạn hãy viết chương trình để in ra

Tổng các phần tử chẵn sumEven
Tổng các phần tử lẻ sumOdd
Tổng tất cả các phần tử sumAll */

fun main(){
    val arrInt = IntArray(5)

    for (i in arrInt.indices){
        print("Nhập số thứ ${i + 1}: ")
        arrInt[i] = readln().toInt()
    }

    var sumEven = 0
    var sumOdd = 0
    var sumAll = 0

    for (x in arrInt){
        sumAll += x
        if (x % 2 == 0) sumEven += x else sumOdd += x
    }

    println("Tổng tất cả = $sumAll")
    println("Tổng các số chẳn = $sumEven")
    println("Tổng các số lẻ = $sumOdd")
}