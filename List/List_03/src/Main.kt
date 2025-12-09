/*Yêu cầu: Lọc và tạo danh sách mới chỉ chứa các số chẵn.*/

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)
}