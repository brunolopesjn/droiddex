package br.unifor.droiddex.data.remote.dto

import br.unifor.droiddex.domain.model.Pokemon
import kotlinx.serialization.Serializable

@Serializable
data class PokemonDto(
    val id:Int,
    val name: String,
    val sprites: SpritesDto,
    val types: List<TypeSlotDto>
)