open class Vehicle(var speed : String) {
    open fun move(){
        println("Vehicle is moving at $speed km/h.")
    }
}