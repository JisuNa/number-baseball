package flab.toy.numberbaseball.service.impl

import flab.toy.numberbaseball.domain.GuessNumberGenerator
import flab.toy.numberbaseball.domain.Referee
import flab.toy.numberbaseball.repository.GameRepository
import flab.toy.numberbaseball.service.GameService
import flab.toy.numberbaseball.vo.GameGuessRequestVo
import flab.toy.numberbaseball.vo.GameGuessResponseVo
import flab.toy.numberbaseball.vo.GameStartResponseVo
import org.springframework.stereotype.Service

@Service
class GameServiceImpl(
    private val gameRepository: GameRepository,
) : GameService {
    override fun getGame(gameId: Long): List<Int> {
        return gameRepository.findById(gameId)?.answer ?: listOf()
    }

    override fun startGame(): GameStartResponseVo {
        return GameStartResponseVo(
            gameRepository.save(
                GuessNumberGenerator().getNumbers().toGame()
            )
        )
    }

    override fun guessNumber(gameId: Long, gameGuessRequestVo: GameGuessRequestVo): GameGuessResponseVo {
        return gameRepository.findById(gameId)?.let {
            Referee(it, gameGuessRequestVo).getResult()
        } ?: throw Exception()
    }
}
