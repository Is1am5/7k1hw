package com.example.myapplication1.domain.usecase

import com.example.myapplication1.domain.NoteRepository

class GetAllNotesUseCase(
    private val noteRepository: NoteRepository
) {

    fun getAllNotesNote() = noteRepository.getAllNotes()

}