package com.example.myapplication1.domain

import android.provider.ContactsContract


interface NoteRepository {


    abstract val it: Any

    fun createNote(note: ContactsContract.CommonDataKinds.Note)
    fun getAllNotes()
    fun editNote (note: ContactsContract.CommonDataKinds.Note)
    fun deleteNote(note: ContactsContract.CommonDataKinds.Note)

}