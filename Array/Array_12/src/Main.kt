/*Cho trước mảng chứa các số nguyên arrInt (tồn tại ít nhất một phần tử).
Bạn hãy viết chương trình để in ra giá trị “Tăng dần” hoặc “Không tăng dần”
tùy theo tính chất của mảng arrInt

Mảng tăng dần là mảng có các phần tử được sắp xếp tăng dần từ trái qua phải*/

fun main(){
    val arrInt = arrayOf(1, 2, 3, 7, 5)
    var check = false

    for (i in 0 until arrInt.size - 1){
      if (arrInt[i] > arrInt[i + 1]){
          check = true
          break
      }
    }

    if (check){
        println("Mảng sắp xếp không tăng dần")
    }
    else{
        println("Mảng sắp xếp tăng dần")
    }
}