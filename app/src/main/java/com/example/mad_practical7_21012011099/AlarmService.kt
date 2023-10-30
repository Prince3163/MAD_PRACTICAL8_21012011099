package com.example.mad_practical7_21012011099


import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.mad_practical7_21012011099.AlarmService

class AlarmBroadcastReceiver : BroadcastReceiver() {

    companion object {
        val ALARMKEY = "KEY"
        val ALARMSTART = "START"
        val ALARMSTOP = "STOP"
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (intent != null) {
            val data = intent.getStringExtra(ALARMKEY)

            if (data != null) {

                val intentservice = Intent(context, AlarmService::class.java)

                if (data == ALARMSTART) {
                    context.startService(intentservice)
                }
                else{
                    context.stopService(intentservice)
                }
            }
        }
    }
}