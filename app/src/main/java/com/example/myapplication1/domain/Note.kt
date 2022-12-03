package com.example.myapplication1.domain

data class Note(
    val id: Int,
    val title: String,
    val description: String,
    val createAt: Long
)