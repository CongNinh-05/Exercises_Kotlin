/*
Yêu cầu bài tập: Xây dựng một hệ thống quản lý thư viện đơn giản.
Sử dụng Abstraction: Tạo interface LibraryItem với phương thức trừu tượng getDetails().
Sử dụng Encapsulation: Lớp Book với thuộc tính private và getter/setter.
Sử dụng Inheritance: Lớp cha Media kế thừa cho Book và DVD.
Sử dụng Polymorphism: Tạo list kiểu cha để quản lý các item, và gọi phương thức override.
Yêu cầu cụ thể: Tạo class quản lý (Library), thêm item, và hiển thị chi tiết.
*/

fun main(){
    val library = Library()

    val book = Book("Kotlin Programming", 2017, "John Doe")
    book.updateYear(2020)
    library.addItem(book)

    val dvd = DVD("Inception", 2010, "Christopher Nolan")
    dvd.updateYear(1890)
    library.addItem(dvd)

    library.displayAll()
}