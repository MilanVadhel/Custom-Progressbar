package com.wayfortech.customprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.wayfortech.customprogressbar.utils.ProgressBarUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        btnShowProgressBar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.btnShowProgressBar -> {
                ProgressBarUtils.showProgressDialog(this)
           }
       }
    }
}