package org.example.lesson11

class Forum {
    private val members: MutableList<Member> = mutableListOf()
    private val messages: MutableList<Message> = mutableListOf()

    fun createNewUser(username: String): Member {
        val lastElem = members.lastOrNull()
        val newId = if (lastElem == null) 1 else lastElem.userId + 1
        val newMember = Member.Builder()
            .userId(newId)
            .username(username)
            .build()
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(message: String, authorId: Int): Message? {
        if (members.find { it.userId == authorId } == null) {
            println("на форуме нет такого зарегистрированного пользователя")
            return null
        }
        val newMessage = Message.Builder()
            .authorId(authorId)
            .message(message)
            .build()
        messages.add(newMessage)
        return newMessage
    }

    fun printThread() {
        for (i in messages) {
            println("автор: ${i.authorId}: сообщение: ${i.message}")
        }
    }
}

class Member(
    memberBuilder: Builder,
) {
    val userId: Int = memberBuilder.userId
    val username: String = memberBuilder.username

    class Builder {
        var userId: Int = 0
        var username: String = ""

        fun userId(userId: Int): Builder {
            this.userId = userId
            return this
        }

        fun username(username: String): Builder {
            this.username = username
            return this
        }

        fun build(): Member = Member(this)
    }

}

class Message(
    messageBuilder: Builder,
) {
    val authorId: Int = messageBuilder.authorId
    val message: String = messageBuilder.message

    class Builder {
        var authorId: Int = 0
        var message: String = ""

        fun authorId(authorId: Int): Builder {
            this.authorId = authorId
            return this
        }

        fun message(message: String): Builder {
            this.message = message
            return this
        }

        fun build(): Message = Message(this)
    }

}

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