package flab.toy.numberbaseball.entity

abstract class BaseEntity {
    var id: Long = 0

    init {
        id++
    }
}