package com.spdigital.spgtest.base

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.spdigital.spgtest.api.WebService
import com.spdigital.spgtest.viewmodel.ViewModelFactory

object Injection {
    /**
     * Creates an instance of [Repository] based on the [WebService]
     */
    private fun provideRepository(context: Context): Repository {
        return Repository(WebService.create())
    }

    /**
     * Provides the [ViewModelProvider.Factory] that is then used to get a reference to
     * [ViewModel] objects.
     */
    fun provideViewModelFactory(context: Context): ViewModelProvider.Factory {
        return ViewModelFactory(provideRepository(context))
    }


}