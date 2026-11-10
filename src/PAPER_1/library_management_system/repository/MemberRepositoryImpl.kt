package PAPER_1.library_management_system.repository

import PAPER_1.library_management_system.model.LibraryBook
import PAPER_1.library_management_system.model.LibraryUser

class MemberRepositoryImpl: MemberRepository {
    val membersDb = mutableListOf<LibraryUser>()

    override fun registerMember(member: LibraryUser) {
        membersDb.add(member)
    }

    override fun getAllMembers(): List<LibraryUser> {
        return membersDb
    }

    override fun updateMemberBorrowedBooks(memberId: Int, book: LibraryBook?) {
        membersDb.find { m -> m.id == memberId }?.apply {
            if (book != null) {
                borrowedBooks.add(book)
            }
        }
    }

    override fun removeMemberBorrowedBooks(memberId: Int, bookId: Int) {
        membersDb.find { m -> m.id == memberId }?.apply {
            borrowedBooks.remove(borrowedBooks.find { b -> b.bookId == bookId })
        }
    }
}