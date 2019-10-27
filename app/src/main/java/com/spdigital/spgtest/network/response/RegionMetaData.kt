package com.spdigital.spgtest.network.response

data class RegionMetaData(
    val api_info: ApiInfoX,
    val items: List<Item>,
    val region_metadata: List<RegionMetadataX>
)