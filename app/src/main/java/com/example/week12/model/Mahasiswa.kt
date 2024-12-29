package com.example.week12.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json      = Json { allowStructuredMapKeys = true }
// val mahasiswa = json.parse(Mahasiswa.serializer(), jsonString)

@Serializable
data class Mahasiswa (
    val nim: String,
    val nama: String,
    val alamat: String,

    @SerialName("jenis_kelamin")
    val jenisKelamin: String,

    val kelas: String,
    val angkatan: String
)

