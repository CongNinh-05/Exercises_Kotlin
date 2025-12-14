open class Media(val title: String, initialYear: Int) {
    protected var year : Int = initialYear
        get() = field
        set(value) {
            if (value > 1900) field = value else println("Year must be > 1900!")
        }

    open fun play() {
        println("Playing media: $title ($year)")
    }

    fun updateYear(newYear: Int) {
        year = newYear  // Sử dụng setter để cập nhật
    }
}