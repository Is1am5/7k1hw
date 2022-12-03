package com.example.myapplication1.domain.usecase

import android.provider.ContactsContract
import com.example.myapplication1.domain.NoteRepository

class EditNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun editNote(note: ContactsContract.CommonDataKinds.Note) = noteRepository.editNote(note)

}