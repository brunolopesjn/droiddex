package br.unifor.droiddex.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OtherSpritesDto(
    @SerialName("official-artwork")
    val officialArtwork: OfficialArtworkDto
)
