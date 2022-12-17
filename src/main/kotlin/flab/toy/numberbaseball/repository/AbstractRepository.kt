package flab.toy.numberbaseball.repository

import flab.toy.numberbaseball.entity.BaseEntity

abstract class AbstractRepository<T : BaseEntity> {
    protected abstract val data: MutableSet<T>

    fun save(entity: T): Long {
        data.add(entity)
        return entity.id
    }

    fun list(): Set<T> {
        return data
    }

    fun findById(id: Long): T? {
        return data.find { it.id == id }
    }

    fun update(entity: T) {
        save(entity)
    }
}