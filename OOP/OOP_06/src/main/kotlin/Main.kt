/*
Lớp con kế thừa
Tạo lớp cha Vehicle với thuộc tính speed và phương thức move().
Tạo lớp con Car kế thừa từ Vehicle, thêm thuộc tính brand và override phương thức move() để in thông tin cụ thể.
Tạo object Car và gọi phương thức.
Gợi ý: Sử dụng open class Vehicle để cho phép kế thừa, và override fun move() trong lớp con.
*/

fun main(){
    val car = Car(120, "Toyota")
    car.move()  // Output: Toyota car is moving at 120 km/h.
}