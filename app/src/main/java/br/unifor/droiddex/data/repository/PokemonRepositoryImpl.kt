package br.unifor.droiddex.data.repository

import br.unifor.droiddex.data.remote.PokeApi
import br.unifor.droiddex.data.remote.dto.toDomain
import br.unifor.droiddex.domain.model.Pokemon
import br.unifor.droiddex.domain.repository.PokemonRepository
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val api: PokeApi
): PokemonRepository {
    override suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): Result<List<Pokemon>> {
        return try {
            val response = api.getPokemonList(limit, offset)
            val pokemonDetails = response.results.map { nameDto ->
                val id = nameDto.url.split("/").last { it.isNotEmpty() }
                api.getPokemonDetail(id).toDomain()
            }
            Result.success(pokemonDetails)
        } catch (e: Exception){
            Result.failure(e)
        }
    }
}