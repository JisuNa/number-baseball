package flab.toy.numberbaseball.vo

import javax.validation.constraints.NotEmpty

class GameGuessRequestVo(
    @field:NotEmpty
    val answer: String
)
