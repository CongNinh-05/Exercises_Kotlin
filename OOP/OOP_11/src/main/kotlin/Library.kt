class Library {
    private val items: MutableList<LibraryItem> = mutableListOf()  // Encapsulation: List private

    fun addItem(item: LibraryItem) {
        items.add(item)
    }

    fun displayAll() {
        items.forEach {
            println(it.getDetails())
            if (it is Media) it.play()
        }
    }
}