package com.example.activity;

import java.io.IOException;

import android.app.Service;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.content.Intent;



public class ServiceKu extends Service {
    MediaPlayer musik;

    @Override
    public IBinder onBind(Intent intent){

        return null;
    }

    @Override
    public void onCreate() {
// TODO Auto-generated method stub
    }

    @Override
    public void onStart(Intent intent, int startId) {
// TODO Auto-generated method stub
        musik = MediaPlayer.create(this, R.raw.novrain);
        try {
            musik.prepare();
        } catch (IllegalStateException e) {
// TODO Auto-generated
//  catch block
e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
        }

        musik.start();
    }

    @Override
    public void onDestroy() {
// TODO Auto-generated method stub
musik.stop();
    }
}

