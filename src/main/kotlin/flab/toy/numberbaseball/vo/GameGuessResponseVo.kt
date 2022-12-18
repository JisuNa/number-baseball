package flab.toy.numberbaseball.vo

class GameGuessResponseVo(
    val correct: Boolean,
    val remainingCount: Int,
    val strike: Int,
    val ball: Int,
    val out: Int
)
