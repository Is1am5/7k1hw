package com.example.myapplication1.data

import androidx.room.*

interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createNote(noteEntity: NoteEntity)

    @Query("SELECT * FROM notes")
    fun getAllNote():List<NoteEntity>

    @Update
    fun editNote(noteEntity: Unit)

    @Delete
    fun deleteNote(noteEntity: Unit)
    abstract fun createNote(noteEntity: Unit)

}