class DVD(title: String, year: Int, val director: String) : Media(title, year), LibraryItem {
    override fun play() {
        println("Watching DVD: $title directed by $director ($year)")
    }

    override fun getDetails(): String {
        return "DVD: $title, Director: $director, Year: $year"
    }
}