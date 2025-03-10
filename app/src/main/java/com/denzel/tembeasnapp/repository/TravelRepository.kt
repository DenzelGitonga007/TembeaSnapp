package com.denzel.tembeasnapp.repository

import com.denzel.tembeasnapp.data.database.TravelDao
import com.denzel.tembeasnapp.data.model.TravelEntry
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TravelRepository @Inject constructor(private val travelDao: TravelDao) {

    // Fetch all entries
    val allTravelEntries: Flow<List<TravelEntry>> = travelDao.getAllTravelEntries()

    // Insert travel entry
    suspend fun insert(travelEntry: TravelEntry) {
        travelDao.insertTravelEntry(travelEntry)
    }

    // Delete travel entry
    suspend fun delete(travelEntry: TravelEntry) {
        travelDao.deleteTravelEntry(travelEntry)
    }
}
