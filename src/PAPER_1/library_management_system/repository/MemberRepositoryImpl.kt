package PAPER_1.library_management_system.repository

import PAPER_1.library_management_system.model.LibraryUser

class MemberRepositoryImpl: MemberRepository {
    val membersDb = mutableListOf<LibraryUser>()

    override fun registerMember(member: LibraryUser) {
        membersDb.add(member)
    }

    override fun getAllMembers(): List<LibraryUser> {
        return membersDb
    }
}