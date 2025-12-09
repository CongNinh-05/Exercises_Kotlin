/*Tạo lớp “Person” với thuộc tính tên và tuổi. Tạo hai đối tượng của lớp “Person”,
thiết lập thuộc tính bằng constructor và in tên và tuổi của chúng.*/

class Person(val name: String, val age: Int) {
    fun displayInfo() {
        println("Tên: $name, Tuổi: $age")
    }
}

fun main() {
    val p1 = Person("Ninh", 20)
    val p2 = Person("Lan", 22)

    p1.displayInfo()
    p2.displayInfo()
}
