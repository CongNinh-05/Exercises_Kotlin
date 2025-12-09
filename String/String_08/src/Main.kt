/*Bài 10: Kiểm tra email hợp lệ (cơ bản)

👉 Kiến thức: .contains(), .endsWith()*/


fun main() {
    print("Nhập email: ")
    val email = readln()
    if (email.contains("@") && email.endsWith(".com")) {
        println("Email hợp lệ")
    } else {
        println("Email không hợp lệ")
    }
}
