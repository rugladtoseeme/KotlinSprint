package org.example.lesson11

class Forum {
    private val members: MutableList<Member> = mutableListOf()
    private val messages: MutableList<Message> = mutableListOf()

    fun createNewUser(_username: String): Member {
        val lastElem = members.lastOrNull()
        val newId = if (lastElem == null) 1 else lastElem.userId + 1
        val newMember = Member(userId = newId, username = _username)
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(_message: String, _authorId: Int): Message? {
        if (members.find { it.userId == _authorId } == null) {
            println("на форуме нет такого зарегистрированного пользователя")
            return null
        }
        val newMessage = Message(authorId = _authorId, message = _message)
        messages.add(newMessage)
        return newMessage
    }

    fun printThread() {
        for (i in messages) {
            println("автор: ${members.find { it.userId == i.authorId }?.username}: сообщение: ${i.message}")
        }
    }
}

class Member(
    val userId: Int,
    val username: String,
)

class Message(
    val authorId: Int,
    val message: String
)

fun main() {

    val forum = Forum()
    forum.createNewUser("Ivan")
    forum.createNewUser("Petr")
    forum.createNewMessage("привет!", 1)
    forum.createNewMessage("привет!", 2)
    forum.createNewMessage("как дела?", 1)
    forum.createNewMessage("хорошо, а у тебя?", 2)

    forum.printThread()
}