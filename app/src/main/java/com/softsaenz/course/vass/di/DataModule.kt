package com.softsaenz.course.vass.di

import android.content.Context
import com.softsaenz.course.vass.utils.storage.LocalStorage
import com.softsaenz.course.vass.utils.storage.Storage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun provideStorage(@ApplicationContext context: Context): Storage {
        return LocalStorage(context)
    }
}