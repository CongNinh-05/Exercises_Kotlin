/*Bài 3: Đếm số nguyên âm trong chuỗi

👉 Kiến thức: vòng lặp + .contains()*/

fun main(){
    print("Nhập chuỗi: ")
    val s = readln().lowercase()
    val vowels = "aeiou"
    var count = 0
    for (c in s){
        if (c in vowels){
            count ++
        }
    }
    println(count)
}