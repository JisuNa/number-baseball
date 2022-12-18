package flab.toy.numberbaseball.common

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
class ResponseVo<T>(
    val data: T,
    val success: Boolean = true,
    val error: ErrorVo? = null
)

class ErrorVo(
    val code: String,
    val message: String
)
