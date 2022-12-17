package flab.toy.numberbaseball.domain

import flab.toy.numberbaseball.entity.Game
import flab.toy.numberbaseball.vo.GameGuessRequestVo
import flab.toy.numberbaseball.vo.GameGuessResponseVo

class Referee(game: Game, guess: GameGuessRequestVo) {
    var strike: Int = 0
    var ball: Int = 0
    var out: Int = 0

    init {
        for (i in IntRange(0, 2)) {
            if (game.answer[i] == guess.list[i]) {
                strike++
                continue
            }

            if (game.answer.contains(guess.list[i])) {
                ball++
            } else {
                out++
            }
        }
    }

    fun getResult() = GameGuessResponseVo(
        correct = false,
        remainingCount = 1,
        strike = strike,
        ball = ball,
        out = out
    )
}