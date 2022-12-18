package flab.toy.numberbaseball.controller

import flab.toy.numberbaseball.common.ResponseVo
import flab.toy.numberbaseball.service.GameService
import flab.toy.numberbaseball.vo.*
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/game")
class GameController(
    private val gameService: GameService
) {
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

    @GetMapping("/{gameId}", name = "게임 결과")
    fun getGameResult(@PathVariable gameId: Long): ResponseVo<GameResultResponseVo> {
        return ResponseVo(gameService.getGameResult(gameId))
    }

    @GetMapping("/{gameId}/history", name = "게임 진행 기록")
    fun getGuessHistory(@PathVariable gameId: Long): ResponseVo<GameGuessHistoryVo> {
        return ResponseVo(gameService.getGuessHistory(gameId))
    }
}
