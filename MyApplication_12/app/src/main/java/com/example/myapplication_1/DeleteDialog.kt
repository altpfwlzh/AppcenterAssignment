package com.example.myapplication_1

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.widget.Button

class DeleteDialog (val onOk: () -> Unit) {
    fun show(context: Context) {
        val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val customLayout = inflater.inflate(R.layout.delete_dialog, null)
        val build = AlertDialog.Builder(context).apply {
            setView(customLayout)
        }

        val dialog = build.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val btnOk = customLayout.findViewById<Button>(R.id.ok_button)
        btnOk.setOnClickListener {
            onOk()
            dialog.dismiss()
        }
        val btnCancel = customLayout.findViewById<Button>(R.id.cancel_button)
        btnCancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}