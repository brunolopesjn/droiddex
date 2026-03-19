package br.unifor.droiddex.data.remote

import br.unifor.droiddex.data.remote.dto.PokemonDto
import br.unifor.droiddex.data.remote.dto.PokemonResponseListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit")
        limit: Int,
        @Query("offset")
        offset: Int
    ): PokemonResponseListDto

    @GET("pokemon/{id}")
    suspend fun getPokemonDetail(
        @Path("id") id: String
    ): PokemonDto

}