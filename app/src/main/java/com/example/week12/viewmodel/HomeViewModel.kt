package com.example.week12.viewmodel

import com.example.week12.model.Mahasiswa

sealed class HomeUiState{
    data class Success(val mahasiswa: List<Mahasiswa>):HomeUiState()
    object Error:HomeUiState()
    object Loading:HomeUiState()
}