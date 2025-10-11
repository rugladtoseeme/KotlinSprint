package org.example.lesson16

enum class Status {

    PLACED,
    IN_PROCESS,
    READY,
    CANCELED
}

class Order(private val id: Int) {

    private var status = Status.PLACED

    private fun changeStatus(newStatus: Status) {
        status = newStatus
    }

    fun managerChangeStatus(newStatus: Status) = changeStatus(newStatus)
}

fun main() {

    val order = Order(111)
    order.managerChangeStatus(Status.CANCELED)
}