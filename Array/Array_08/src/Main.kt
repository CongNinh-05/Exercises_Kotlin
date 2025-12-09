/*Cho trước mảng chứa các số nguyên arrInt (tồn tại ít nhất một phần tử).
Bạn hãy viết chương trình để in ra giá trị trung bình của các phần tử
có giá trị chẵn và xuất hiện ở vị trí lẻ trong mảng arrInt đã cho
(vị trí bắt đầu từ 1, 2, … thì chỉ số bắt đầu từ 0, 1, …)*/



fun main(){
    val arrInt = arrayOf(2, 1, 4, 5, 6, 8, 9 )
    var sum = 0
    var count = 0

    for (i in arrInt.indices){
        if ((i+1) % 2 != 0 && arrInt[i] % 2 == 0){
            sum += arrInt[i]
            count ++
        }
    }

    if (count > 0){
        val avg = sum.toDouble() / count
        println("-> $avg")
    }
    else{
        println("Không có phần chẵn ở vị trí lẻ")
    }
}