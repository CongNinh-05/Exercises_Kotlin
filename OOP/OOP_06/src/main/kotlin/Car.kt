class Car(speed : Int, var brand : String) : Vehicle(speed = speed.toString()) {
    override fun move() {
        println("$brand car is moving at $speed km/h.")
    }
}