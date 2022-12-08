package flab.toy.numberbaseball.service

import flab.toy.numberbaseball.vo.GameStartResponseVo

interface GameService {
    fun startGame(): GameStartResponseVo
}
