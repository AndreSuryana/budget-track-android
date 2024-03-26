package com.andresuryana.budgettrack.di

import android.content.Context
import com.andresuryana.budgettrack.ui.onboarding.manager.OnboardingManager
import com.andresuryana.budgettrack.ui.onboarding.manager.OnboardingManagerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideOnboardingManager(@ApplicationContext context: Context): OnboardingManager =
        OnboardingManagerImpl(context)
}