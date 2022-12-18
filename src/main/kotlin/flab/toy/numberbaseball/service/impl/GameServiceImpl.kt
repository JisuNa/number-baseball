package flab.toy.numberbaseball.service.impl

import flab.toy.numberbaseball.domain.GuessNumberGenerator
import flab.toy.numberbaseball.domain.Referee
import flab.toy.numberbaseball.entity.History
import flab.toy.numberbaseball.repository.GameRepository
import flab.toy.numberbaseball.repository.HistoryRepository
import flab.toy.numberbaseball.service.GameService
import flab.toy.numberbaseball.vo.*
import org.springframework.stereotype.Service

@Service
class GameServiceImpl(
    private val gameRepository: GameRepository,
    private val historyRepository: HistoryRepository
) : GameService {

    override fun startGame(): GameStartResponseVo {
        return GameStartResponseVo(
            gameRepository.save(
                GuessNumberGenerator().getNumbers().toGame()
            )
        )
    }

    override fun guessNumber(gameId: Long, gameGuessRequestVo: GameGuessRequestVo): GameGuessResponseVo {
        return gameRepository.findById(gameId)?.let { game ->

            game.assertPlayGame()
            game.decreaseRemainingCount()

            Referee(game, gameGuessRequestVo).decision().also {
                if (it.strike == 3) {
                    game.closeGame()
                }

                recordHistory(gameGuessRequestVo.guessNumbers, it.strike, it.ball, it.out)
            }
        } ?: throw Exception()
    }

    private fun recordHistory(answer: String, strike: Int, ball: Int, out: Int) {
        historyRepository.save(
            History(
                answer = answer,
                result = BaseballCountVo(
                    strike = strike,
                    ball = ball,
                    out = out
                )
            )
        )
    }

    override fun getGameResult(gameId: Long): GameResultResponseVo {
        return gameRepository.findById(gameId)?.let {
            GameResultResponseVo(it.remainingCount, 10 - it.remainingCount)
        } ?: GameResultResponseVo()
    }
}
