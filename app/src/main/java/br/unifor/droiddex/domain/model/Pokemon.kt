package br.unifor.droiddex.domain.model

data class Pokemon(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val types: List<String>
) {
    val displayName:String
        get() = name.replaceFirstChar { it.uppercase() }

    val formattedId:String
        get() = "#${id.toString().padStart(3, '0')}"
}
