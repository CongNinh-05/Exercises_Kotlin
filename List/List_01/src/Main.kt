/*Yêu cầu: Viết một chương trình Kotlin để tạo một danh sách các số nguyên,
thêm 5 số vào danh sách, sau đó in từng phần tử trong danh sách.*/

fun main(){
    val numbers = mutableListOf<Int>()
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)
    numbers.add(4)
    numbers.add(5)
    numbers.forEach { println(it) }
}