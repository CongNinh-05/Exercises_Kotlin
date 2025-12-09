/*Bài 7: Viết hoa chữ cái đầu mỗi từ

👉 Kiến thức: .split(), .replaceFirstChar()*/



fun main(){
    print("Nhập vão chuỗi: ")
    val s = readln()

    val result = s.split(" ").joinToString(" "){
        it.replaceFirstChar{s -> s.uppercase()}
    }

     println("-> $result")
}