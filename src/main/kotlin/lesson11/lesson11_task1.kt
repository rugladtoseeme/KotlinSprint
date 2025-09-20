package org.example.lesson11

class User(
    val id: Int,
    val username: String,
    val password: String,
    val email: String,
)

fun main() {

    val user1 = User(1, "user1", "111", "user1@test.ru")
    val user2 = User(2, "user2", "222", "user2@test.ru")

    println(
        """Данные user1: id = ${user1.id}, 
            username = ${user1.username}, 
            password = ${user1.password}, 
            email = ${user1.email}.""".replace((Regex("\\s+")), " ")
    )
    println(
        """Данные user2: id = ${user2.id}, 
            username = ${user2.username}, 
            password = ${user2.password}, 
            email = ${user2.email}.""".replace((Regex("\\s+")), " ")
    )
}