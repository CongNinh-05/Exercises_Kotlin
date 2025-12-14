class Book(title: String, year: Int, val author: String) : Media(title, year), LibraryItem{

    override fun play() {
        println("Reading book: $title by $author ($year)")
    }

    override fun getDetails(): String {
        return "Book: $title, Author: $author, Year: $year"
    }
}