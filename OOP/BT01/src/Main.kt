/*Tạo lớp “Library” với một bộ sưu tập sách và các phương thức để thêm và xóa sách.*/

class Library{
    private val books = mutableListOf<String>()

    fun addBook(book: String){
        books.add(book)
        println("Đã thêm sách: $book")
    }

    fun removeBook(book: String){
        if (books.contains(book)){
            books.remove(book)
            println("Đã xóa sách: $book")
        }else{
            println("Không tìm thấy sách: $book")
        }
    }

    fun showBooks(){
        if (books.isEmpty()){
            println("Sách trong thư viện đang trống!")
        }
        else{
            for (book in books){
                println("- $book")
            }
        }
    }

}

fun main(){
    val myLibrary = Library()

    myLibrary.addBook("Dế Mèn Phiêu Lưu Ký")
    myLibrary.addBook("Harry Potter")
    myLibrary.addBook("Lập trình Kotlin cơ bản")

    myLibrary.showBooks()

    myLibrary.removeBook("Harry Potter")
    myLibrary.removeBook("One Piece") // không tồn tại

    myLibrary.showBooks()
}