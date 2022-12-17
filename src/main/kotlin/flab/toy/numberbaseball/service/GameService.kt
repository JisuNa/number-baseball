package flab.toy.numberbaseball.service

import flab.toy.numberbaseball.vo.GameGuessRequestVo
import flab.toy.numberbaseball.vo.GameGuessResponseVo
import flab.toy.numberbaseball.vo.GameStartResponseVo

interface GameService {
    fun getGame(gameId: Long): List<Int>
    fun startGame(): GameStartResponseVo
    fun guessNumber(gameId: Long, gameGuessRequestVo: GameGuessRequestVo): GameGuessResponseVo
}
