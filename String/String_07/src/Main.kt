/*Bài 8: Đếm số lần xuất hiện của ký tự

👉 Kiến thức: .count { }*/

fun main(){
    print("Nhập chuỗi: ")
    val s = readln()
    print("Nhâ kí tự cần đếm: ")
    val c = readln()[0]
    val count = s.count{it == c}
    println("Ký tự '$c' xuất hiện $count lần")
}