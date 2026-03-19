package br.unifor.droiddex.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class PokemonResponseListDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonNameDto>
)
