package PAPER_1.library_management_system.model

data class LibraryBook(
    val bookId: Int,
    val title: String,
    val author: String,
    val category: BookCategory,
    var quantity: Int,
) {
    companion object {
        fun createBook(
            bookId: Int,
            title: String,
            author: String,
            category: BookCategory,
            quantity: Int,
        ): LibraryBook {
            return LibraryBook(
                bookId = bookId,
                title = title,
                author = author,
                category = category,
                quantity = quantity,
            )
        }
    }
}
