package org.example.lesson14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean,
) {
    fun printName() {
        println(name)
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val moons: MutableList<Moon> = mutableListOf<Moon>(),
) : CelestialBody(name, hasAtmosphere, isLandable) {
    fun addMoon(moon: Moon) {
        moons.add(moon)
    }
}

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
) : CelestialBody(name, hasAtmosphere, isLandable)

fun main() {
    val mars = Planet(name = "Mars", hasAtmosphere = true, isLandable = true)
    mars.addMoon(Moon(name = "Phobos", hasAtmosphere = false, isLandable = true))
    mars.addMoon(Moon(name = "Deimos", hasAtmosphere = false, isLandable = false))

    mars.printName()
    for (moon in mars.moons) {
        moon.printName()
    }
}