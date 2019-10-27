package com.andorid.movie.network

import com.spdigital.spgtest.network.response.ApiInfoX

class BaseResponse<T> {
    lateinit var region_metadata: ArrayList<T>
    lateinit var items: ArrayList<T>
    lateinit var api_info: ApiInfoX

}
