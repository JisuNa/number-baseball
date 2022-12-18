package flab.toy.numberbaseball.service

import flab.toy.numberbaseball.vo.GameGuessRequestVo
import flab.toy.numberbaseball.vo.GameGuessResponseVo
import flab.toy.numberbaseball.vo.GameResultResponseVo
import flab.toy.numberbaseball.vo.GameStartResponseVo

interface GameService {
    fun startGame(): GameStartResponseVo
    fun guessNumber(gameId: Long, gameGuessRequestVo: GameGuessRequestVo): GameGuessResponseVo
    fun getGameResult(gameId: Long): GameResultResponseVo
}
