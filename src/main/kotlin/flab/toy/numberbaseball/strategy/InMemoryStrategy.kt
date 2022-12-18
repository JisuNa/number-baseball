package flab.toy.numberbaseball.strategy

import flab.toy.numberbaseball.entity.BaseEntity
import org.springframework.stereotype.Component

@Component
class InMemoryStrategy<T: BaseEntity>: RepositoryStrategy<T> {
    override fun add(entity: T): Long {
        TODO("Not yet implemented")
    }

    override fun list(): List<T> {
        TODO("Not yet implemented")
    }

    override fun get(id: Long): T {
        TODO("Not yet implemented")
    }

    override fun remove(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun update(entity: T): T {
        TODO("Not yet implemented")
    }
}