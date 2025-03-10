package com.denzel.tembeasnapp.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.denzel.tembeasnapp.data.model.TravelEntry
import kotlinx.coroutines.flow.Flow

@Dao
interface TravelDao{

//    Creating the travel entry
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTravelEntry(travelEntry: TravelEntry)

//    Fetching the travel entries (Using Flow for live updates)
    @Query("SELECT * FROM table_entries ORDER BY date DESC")
    fun getAllTravelEntries(): Flow<List<TravelEntry>>

//    Delete travel entry
    @Delete
    suspend fun deleteTravelEntry(travelEntry: TravelEntry)

}