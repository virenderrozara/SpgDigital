package com.spdigital.spgtest.Ui.map

import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import android.app.Activity
import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.spdigital.spgtest.R
import com.spdigital.spgtest.network.response.RegionMetadataX


class InfoWindowAdapter(context: Context) : GoogleMap.InfoWindowAdapter {
    var mcContext: Context = context
    override fun getInfoContents(marker: Marker?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInfoWindow(marker: Marker?): View {

        val view = (mcContext as Activity).layoutInflater
            .inflate(R.layout.item_info_window, null)

        val tvTitle = view.findViewById(R.id.tv_title) as? TextView
        val tvPsiInfo = view?.findViewById(R.id.tv_psi_info) as? TextView

        tvTitle?.text = marker?.title?.toUpperCase()
        tvPsiInfo?.text = marker?.tag as String
        return view
    }
}