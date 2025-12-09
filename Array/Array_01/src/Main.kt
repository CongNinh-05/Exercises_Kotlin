/*Nhập vào 5 số nguyên, in ra tổng và số lớn nhất*/

fun main(){
    val arr = IntArray(5)

    for (i in arr.indices){
        print("Nhập số thứ ${i + 1}: ")
        arr[i] = readln().toInt()
    }

    val sum = arr.sum()
    val max = arr.maxOrNull()

    println("Tổng các số = $sum")
    println("Số lớn nhất = $max")
}