/*Tạo một lớp BankAccount với thuộc tính accountNumber (String)
và balance (Double, private).
Cung cấp phương thức công khai để nạp tiền (deposit),
rút tiền (withdraw), và kiểm tra số dư
(getBalance). Đảm bảo không thể rút tiền nếu số dư không đủ.*/



class BankAccount(val accountNumber: String){
    private var balance: Double = 0.0

    fun deposit(amount: Double){
        if (amount > 0){
            balance += amount
            println("Deposited $amount. New balance: $balance")
        }else {
            println("Invalid deposit amount")
        }
    }

    fun withdraw(amount: Double){
        if (amount > 0 && amount <= balance){
            balance -= amount
            println("Deposited $amount. New balance: $balance")
        }else {
            println("Invalid withdraw amount or insufficient balance")
        }
    }

    fun getBalance(): Double{
        return balance
    }
}

fun main(){
    val account = BankAccount("12345678")
    account.deposit(1000.0)  // Nạp 1000
    account.withdraw(500.0)  // Rút 500
    account.withdraw(700.0)  // Thử rút quá số dư
    println("Final balance: ${account.getBalance()}")
}