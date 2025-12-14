/*
Tạo một sealed class Shape với các lớp con: Circle(radius: Double), Rectangle(width: Double, height: Double).
Viết hàm calculateArea(shape: Shape): Double sử dụng when expression để tính diện tích.
Gợi ý: Sealed class hữu ích cho các loại kế thừa hạn chế, và when sẽ kiểm tra tất cả các trường hợp.
*/

sealed class Shape

class Circle(var radius: Double) : Shape()

class Rectangle(var width: Double, var height: Double) : Shape()

fun calculateArea(shape: Shape) : Double = when(shape){
    is Circle -> Math.PI * shape.radius * shape.radius
    is Rectangle -> shape.width * shape.height
}

fun main(){
    val circle = Circle(5.0)
    val rect = Rectangle(4.0, 6.0)
    println(calculateArea(circle))
    println(calculateArea(rect))
}
