package br.unifor.droiddex.data.remote.dto

import br.unifor.droiddex.domain.model.Pokemon

fun PokemonDto.toDomain(): Pokemon{
    return Pokemon(
        id = this.id,
        name = this.name,
        imageUrl = this.sprites.other.officialArtwork.frontDefault,
        types = this.types.map { it.type.name }
    )
}