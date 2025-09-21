package org.example.lesson11

class Room(
    val cover: String,
    val name: String,
    val members: MutableSet<Member>,
) {
    fun addMember(member: Member) {
        members.add(member)
    }

    fun changeStatus(memberName: String, newStatus: Status) {
        val memberByName = members.find {
            it.name == memberName
        }
        memberByName?.status = newStatus
    }
}

class Member(
    val name: String,
    val profilePicture: String,
    var status: Status,
)

enum class Status {
    MICRO_ON,
    MICRO_OFF,
    MUTED,
}

fun main() {

    val room = Room(
        cover = "pic.jpg",
        name = "my room!",
        members = mutableSetOf(
            Member("luda1", "ludapic.jpg", Status.MUTED),
            Member("luda2", "ludapic2.jpg", Status.MICRO_ON)
        )
    )

    room.addMember(Member("luda3", "dog.jpg", Status.MICRO_OFF))

    room.changeStatus("luda1", Status.MICRO_ON)
}