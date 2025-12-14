/*
Tạo một data class Book với thuộc tính title, author, và year.
Tạo vài object và sử dụng các hàm tự động như toString(), equals(), copy().
So sánh hai sách giống nhau.
Gợi ý: Data class tự động cung cấp các hàm tiện ích, giúp đơn giản hóa việc làm việc với dữ liệu immutable.*/

data class Book(var title : String, var author : String, var year : Int)

fun main(){
    val book1 = Book("Kotlin in Action", "Dmitry Jemerov", 2017)
    val book2 = book1.copy(year = 2020)  // Sao chép và thay đổi year
    println(book1)
    println(book1 == book2)  // Output: false (vì year khác)
}
