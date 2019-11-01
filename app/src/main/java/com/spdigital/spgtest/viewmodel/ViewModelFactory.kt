
package com.spdigital.spgtest.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.spdigital.spgtest.base.Repository

/**
 * Factory for ViewModels
 */
class ViewModelFactory(private val repository: Repository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(PsiViewModel::class.java) -> @Suppress("UNCHECKED_CAST")
            return PsiViewModel(repository) as T

        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}