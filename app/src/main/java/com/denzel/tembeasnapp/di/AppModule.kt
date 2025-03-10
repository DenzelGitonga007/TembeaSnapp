package com.denzel.tembeasnapp.di

import android.content.Context
import androidx.room.Room
import com.denzel.tembeasnapp.data.database.TravelDatabase
import com.denzel.tembeasnapp.data.database.TravelDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

// This is our Hilt module, which tells Hilt how to provide dependencies.
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // Provides the Room database instance
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): TravelDatabase {
        return Room.databaseBuilder(
            context,
            TravelDatabase::class.java,
            "travel_database"
        ).build()
    }

    // Provides the DAO instance
    @Provides
    fun provideTravelDao(database: TravelDatabase): TravelDao {
        return database.travelDao()
    }
}
