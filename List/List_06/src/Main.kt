/*Yêu cầu: Đảo ngược thứ tự các phần tử trong danh sách mà không dùng reversed().*/

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val reversed = mutableListOf<Int>()

    for (i in numbers.size - 1 downTo 0){
        reversed.add(numbers[i])
    }

    println(reversed)
}