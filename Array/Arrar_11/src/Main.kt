/*Cho trước mảng chứa các số nguyên arrInt (tồn tại ít nhất một phần tử).
Bạn hãy viết chương trình tạo ra mảng mới (hoặc cập nhật trên mảng cũ)
sao cho mảng này không còn bất kỳ giá trị trùng nhau nào từ mảng arrInt ban đầu*/


fun main(){
    val arrInt = arrayOf(1, 2, 2, 4, 5, 6, 7, 7, 8)
    val n = arrInt.size
    val temp = Array(n){0}
    var newSize = 0

    for (i in 0 until n){
        var duplicate = false

        for (j in 0 until newSize){
            if (arrInt[i] == temp[j]){
                duplicate = true
                break
            }
        }

        if (!duplicate){
            temp[newSize] = arrInt[i]
            newSize ++
        }
    }

    print("Mảng không trùng: ")
    for (i in 0 until newSize) {
        print("${temp[i]} ")
    }
}