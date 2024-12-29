package com.example.week12.dependenciesinjection

import com.example.week12.model.Mahasiswa
import com.example.week12.repository.MahasiswaRepository
import com.example.week12.repository.NetworkMahasiswaRepository
import com.example.week12.service.MahasiswaService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer{
    val mahasiswaRepository: MahasiswaRepository
}
