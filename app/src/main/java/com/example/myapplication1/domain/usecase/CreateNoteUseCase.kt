package com.example.myapplication1.domain.usecase

import android.provider.ContactsContract
import com.example.myapplication1.domain.NoteRepository


class CreateNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun createNote(note: ContactsContract.CommonDataKinds.Note) = noteRepository.createNote(note)


}