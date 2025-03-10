package com.denzel.tembeasnapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.denzel.tembeasnapp.data.model.TravelEntry //  correct entity import
import com.denzel.tembeasnapp.data.database.TravelDao //  correct DAO import

// Initialize Room DB and connect to the DAO
@Database(entities = [TravelEntry::class], version = 1, exportSchema = false) // Corrected entity
abstract class TravelDatabase : RoomDatabase() {
    // Connect the database with the DAO
    abstract fun travelDao(): TravelDao
}
