package PAPER_1.library_management_system.repository

import PAPER_1.library_management_system.model.LibraryBook
import PAPER_1.library_management_system.model.LibraryUser

interface MemberRepository {
    fun registerMember(member: LibraryUser)
    fun getAllMembers(): List<LibraryUser>

    fun updateMemberBorrowedBooks(memberId: Int, book: LibraryBook?)
}