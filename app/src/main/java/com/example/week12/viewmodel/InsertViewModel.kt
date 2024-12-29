package com.example.week12.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.week12.repository.MahasiswaRepository

class InsertViewModel (private val mhs: MahasiswaRepository: ViewModel) {
    var uiState by mutableStateOf(InsertUiState())
        private set

    fun updateInsertMhsState(insertUiEvent InsertUiEvent) {
        uiState =InsertUiState(insertUiEvent = insertUiEvent)
    }
}

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent()
)

data class  InsertUiEvent(
    val nim: String="",
    val nama: String="",
    val alamat: String="",
    val jenisKelamin: String="",
    val kelas: String="",
    val angkatan: String=""
)