package com.example.myapplication1.data

import android.provider.ContactsContract
import com.example.myapplication1.domain.Note
import com.example.myapplication1.domain.NoteRepository

class NoteRepositoryImpl (
    private val noteDao: NoteDao, override val it: Any
): NoteRepository {




    override fun createNote(note: ContactsContract.CommonDataKinds.Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun getAllNotes() {
        return noteDao.getAllNote().map { it.toNote() }
    }

    override fun editNote(note: ContactsContract.CommonDataKinds.Note) {
        noteDao.editNote(note.toEntity())

    }

    override fun deleteNote(note: ContactsContract.CommonDataKinds.Note) {
        noteDao.deleteNote(note.toEntity())

    }

}
private fun <E> List<E>.map(any: Any) = Unit
private fun ContactsContract.CommonDataKinds.Note.toEntity() = Unit
