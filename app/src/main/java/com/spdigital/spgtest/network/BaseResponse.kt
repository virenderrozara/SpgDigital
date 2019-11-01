package com.spdigital.spgtest.network

import com.spdigital.spgtest.network.response.ApiInfoX
import com.spdigital.spgtest.network.response.Item
import com.spdigital.spgtest.network.response.RegionMetadataX

class BaseResponse {
    lateinit var region_metadata: ArrayList<RegionMetadataX>
    lateinit var items: ArrayList<Item>
    lateinit var api_info: ApiInfoX

}
