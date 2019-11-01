package com.spdigital.spgtest.Ui.map

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.spdigital.spgtest.R
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.spdigital.spgtest.base.BaseActivity
import com.spdigital.spgtest.base.Injection
import com.spdigital.spgtest.network.BaseResponse
import com.spdigital.spgtest.utils.FormatedPsiData
import com.spdigital.spgtest.viewmodel.PsiViewModel

class LandingActivity : BaseActivity(), OnMapReadyCallback {


    var mGoogleMap: GoogleMap? = null
    lateinit var psiViewModel: PsiViewModel
    lateinit var baseResponse: BaseResponse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        psiViewModel =
            ViewModelProviders.of(this, Injection.provideViewModelFactory(this)).get(PsiViewModel::class.java)

        val mapFragment =
            supportFragmentManager.run { findFragmentById(R.id.map_fragment) } as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
        getPsiInfo()
    }


    override fun onMapReady(googleMap: GoogleMap?) {
        mGoogleMap = googleMap
    }

    private fun getPsiInfo() {
        showProgress()
        psiViewModel.getPsiInfo("2019-10-27T10:46:25", "2019-10-27T").observe(this, Observer {
            hideProgress()
            it.let {
                baseResponse = it
                loadMarkerOnMap()
            }
        })
    }

    private fun loadMarkerOnMap() {
        setInfoAdapter()
        for (item in baseResponse.region_metadata) {
            val location = LatLng(item.label_location.latitude, item.label_location.longitude)
            val markerOptions = MarkerOptions()
            markerOptions.position(location)
                .title(item.name)


            val marker = mGoogleMap?.addMarker(markerOptions)
            marker?.tag = FormatedPsiData.getFormatedData(
                baseResponse.items[0],
                item.name
            )
            marker?.showInfoWindow()
            mGoogleMap?.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 11.15f))
        }

    }

    private fun setInfoAdapter() {
        val customInfoWindow = InfoWindowAdapter(this)
        mGoogleMap?.setInfoWindowAdapter(customInfoWindow)
    }


}