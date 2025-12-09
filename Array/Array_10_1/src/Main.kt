/*Cho trước mảng chứa các số nguyên arrInt (tồn tại ít nhất một phần tử).
Bạn hãy viết chương trình để in ra trung bình cộng các phần tử trong arrInt
nhưng loại trừ phần tử có giá trị lớn và phần tử có giá trị nhỏ nhất trong arrInt*/


fun main() {
    val arrInt = arrayOf(1, 2, 4, 6, 7)
    val max = arrInt.maxOrNull()
    val min = arrInt.minOrNull()

    var filtered = arrInt.filter { it != max && it != min }

    if (filtered.isNotEmpty()){
        val avg = filtered.average()
        println("-> $avg")
    }
    else{
        println("Không tồn tại giá trị nào!")
    }

}