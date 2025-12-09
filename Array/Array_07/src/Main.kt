/*Cho trước mảng chứa các số nguyên arrInt (tồn tại ít nhất một phần tử).
Bạn hãy viết chương trình để cập nhật giá trị các phần tử trong arrInt bằng giá trị
của phần tử lớn nhất trong arrInt*/

fun main(){
    val arrInt = arrayOf(1, 2, 6, 9, 10)
    var max = arrInt[0]

    for (i in arrInt.indices){
        if (max < arrInt[i]){
            max = arrInt[i]
        }
    }

    for (i in arrInt.indices){
        arrInt[i] = max
    }

    println("-> ${arrInt.joinToString()}")
}