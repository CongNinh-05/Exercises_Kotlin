/*Yêu cầu: Xóa tất cả các số lẻ khỏi một MutableList.*/

fun main(){
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    numbers.removeIf { it % 2 != 0 }
    println(numbers)
}