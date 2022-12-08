package flab.toy.numberbaseball.service.impl

import flab.toy.numberbaseball.repository.GameRepository
import flab.toy.numberbaseball.service.GameService
import flab.toy.numberbaseball.vo.GameStartResponseVo
import org.springframework.stereotype.Service

@Service
class GameServiceImpl(
    private val gameRepository: GameRepository
) : GameService {
    override fun startGame(): GameStartResponseVo {
        return gameRepository.newGame().toVo()
    }
}
