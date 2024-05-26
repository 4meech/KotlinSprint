package org.example.lesson_19

fun main() {
    val tank = Tank("tank")
    tank.shoot()
    tank.equip(Projectile.BLUE)
    tank.shoot()
    tank.equip(Projectile.RED)
    tank.shoot()
}

class Tank(val name: String) {
    private var equippedProjectile: Projectile? = null

    fun equip(projectile: Projectile) {
        equippedProjectile = projectile
    }

    fun shoot() {
        val projectile = equippedProjectile
        if (projectile != null) {
            println("Выстрел снарядом '${projectile.shellName}', нанесено урона: ${projectile.damage}")
        } else {
            println("Танк не заряжен, сначала нужно выбрать снаряд")
        }
    }
}

enum class Projectile(val shellName: String, val damage: Int) {
    BLUE("Синий", 5),
    GREEN("Зелёный", 10),
    RED("Красный", 20);
}