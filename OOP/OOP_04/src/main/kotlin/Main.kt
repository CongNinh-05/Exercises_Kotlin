/*
Tạo một lớp Person với các thuộc tính: name (String), age (Int), và một phương thức introduce()
để in ra thông tin cá nhân. Sau đó, tạo một object từ lớp này và gọi phương thức.
Gợi ý: Sử dụng constructor chính (primary constructor) trong Kotlin để khởi tạo thuộc tính.
Ví dụ: class Person(val name: String, var age: Int) { ... }.
*/

fun main(){
    val person = Person("Ninh", -5)
    person.introduce()
    person.age = 25
    person.introduce()
}

