package com.mikelau.notes.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(val title: String,
                val description: String,
                val image: String,
                val priority: Int) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
