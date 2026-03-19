package br.unifor.droiddex.ui.features.pokemonlist

import br.unifor.droiddex.domain.model.Pokemon

sealed interface PokemonListUiState {
    object Loading : PokemonListUiState
    data class Success(val pokemons: List<Pokemon>) : PokemonListUiState
    data class Error(val message: String) : PokemonListUiState
}