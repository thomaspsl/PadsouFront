package com.example.padsou.ui.components

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.padsou.R

@Composable
fun MiniNotification(context: Context, title: String, caption: String){
    // Variables

    // Content
    fun createNotificationChannel(channelId: String, context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "PadsouChannel"
            val descriptionText = "Padsou Description Channel"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(channelId, name, importance).apply {
                description = descriptionText
            }

            val notificationManager: NotificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    LaunchedEffect(Unit) {
        createNotificationChannel("PadsouChannel", context)
    }

    val builder = NotificationCompat.Builder(LocalContext.current, "PadsouChannel")
        .setSmallIcon(R.drawable.img)
        .setContentTitle(title)
        .setContentText(caption)
        .setPriority(NotificationCompat.PRIORITY_DEFAULT)

    with(NotificationManagerCompat.from(LocalContext.current)) {
        notify(0, builder.build())
    }
}