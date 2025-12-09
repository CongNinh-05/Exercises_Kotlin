/*Cho trước mảng chứa các số nguyên arrInt (tồn tại ít nhất một phần tử).
Bạn hãy viết chương trình để in ra giá trị lớn nhất trong mảng arrInt */



fun main(){
    val arrInt = arrayOf(1, 2, 3, 5, 5, 6, 8, 9)

    var max = arrInt[0]

    for (i in arrInt){
        if (max < i){
            max = i
        }
    }

    println("Max = $max")
}