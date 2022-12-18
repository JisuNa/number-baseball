package flab.toy.numberbaseball.entity

import flab.toy.numberbaseball.vo.BaseballCountVo

class History(
    val gameId: Long,
    val answer: String,
    val result: BaseballCountVo
): BaseEntity()
