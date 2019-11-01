package com.spdigital.spgtest.api
import com.spdigital.spgtest.BuildConfig
import com.spdigital.spgtest.network.BaseResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("environment/psi")
    fun getPsiInfo(@Query("date_time")  dateTime:String,@Query("date")  date:String): Call<BaseResponse>



    companion object {
        fun create(): WebService {
            val logger = HttpLoggingInterceptor()
            logger.level = HttpLoggingInterceptor.Level.BASIC
            logger.level = HttpLoggingInterceptor.Level.BODY

            val client = OkHttpClient.Builder()

            client.addInterceptor {
                val original = it.request()
                return@addInterceptor it.proceed(original)

            }

            client.addInterceptor(logger)

            return Retrofit.Builder()
                    .baseUrl(BuildConfig.Base_Url)
                    .client(client.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(WebService::class.java)
        }


    }
}