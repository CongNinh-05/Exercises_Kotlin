/*Tạo một lớp Car với các thuộc tính brand (String), speed (Int),
và các phương thức accelerate() (tăng tốc độ thêm 10),
brake() (giảm tốc độ đi 10, nhưng không dưới 0).
Tạo một đối tượng từ lớp này và gọi các phương thức trong hàm main.*/

class Car{
    var brand : String ="Unknow"
    var speed : Int = 0

    fun accelerate(){
        speed += 10
        println("$brand is accelerating. Current speed: $speed km/h")
    }

    fun brake(){
        speed = maxOf(0, speed - 10)
        println("$brand is braking. Current speed: $speed km/h")
    }
}


fun main(){
    val myCar = Car()
    myCar.brand = "Toyota"
    myCar.accelerate()
    myCar.accelerate()
    myCar.brake()
    myCar.brake()
}