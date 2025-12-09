/*Bài 2: Kiểm tra chuỗi rỗng

Nhập 1 chuỗi, in ra "Chuỗi rỗng" nếu không có ký tự.*/

fun main(){
    print("Nhập 1 chuỗi: ")
    val s = readln()

    if (s.isEmpty()){
        println("Chuỗi rỗng")
    }
    else{
        println("Chuỗi có nội dung: $s")
    }
}