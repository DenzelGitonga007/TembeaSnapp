package com.denzel.tembeasnapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

//Define the travel entry to the db
@Entity("table_entries")
data class TravelEntry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val imagePath: String,
    val date: String
)