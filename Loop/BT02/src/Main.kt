/*Bạn hãy viết chương trình để in ra phép nhân từ 1 đến 10 của number cho trước
(bảng cửu chương của number) */

fun main(){
    for(i in 1..10){
        println("  ")
        println("---------------------")
        println("Bảng cửu chương $i")
        println("---------------------")
        for(j in 1..10){
            println("$i * $j = ${i*j}")
        }
    }
}