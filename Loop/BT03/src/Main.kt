/*Cho trước 2 số nguyên start và end lần lượt là giá trị bắt đầu và giá trị kết thúc
của một dãy số chẵn. Bạn hãy viết chương trình để in ra các số chẵn nằm trong khoảng
từ start đến end (không bao gồm start và end)*/

fun checkEvenOdd(a: Int, b: Int) : String{
    var result = " "
    for (i in a + 1 until b ){
        if (i % 2 ==0){
            result += " $i"
        }
    }
    return if (result.isEmpty()) "Không có" else result.trim()
}


fun main(){
    print("Nhập giá trị start: ")
    val numberStart = readLine()!!.toInt()
    print("Nhập vào giá trị end: ")
    val numberEnd = readLine()!!.toInt()
    val result = checkEvenOdd(numberStart, numberEnd)
    println("Các số chẵn trong khoảng là: $result")
}