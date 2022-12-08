package flab.toy.numberbaseball.controller

import flab.toy.numberbaseball.common.ResponseVo
import flab.toy.numberbaseball.service.GameService
import flab.toy.numberbaseball.vo.GameStartResponseVo
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/game")
class GameController(
    private val gameService: GameService
) {
    @PostMapping("/start", name = "게임 시작")
    fun startGame(): ResponseVo<GameStartResponseVo> {
        return ResponseVo(gameService.startGame())
    }
}
