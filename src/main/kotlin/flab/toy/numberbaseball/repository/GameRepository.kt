package flab.toy.numberbaseball.repository

import flab.toy.numberbaseball.data.Game
import org.springframework.stereotype.Repository
import kotlin.random.Random

@Repository
class GameRepository {
    fun newGame(): Game {
        return Game(
            id = Random.nextLong(0, 999),
            result = linkedSetOf<Int>().also {
                while (it.size <= 2) {
                    it.add(Random.nextInt(0,9))
                }
            }
        )
    }
}
