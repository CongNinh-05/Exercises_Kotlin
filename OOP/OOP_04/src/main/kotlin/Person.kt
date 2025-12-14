class Person(val name : String, initialAge: Int) {

    var age : Int = 0
        set(value){
            field = if (value > 0) value else 18
        }

    init {
        age = initialAge  // Gán qua property để gọi setter và kiểm tra
    }

    fun introduce(){
        println("Hi, I'm $name and I'm $age years old." )
    }
}