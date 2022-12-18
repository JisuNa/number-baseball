package flab.toy.numberbaseball.entity

import flab.toy.numberbaseball.common.Codes
import flab.toy.numberbaseball.common.Codes.GameStatus.CLOSED
import flab.toy.numberbaseball.common.Codes.GameStatus.PLAYING

class Game(
    val answer: List<Int>
) : BaseEntity() {
    var remainingCount: Int = MAX_REMAIN_COUNT
    private var status: Codes.GameStatus = PLAYING

    fun decreaseRemainingCount() {
        remainingCount--

        if (remainingCount == 0) {
            closeGame()
        }
    }

    fun closeGame() {
        status = CLOSED
    }

    fun assertPlayGame() {
        if (remainingCount == 0) {
            throw Exception()
        }

        if (status.isClosed()) {
            throw Exception()
        }
    }

    companion object {
        private const val MAX_REMAIN_COUNT = 10
    }
}
