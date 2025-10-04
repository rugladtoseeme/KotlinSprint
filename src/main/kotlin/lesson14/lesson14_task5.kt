package org.example.lesson14

class Chat() {
    val messages: MutableList<Message1> = mutableListOf()
    private var lastMessageId = 0

    fun addMessage(text: String, author: String): Int {
        messages.add(Message1(text, author, ++lastMessageId))
        return lastMessageId
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        messages.add(ChildMessage(text, author, parentMessageId = parentMessageId, id = ++lastMessageId))
    }

    fun printChat() {
        val messagesGrouped =
            messages.groupBy {
                when (it) {
                    is ChildMessage -> it.parentMessageId
                    is Message1 -> it.id
                    else -> null
                }
            }
        for (parentMessagesGroup in messagesGrouped) {
            for (message in parentMessagesGroup.value)
                println(message)
        }
    }
}

open class Message1(val text: String, val author: String, val id: Int) {
    override fun toString(): String {
        return "$author: $text"
    }
}

class ChildMessage(text: String, author: String, id: Int, val parentMessageId: Int) : Message1(text, author, id) {
    override fun toString(): String {
        return "    $author: $text"
    }
}

fun main() {

    val myUsername = "luda"
    val coolestProgerUsername = "the-coolest-proger"
    val coolProgerUsername = "cool-proger"
    val otherProgerUsername = "programmator_3000"

    val chat = Chat()
    chat.addMessage("всем привет!", myUsername)
    val thread1ParentId = chat.addMessage("напомните кто-нибудь пожалуйста три принципа ооп", myUsername)
    chat.addThreadMessage(
        "привет, принципы ооп: инкапсуляция, наследование, полиморфизм.",
        coolProgerUsername,
        thread1ParentId
    )
    chat.addThreadMessage("Но еще иногда выделяют четвертый принцип ооп", coolestProgerUsername, thread1ParentId)
    chat.addThreadMessage("Это какой еще такой?", myUsername, thread1ParentId)
    chat.addThreadMessage("абстракция!", coolestProgerUsername, thread1ParentId)
    chat.addThreadMessage("спасибо, запомню", "люда", thread1ParentId)
    val thread2ParentId = chat.addMessage("всем спасибо, теперь я готова к собесу!", myUsername)
    chat.addThreadMessage("рад был помочь :)", coolestProgerUsername, thread1ParentId)
    chat.addThreadMessage("пожалуйста, обращайся!", coolProgerUsername, thread2ParentId)
    chat.addThreadMessage("Ндаа, щас бы не знать принципы ооп...", otherProgerUsername, thread1ParentId)

    chat.printChat()
}