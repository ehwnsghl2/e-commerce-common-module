package com.brandjunhoe.common.page

data class TotalPageDTO(
    private val number: Int = 0,
    val totalPages: Int = 0,
    val totalElements: Long = 0
) {

    fun getNumber(): Int =
        number + 1

}