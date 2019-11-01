package com.spdigital.spgtest.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.spdigital.spgtest.base.BaseActivity
import com.spdigital.spgtest.base.Injection
import com.spdigital.spgtest.base.Repository
import com.spdigital.spgtest.network.BaseResponse


class PsiViewModel(private val repo: Repository) : ViewModel() {
    /**
     * set all error
     */
    fun getError(): LiveData<String> {

        return repo.getError()
    }
    fun getDataError(): LiveData<BaseResponse> {

        return repo.getDataError()
    }
    fun getPsiInfo(dateTime : String,date:String): LiveData<BaseResponse> {

        return repo.getPsiList(dateTime,date)

    }


    companion object {
        fun getInstance(activity: BaseActivity): PsiViewModel {

            return ViewModelProviders.of(activity).get(PsiViewModel::class.java)
        }
        fun create(activity: BaseActivity): PsiViewModel {

            return ViewModelProviders.of(activity, Injection.provideViewModelFactory(activity)).get(PsiViewModel::class.java)
        }
    }

}