package com.example.ejy77.nonprivateproject;


import android.os.Handler;
import android.os.Message;

/**
 * Created by ejy77 on 2017-07-18.
 */

public class ServiceThread extends Thread {

    Handler handler;
    Boolean isRun = true;

    public ServiceThread(Handler handler){
        this.handler = handler;
    }

    public void stopForever(){
        synchronized (this){
            this.isRun = false;
        }
    }


    public void run()
    {
        while(isRun){
            handler.sendEmptyMessage(0);
            try
            {
                Thread.sleep(10000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
