package com.spdigital.spgtest.Ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.spdigital.spgtest.R
import com.spdigital.spgtest.Ui.map.LandingActivity
import com.spdigital.spgtest.base.BaseActivity
import com.spdigital.spgtest.base.Injection
import com.spdigital.spgtest.viewmodel.PsiViewModel

class SplashActivity : AppCompatActivity() {
    private val handler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        launchNext()
    }


    fun launchNext() {
        handler.postDelayed(Runnable {
            val intent: Intent? = Intent(this, LandingActivity::class.java)
            intent.let {
                startActivity(intent)
                finish()
            }
        }, 2 * 1000)
    }
}
