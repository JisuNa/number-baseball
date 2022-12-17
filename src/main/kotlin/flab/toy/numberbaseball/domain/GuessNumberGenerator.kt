package flab.toy.numberbaseball.domain

import flab.toy.numberbaseball.entity.Game

class GuessNumberGenerator {
    fun getNumbers(): BaseballNumbers {
        val answer = linkedSetOf<Int>()

        while (answer.size <= 2) {
            answer.add(IntRange(0, 9).random())
        }

        return answer.toList().let {
            BaseballNumbers(it[0], it[1], it[2])
        }
    }
}

data class BaseballNumbers(
    private val first: Int,
    private val second: Int,
    private val third: Int
) {
    fun toGame(): Game {
        return Game(listOf(first, second, third))
    }
}
