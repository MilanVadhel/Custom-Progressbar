package com.wayfortech.customprogressbar.utils

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.view.Window
import androidx.core.content.ContextCompat
import com.wayfortech.customprogressbar.R

object ProgressBarUtils {

    private var dialog: Dialog? = null

    fun showProgressDialog(context: Context) {
        if (dialog == null) {
            dialog = Dialog(context)
            dialog?.apply {
                requestWindowFeature(Window.FEATURE_NO_TITLE)
                setContentView(R.layout.progressbar1)
                window?.setBackgroundDrawable(
                    ColorDrawable(
                        ContextCompat.getColor(
                            context,
                            android.R.color.transparent
                        )
                    )
                )
                setCancelable(false)
            }
        }
        dialog?.show()
    }

    fun hideProgressDialog() {
        dialog?.apply {
            if (isShowing) {
                dismiss()
            }
            dialog = null
        }
    }
}