package com.example.myapplication1.data

import com.example.myapplication1.domain.Note


fun Note.toEntity() = NoteEntity(
    id,
    title,
    description,
    createAt
)

fun NoteEntity.toNote() = Note(
    id,
    title,
    description,
    createAt
)