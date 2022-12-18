package flab.toy.numberbaseball.common

class Codes {
    enum class GameStatus {
        PLAYING, CLOSED;
        fun isClosed() = this == CLOSED
    }
}
