package com.example.myapplication1.domain.usecase

import android.provider.ContactsContract
import com.example.myapplication1.domain.NoteRepository


class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {

    fun deleteNote(note: ContactsContract.CommonDataKinds.Note) = noteRepository.deleteNote(note)

}