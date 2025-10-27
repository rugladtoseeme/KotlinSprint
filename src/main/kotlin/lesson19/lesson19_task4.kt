package org.example.lesson19

class Tank {
    var tankShell: TankShell? = null

    fun loadTankGun(shell: TankShell) {
        tankShell = shell
    }

    fun shoot() {
        if (tankShell == null) println("Танк не произвел выстрел: нет снарядов.")
        else println("Танк нанес ${tankShell?.value ?: 0} урона")
    }
}

enum class TankShell(val value: Int) {
    BLUE_SHELL(5),
    GREEN_SHELL(10),
    RED_SHELL(20)
}

fun main() {

    val tank = Tank()
    tank.shoot()
    tank.loadTankGun(TankShell.GREEN_SHELL)
    tank.shoot()
    tank.loadTankGun(TankShell.BLUE_SHELL)
    tank.shoot()
    tank.loadTankGun(TankShell.RED_SHELL)
    tank.shoot()
}