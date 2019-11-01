package com.spdigital.spgtest.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.movie.base.BaseCallback
import com.spdigital.spgtest.api.WebService
import com.spdigital.spgtest.network.BaseResponse

/**
 * class that implement Webservice Api
 */
class Repository(private val service: WebService) {

    private var mError: MutableLiveData<String> = MutableLiveData()
    val statusCode: MutableLiveData<Int> = MutableLiveData()
    val psidata: MutableLiveData<Int> = MutableLiveData()
    fun getError(): LiveData<String> {
        mError = MutableLiveData()
        return mError
    }

    private var mDataError: MutableLiveData<BaseResponse> = MutableLiveData()

    fun getDataError():LiveData<BaseResponse>{
        mDataError = MutableLiveData()
        return mDataError
    }


    fun getPsiList(dateTime: String,date:String): LiveData<BaseResponse> {
        val data = MutableLiveData<BaseResponse>()

        service.getPsiInfo(dateTime,date).enqueue(object : BaseCallback<BaseResponse>() {
            override fun onSuccess(response: BaseResponse?) {
                data.value = response
            }

            override fun onFail(baseResponse: BaseResponse?) {
                mDataError.value= baseResponse
            }


        })
        return data

    }





}