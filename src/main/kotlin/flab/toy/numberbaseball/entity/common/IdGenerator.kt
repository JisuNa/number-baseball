package flab.toy.numberbaseball.entity.common

import org.springframework.stereotype.Component

@Component
class IdGenerator {
    private final val ids = mutableListOf<Int>()

    init {
        ids.addAll(IntRange(0, 999))
    }

    fun getId(): Int {
        val id = ids.first()
        ids.remove(0)
        return id
    }
}