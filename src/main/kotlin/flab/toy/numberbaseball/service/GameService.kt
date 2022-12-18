package flab.toy.numberbaseball.service

import flab.toy.numberbaseball.vo.*

interface GameService {
    fun startGame(): GameStartResponseVo
    fun guessNumber(gameId: Long, gameGuessRequestVo: GameGuessRequestVo): GameGuessResponseVo
    fun getGameResult(gameId: Long): GameResultResponseVo
    fun getGuessHistory(gameId: Long): GameGuessHistoryVo
}
