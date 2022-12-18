package flab.toy.numberbaseball.repository

import flab.toy.numberbaseball.entity.History
import org.springframework.stereotype.Repository

@Repository
class HistoryRepository(
    override val data: MutableSet<History>
) : AbstractRepository<History>()