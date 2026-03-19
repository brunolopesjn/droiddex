package br.unifor.droiddex.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OfficialArtworkDto(
    @SerialName("front_default")
    val frontDefault: String
)
