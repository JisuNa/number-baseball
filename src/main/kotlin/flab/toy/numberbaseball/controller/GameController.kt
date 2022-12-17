package flab.toy.numberbaseball.controller

import flab.toy.numberbaseball.common.ResponseVo
import flab.toy.numberbaseball.service.GameService
import flab.toy.numberbaseball.vo.GameGuessRequestVo
import flab.toy.numberbaseball.vo.GameGuessResponseVo
import flab.toy.numberbaseball.vo.GameStartResponseVo
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/game")
class GameController(
    private val gameService: GameService
) {
    @GetMapping("/{gameId}", name = "게임 번호 확인")
    fun getGame(@PathVariable gameId: Long): ResponseVo<List<Int>> {
        return ResponseVo(gameService.getGame(gameId))
    }

    @PostMapping("/start", name = "게임 시작")
    fun startGame(): ResponseVo<GameStartResponseVo> {
        return ResponseVo(gameService.startGame())
    }

    @PostMapping("/{gameId}/guess", name = "게임 진행")
    fun guessNumber(
        @PathVariable gameId: Long,
        @RequestBody @Valid gameGuessRequestVo: GameGuessRequestVo
    ): ResponseVo<GameGuessResponseVo> {
        return ResponseVo(gameService.guessNumber(gameId, gameGuessRequestVo))
    }
}
