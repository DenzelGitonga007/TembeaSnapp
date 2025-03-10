package com.denzel.tembeasnapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denzel.tembeasnapp.data.model.TravelEntry
import com.denzel.tembeasnapp.repository.TravelRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

// HiltViewModel for dependency injection
@HiltViewModel
class TravelViewModel @Inject constructor(private val repository: TravelRepository) : ViewModel() {

    // Viewing all travel entries
    val allTravelEntries = repository.allTravelEntries

    // Insert travel entry
    fun insertTravelEntry(travelEntry: TravelEntry) {
        viewModelScope.launch {
            repository.insert(travelEntry)
        }
    }

    fun deleteTravelEntry(travelEntry: TravelEntry) {
        viewModelScope.launch {
            repository.delete(travelEntry)
        }
    }
}
