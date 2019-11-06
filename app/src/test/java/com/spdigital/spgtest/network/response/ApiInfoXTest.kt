package com.spdigital.spgtest.network.response

import org.junit.Assert.*
import org.junit.Test

class ApiInfoXTest{

    @Test
    fun testDefaultValues(){
        val resp=ApiInfoX("healthy")
        assertEquals("healthy",resp.status)
    }
}