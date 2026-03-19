package br.unifor.droiddex.domain.usecase

import br.unifor.droiddex.domain.model.Pokemon
import br.unifor.droiddex.domain.repository.PokemonRepository
import javax.inject.Inject

class GetPokemonListUseCase @Inject constructor(
    private val repository: PokemonRepository
) {
    suspend operator fun invoke(limit:Int, offset:Int): Result<List<Pokemon>> {
        return repository.getPokemonList(limit, offset)
    }
}