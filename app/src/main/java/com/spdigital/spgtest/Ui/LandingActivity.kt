package com.spdigital.spgtest.Ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.spdigital.spgtest.R
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLng

class LandingActivity : FragmentActivity(), OnMapReadyCallback {
     var mGoogleMap: GoogleMap?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        val mapFragment =
            supportFragmentManager.run { findFragmentById(R.id.map_fragment) } as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        mGoogleMap=googleMap
        val location = LatLng(0.0,0.0)
        mGoogleMap?.addMarker(MarkerOptions().position(location).title("pin info here"))
        mGoogleMap?.moveCamera(CameraUpdateFactory.newLatLng(location))
    }

}