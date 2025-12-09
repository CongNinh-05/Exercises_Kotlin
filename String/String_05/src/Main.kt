/*Bài 6: Tách từ trong câu

👉 Kiến thức: .split(" ")*/

fun main() {
    print("Nhập câu: ")
    val s = readln()
    val words = s.split(" ")
    println("Số từ: ${words.size}")
    println("Các từ: $words")
}
