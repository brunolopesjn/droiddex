package br.unifor.droiddex.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class TypeDto(
    val name: String,
    val url: String
)
