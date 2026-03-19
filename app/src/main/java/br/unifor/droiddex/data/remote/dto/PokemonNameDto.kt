package br.unifor.droiddex.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class PokemonNameDto(
    val name: String,
    val url: String
)
