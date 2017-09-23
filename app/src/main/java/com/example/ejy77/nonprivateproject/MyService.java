package com.example.ejy77.nonprivateproject;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.IntDef;
import android.support.v7.view.menu.MenuAdapter;
import android.widget.Toast;

public class MyService extends Service {

    NotificationManager notificationManager;
    ServiceThread serviceThread;
    Notification notification;


    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        myServiceHandler handler = new myServiceHandler();
        serviceThread = new ServiceThread(handler);
        serviceThread.start();

        return START_STICKY;


    }

    @Override
    public void onDestroy() {
        serviceThread.stopForever();
        serviceThread = null;
    }


    class myServiceHandler extends Handler
    {

        public void handleMessage(Message msg) {
            Intent intent = new Intent(MyService.this, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(MyService.this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        }

    }
}
