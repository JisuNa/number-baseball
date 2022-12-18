package flab.toy.numberbaseball.vo

import javax.validation.constraints.NotEmpty

class GameGuessRequestVo(
    @field:NotEmpty
    val guessNumbers: String
) {
    private val first = guessNumbers.substring(0,1).toInt()
    private val second = guessNumbers.substring(1,2).toInt()
    private val third = guessNumbers.substring(2,3).toInt()

    val list = listOf(first, second, third)
}
