package flab.toy.numberbaseball.data

import flab.toy.numberbaseball.common.Codes
import flab.toy.numberbaseball.common.Codes.GameStatus.PLAYING
import flab.toy.numberbaseball.vo.GameStartResponseVo

class Game(
    val id: Long,
    val result: LinkedHashSet<Int>,
    val failCount: Int = 0,
    val status: Codes.GameStatus = PLAYING
) {
    fun toVo(): GameStartResponseVo {
        return GameStartResponseVo(id)
    }
}
