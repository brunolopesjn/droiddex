package br.unifor.droiddex.ui.features.pokemonlist

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.unifor.droiddex.domain.usecase.GetPokemonListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(
    private val getPokemonListUseCase: GetPokemonListUseCase
): ViewModel() {

    private val _uiState = MutableStateFlow<PokemonListUiState>(PokemonListUiState.Loading)
    val uiState: StateFlow<PokemonListUiState> = _uiState.asStateFlow()

    init {
        fetchPokemons()
    }

    fun fetchPokemons() {
        viewModelScope.launch {
            _uiState.value = PokemonListUiState.Loading

            val result = getPokemonListUseCase(151, 0)
            result.onSuccess { list ->
                _uiState.value = PokemonListUiState.Success(list)
            }.onFailure { error ->
                _uiState.value = PokemonListUiState.Error(error.message ?: "Unknow error")
            }
        }
    }

}