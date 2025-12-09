/*Bài 5: Kiểm tra chuỗi Palindrome

(Chuỗi đọc xuôi ngược giống nhau, vd: "level", "madam")
👉 Kiến thức: .reversed()*/


fun main(){
    print("Nhập chuỗi: ")
    val s = readln()
    if (s.equals(s.reversed(),true)){
        println("Chuỗi Palindrome")
    }else{
        println("Chuỗi không phải Palindrome")
    }
}