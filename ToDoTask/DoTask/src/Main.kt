/*Bạn cần viết một chương trình console đơn giản để quản lý danh sách nhiệm vụ hàng ngày.
Chương trình sẽ có menu chính, cho phép người dùng thực hiện các chức năng sau:

Thêm nhiệm vụ mới: Nhập tên nhiệm vụ (String), ưu tiên (Int từ 1-5),
và trạng thái hoàn thành (Boolean: true/false). Lưu vào một MutableList.
In danh sách nhiệm vụ: In tất cả nhiệm vụ với định dạng đẹp (sử dụng vòng lặp for).
Tìm kiếm nhiệm vụ: Tìm theo tên (không phân biệt hoa/thường), in ra nếu tìm thấy.
Cập nhật trạng thái nhiệm vụ: Tìm theo tên, cập nhật trạng thái hoàn thành (true/false).
Xóa nhiệm vụ: Tìm theo tên, xóa khỏi danh sách.
Tính toán thống kê: Tính số nhiệm vụ hoàn thành, chưa hoàn thành, và trung bình ưu tiên
(sử dụng loop và toán tử).
Thoát chương trình.*/


fun main() {
    val todoList = mutableListOf<List<Any>>()

    do {
        println("\n == Quản lý danh sách nhiệm vụ ==")
        println("1. Thêm nhiệm vụ.")
        println("2. In danh sách nhiệm vụ.")
        println("3. Tìm kiếm nhiệm vụ.")
        println("4. Cập nhập trạng thái nhiệm vụ.")
        println("5. Xóa nhiệm vụ.")
        println("6. Thống kê nhiệm vụ.")
        println("7. Thoát")

        val choice = readln()?.toIntOrNull()?:0

        when(choice){
            1 -> addTask(todoList)
            2 -> printTasks(todoList)
            3 -> searchTasks(todoList)
            4 -> updateTaskStatus(todoList)
            5 -> deleteTask(todoList)
            6 -> showStatistics(todoList)
            7 -> println("Tạm biệt")
            else -> println("Lựa chọn không hợp lệ. Vui lòng chọn lại")
        }
    }while (choice != 7)
}

//Hàm thệm nhiệm vụ
fun addTask(todoList: MutableList<List<Any>>){
    print("Nhâp thêm nhiệm vụ: ")
    val name = readln()?:""
    print("Nhập ưu tiên (1-5): ")
    val priority = readln()?.toIntOrNull()?:1
    print("Trạng thái hoàn thành(true/false): ")
    val comepleted = readln()?.toBooleanStrictOrNull()?:false

    //Tạo list con cho nhiệm vụ
    val task = listOf(name, priority, comepleted)
    todoList.add(task)
    println("Nhiệm vụ $name đã được hoàn thành")
}

//Hàm in danh sách
fun printTasks(todoList: MutableList<List<Any>>){
    if (todoList.isNotEmpty()){
        println("Danh sách nhiệm vụ rỗng")
        return
    }

    println("\n Danh sách nhiệm vụ: ")
    for ((index, task) in todoList.withIndex()){
        val name = task[0] as String
        val priority = task[1] as Int
        val completed = task[2] as Boolean
        println("${index + 1}. Tên: $name, Ưu tiên: $priority, Hoàn thành: $completed")
    }
}

//Hàm tìm kiếm
fun searchTasks(todoList: MutableList<List<Any>>){
    print("Nhập tên nhiệm vụ cần tìm: ")
    val searchName = readln()?.lowercase()?:" "

    var found = false

    for (task in todoList){
        val name = (task[0] as String).lowercase()
        if (name.contains(searchName)){
            println("Tìm thấy: Tên: ${task[0]}, Ưu tiên: ${task[1]}, Hoàn thành: ${task[2]}")
            found = true
        }
    }
    if (!found) println("Không tìm thấy nhiệm vụ")
}

//Hàm cập nhật trạng thái
fun updateTaskStatus(todoList: MutableList<List<Any>>){
    print("Nhập tên nhiệm vụ cần nhập: ")
    val updateName = readln()?.lowercase()?:" "
    var found = false
    for (task in todoList){
        if (task[0] as String == updateName){
            print("Nhập trạng thái mới (true/false): ")
            val newStatus = readln()?.toBooleanStrictOrNull()?:false
            val newTask = listOf(task[0], task[1], newStatus)
            val index = todoList.indexOf(task)
            todoList[index] = newTask
            println("Đã cập nhật trạng thái cho '$updateName' thành $newStatus.")
            found = true
            break
        }
    }
    if (!found) println("Không tìm thấy nhiệm vụ.")
}

//Hàm xóa
fun deleteTask(todoList: MutableList<List<Any>>){
    print("Nhập nhiệm vụ vần xóa: ")
    val deleteName = readln()?:" "
    var found = false
    val iterator = todoList.iterator()
    while (iterator.hasNext()){
        val task = iterator.next()
        if (task[0] as String == deleteName){
            iterator.remove()
            println("Đã xóa nhiệm vụ '$deleteName'")
            found = true
            break
        }
    }
    if (!found) println("Không tìm thấy nhiệm vụ")
}

//Hàm thống kê
fun showStatistics(todoList: MutableList<List<Any>>){
    if (todoList.isEmpty()) {
        println("Danh sách rỗng, không có thống kê.")
        return
    }

    var completedCount = 0
    var totalPriority = 0.0
    for (task in todoList) {
        if (task[2] as Boolean) completedCount++
        totalPriority += (task[1] as Int).toDouble()  // Chuyển Int sang Double để tính trung bình
    }

    val unfinishedCount = todoList.size - completedCount
    val averagePriority = totalPriority / todoList.size

    println("\nThống kê:")
    println("Số nhiệm vụ hoàn thành: $completedCount")
    println("Số nhiệm vụ chưa hoàn thành: $unfinishedCount")
    println("Trung bình ưu tiên: $averagePriority")
}







