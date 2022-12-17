package flab.toy.numberbaseball.entity

import flab.toy.numberbaseball.common.Codes
import flab.toy.numberbaseball.common.Codes.GameStatus.CLOSED
import flab.toy.numberbaseball.common.Codes.GameStatus.PLAYING

class Game(
    val answer: List<Int>
) : BaseEntity() {
    private var failCount: Int = 0
    private var status: Codes.GameStatus = PLAYING

    fun increaseFailCount() = failCount.inc()

    fun closeGame() {
        status = CLOSED
    }
}
