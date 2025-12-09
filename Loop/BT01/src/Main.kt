fun main(){
    print("Bản cửu chương bạn muốn nhập là: ")
    val number  = readln()!!.toInt()
    for(i in 1..10){
        println("$number *  $i = ${number*i}")
    }
}