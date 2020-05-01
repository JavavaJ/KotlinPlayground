package free_code_camp

import java.util.*

enum class EntityType {
    EASY, MEDIUM, HARD
}

object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> "Easy"
            EntityType.MEDIUM -> "Medium"
            EntityType.HARD -> "Hard"
        }
        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
        }
    }
}

sealed class Entity() {
    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()
}

fun main() {
    val easyEntity = EntityFactory.create(EntityType.EASY)
    println(easyEntity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)

    val hardEntity = EntityFactory.create(EntityType.HARD)
    println(hardEntity)
}