/*
Tạo interface Animal với phương thức makeSound().
Tạo hai lớp Dog và Cat implement interface này,
mỗi lớp override makeSound() khác nhau (ví dụ: "Woof!" và "Meow!").
Tạo list các Animal và gọi makeSound() cho từng phần tử.
Gợi ý: Sử dụng val animals: List<Animal> = listOf(Dog(), Cat()) để thể hiện đa hình.
*/

fun main(){
    val animal : List<Animal> = listOf(Dog(),Cat())
    animal.forEach { it.makeSound() }
}