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

fun PokemonDto.toDomain(): Pokemon{
    return Pokemon(
        id = this.id,
        name = this.name,
        imageUrl = this.sprites.other.officialArtwork.frontDefault,
        types = this.types.map { it.type.name }
    )
}