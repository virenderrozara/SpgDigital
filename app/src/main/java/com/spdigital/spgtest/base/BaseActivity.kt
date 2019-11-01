package com.spdigital.spgtest.base
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.spdigital.spgtest.R
import com.spdigital.spgtest.utils.NetworkUtils

abstract class BaseActivity : AppCompatActivity() {
    private lateinit var mDialog: Dialog
    fun isNetworkConnected(): Boolean {
        return NetworkUtils.isNetworkConnected(applicationContext)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDialog = Dialog(this, R.style.transDialog)
        mDialog.setContentView(R.layout.view_progress_dialog)


    }


    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun showProgress() {
        mDialog.show()
    }

    fun hideProgress() {
        mDialog.hide()
    }
}