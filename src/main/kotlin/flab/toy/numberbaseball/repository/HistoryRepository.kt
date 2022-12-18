package flab.toy.numberbaseball.repository

import flab.toy.numberbaseball.entity.History
import org.springframework.stereotype.Repository

@Repository
class HistoryRepository(
    override val data: MutableSet<History>
) : AbstractRepository<History>() {
    fun findByGameId(gameId: Long): List<History> {
        return data.filter { it.gameId == gameId }
    }
}