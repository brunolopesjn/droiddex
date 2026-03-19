package br.unifor.droiddex.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TypeSlotDto(
    val slot: Int,
    val type:TypeDto
)