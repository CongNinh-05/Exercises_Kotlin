/*Yêu cầu: Tìm phần tử lớn nhất trong danh sách số nguyên.*/

fun main(){
    val numbers = mutableListOf(1, 2, 3,4 ,5 ,6, 7, 8, 9)
    val max = numbers.maxOrNull()
    println(max)
}