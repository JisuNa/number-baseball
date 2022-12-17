package flab.toy.numberbaseball.strategy

import flab.toy.numberbaseball.entity.BaseEntity

interface RepositoryStrategy<T: BaseEntity> {
    fun add(entity: T): Long
    fun list(): List<T>
    fun get(id: Long): T
    fun update(entity: T): T
    fun remove(id: String): Boolean
}