/*Bạn cần viết một chương trình console để quản lý một cửa hàng sách.
Mỗi cuốn sách được lưu với các thông tin: tên sách (String), giá (Double),
và số lượng tồn kho (Int). Chương trình sẽ có một menu chính với các chức năng sau:

Thêm sách mới: Nhập tên sách, giá, và số lượng tồn kho. Lưu vào MutableList.
Hiển thị danh sách sách: In tất cả sách với định dạng đẹp (số thứ tự, tên, giá, số lượng).
Tìm kiếm sách theo tên: Nhập tên sách, tìm và in thông tin sách (không phân biệt hoa/thường).
Cập nhật số lượng tồn kho: Nhập tên sách và số lượng mới, cập nhật số lượng.
Xóa sách: Nhập tên sách, xóa sách khỏi danh sách.
Tính tổng giá trị tồn kho: Tính tổng giá trị (giá * số lượng) của tất cả sách.
Lọc sách theo giá: Nhập giá tối thiểu, in danh sách sách có giá lớn hơn hoặc bằng giá đó.
Thoát chương trình.*/

fun main(){
    val bookList = mutableListOf<List<Any>>()

    do {
        println("\n=== Quản lý Cửa hàng Sách ===")
        println("1. Thêm sách mới")
        println("2. Hiển thị danh sách sách")
        println("3. Tìm kiếm sách theo tên")
        println("4. Cập nhật số lượng tồn kho")
        println("5. Xóa sách")
        println("6. Tính tổng giá trị tồn kho")
        println("7. Lọc sách theo giá")
        println("8. Thoát")

        print("Chọn chức năng (1-8): ")
        val choice = readln().toIntOrNull()?:0

        when(choice){
            1 -> addBook(bookList)
            2 -> displayBooks(bookList)
            3 -> searchBook(bookList)
            4 -> updateStock(bookList)
            5 -> deleteBook(bookList)
            6 -> caculateTotalValue(bookList)
            7 -> filterBooksByPrice(bookList)
            8 -> println("Tạm biệt!")
            else -> println("Lựa chọn không hợp lệ. Vui lòng chọn lại.")
        }

    }while (choice != 8)

}

//Thêm sách mới
fun addBook(bookList: MutableList<List<Any>>){
    print("Nhập tên sách: ")
    val name = readln()?:""
    if (name.isBlank()){
        println("Tên sách không được để trống.")
        return
    }

    print("Nhập giá sách(VNĐ): ")
    val price = readln()?.toDoubleOrNull()?:0.0
    if (price <= 0){
        println("Giá phải lớn hơn 0 (VNĐ)")
        return
    }

    print("Số lượng tồn kho: ")
    val stock = readln()?.toIntOrNull()?:0
    if (stock <= 0){
        println("Số lượng không được âm.")
        return
    }

    val book = listOf(name, price, stock)
    bookList.add(book)
    println("Đã thêm sách '$name'.")
}

//Hiển thị dach sách
fun displayBooks(bookList: MutableList<List<Any>>){
    if (bookList.isNotEmpty()){
        println("Danh sách sách rỗng.")
        return
    }

    println("\n Danh sách sách")
    for ((index, book) in bookList.withIndex()){
        val name = book[0] as String
        val price = book[1] as Double
        val stock = book[2] as Int
        println("${index + 1}. Tên: $name, Giá: ${String.format("%.2f", price)} VND, Tồn kho: $stock")
    }
}

//Tìm kiếm
fun searchBook(bookList: MutableList<List<Any>>){
    print("Nhập tên sách cần tìm: ")
    val searchName = readln()?: " "
    var found = false
    for (book in bookList){
        val name = (book[0] as String).lowercase()
        if (name.contains(searchName)){
            val price = book[1] as Double
            val stock = book[2] as Int
            println("Tìm thấy: Tên: ${book[0]}, Giá: ${String.format("%.2f", price)} VND, Tồn kho: $stock")
            found = true
        }
    }
    if (!found) println("Không tìm thấy sách.")
}

//Cập nhật tồn kho
fun updateStock(bookList: MutableList<List<Any>>){
    print("Nhập tên sách cần cập nhật: ")
    val updateName = readLine() ?: ""

    var found = false
    for (book in bookList) {
        if (book[0] as String == updateName) {
            print("Nhập số lượng tồn kho mới: ")
            val newStock = readLine()?.toIntOrNull() ?: -1
            if (newStock < 0) {
                println("Số lượng không được âm.")
                return
            }
            val newBook = listOf(book[0], book[1], newStock)
            val index = bookList.indexOf(book)
            bookList[index] = newBook
            println("Đã cập nhật số lượng cho '$updateName' thành $newStock.")
            found = true
            break
        }
    }
    if (!found) println("Không tìm thấy sách.")
}

//Xóa sách
fun deleteBook(bookList: MutableList<List<Any>>){
    print("Nhập tên sách cần xóa: ")
    val deleteName = readLine() ?: ""

    val iterator = bookList.iterator()
    var found = false
    while (iterator.hasNext()) {
        val book = iterator.next()
        if (book[0] as String == deleteName) {
            iterator.remove()
            println("Đã xóa sách '$deleteName'.")
            found = true
            break
        }
    }
    if (!found) println("Không tìm thấy sách.")
}

//Tính tổng giá trị tồn kho
fun caculateTotalValue(bookList: MutableList<List<Any>>){
    if (bookList.isEmpty()) {
        println("Danh sách sách rỗng.")
        return
    }

    var totalValue = 0.0
    for (book in bookList) {
        val price = book[1] as Double
        val stock = book[2] as Int
        totalValue += price * stock
    }
    println("Tổng giá trị tồn kho: ${String.format("%.2f", totalValue)} VND")
}

//Lọc sách theo giá
fun filterBooksByPrice(bookList: MutableList<List<Any>>){
    print("Nhập giá tối thiểu (VND): ")
    val minPrice = readLine()?.toDoubleOrNull() ?: 0.0
    if (minPrice < 0) {
        println("Giá tối thiểu không được âm.")
        return
    }

    val filteredBooks = bookList.filter { (it[1] as Double) >= minPrice }
    if (filteredBooks.isEmpty()) {
        println("Không có sách nào có giá >= $minPrice VND.")
        return
    }

    println("\nSách có giá >= ${String.format("%.2f", minPrice)} VND:")
    for ((index, book) in filteredBooks.withIndex()) {
        val name = book[0] as String
        val price = book[1] as Double
        val stock = book[2] as Int
        println("${index + 1}. Tên: $name, Giá: ${String.format("%.2f", price)} VND, Tồn kho: $stock")
    }
}