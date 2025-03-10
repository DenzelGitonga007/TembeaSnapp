package com.denzel.tembeasnapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


// This class is the Application class for our app.
// Hilt requires this class to be annotated with @HiltAndroidApp to enable Dependency Injection.

@HiltAndroidApp
class TembeaSnappApp: Application()