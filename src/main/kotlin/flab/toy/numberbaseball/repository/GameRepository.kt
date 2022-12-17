package flab.toy.numberbaseball.repository

import flab.toy.numberbaseball.entity.Game
import org.springframework.stereotype.Repository


@Repository
class GameRepository(
    override val data: MutableSet<Game>
) : AbstractRepository<Game>()
