package br.unifor.droiddex.domain.repository

import br.unifor.droiddex.domain.model.Pokemon

interface PokemonRepository {

    suspend fun getPokemonList(limit: Int, offset: Int): Result<List<Pokemon>>

}