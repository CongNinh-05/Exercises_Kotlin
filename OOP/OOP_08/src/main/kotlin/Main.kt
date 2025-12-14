/*
Tạo lớp BankAccount với thuộc tính balance (Double, private),
và các phương thức deposit(amount: Double) để cộng tiền,
withdraw(amount: Double) để trừ tiền (kiểm tra nếu balance đủ),
và getBalance() để lấy số dư.
Đảm bảo không thể truy cập trực tiếp balance từ bên ngoài.
Gợi ý: Sử dụng private var balance
và getter/setter tùy chỉnh nếu cần (Kotlin hỗ trợ property với backing field)
*/

fun main(){
    val account = BankAccount()
    account.deposit(100.0)  // Output: Deposited 100.0. New balance: 100.0
    account.withdraw(50.0)  // Output: Withdrew 50.0. New balance: 50.0
    account.withdraw(100.0) // Output: Invalid withdrawal amount or insufficient balance.
    println(account.getBalance())  // Output: 50.0
}