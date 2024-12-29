package com.example.week12.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.network.HttpException
import com.example.week12.model.Mahasiswa
import com.example.week12.repository.MahasiswaRepository
import kotlinx.coroutines.launch
import okio.IOException

sealed class HomeUiState{
    data class Success(val mahasiswa: List<Mahasiswa>):HomeUiState()
    object Error:HomeUiState()
    object Loading:HomeUiState()
}

class HomeViewModel (private val mhs: MahasiswaRepository):ViewModel() {
    var mhsUIState: HomeUiState by mutableStateOf(HomeUiState.Loading)
    private set

    init {
        getMhs()
    }

    fun getMhs(){
        viewModelScope.launch {
            mhsUIState=HomeUiState.Loading
            mhsUIState=try {
                HomeUiState.Success(mhs.getMahasiswa())
            }catch (e:IOException){
                HomeUiState.Error
            }catch (e:HttpException){
                HomeUiState.Error
            }
        }
    }
}