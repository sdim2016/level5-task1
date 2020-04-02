package com.slepnev.notepadkotlin.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.slepnev.notepadkotlin.database.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()
}