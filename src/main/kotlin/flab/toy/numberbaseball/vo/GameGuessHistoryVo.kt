package flab.toy.numberbaseball.vo

class GameGuessHistoryVo(
    val histories: List<GuessHistoryVo>
)

class GuessHistoryVo(
    val answer: String,
    val result: BaseballCountVo
)