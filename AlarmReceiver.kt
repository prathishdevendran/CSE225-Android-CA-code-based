package com.example.myactivity4app.ui.theme.Android_CA

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val task = intent.getStringExtra("task") ?: "No Task"

        Toast.makeText(context, "Reminder: $task", Toast.LENGTH_LONG).show()
    }

}