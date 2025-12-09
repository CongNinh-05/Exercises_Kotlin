/*Đếm số lần xuất hiện của một phần tử cụ thể*/



fun main(){
    val numbers = listOf(1, 3, 2, 3, 4, 3, 5)
    val target = 3
    val count = numbers.count{it == target}
    println(count)
}