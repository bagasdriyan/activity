package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class activityUtama extends Activity implements OnClickListener {
    Button fbBtn, twBtn, telBtn, smsBtn, playBtn, stopBtn, sysBtn; MediaPlayer musik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//koneksi dari layout ke objek java
        fbBtn = (Button) findViewById(R.id.button1);
        fbBtn.setOnClickListener(this);
        twBtn = (Button) findViewById(R.id.button2);
        twBtn.setOnClickListener(this);
        telBtn = (Button) findViewById(R.id.button3);
        telBtn.setOnClickListener(this);
        smsBtn = (Button) findViewById(R.id.button4);
        smsBtn.setOnClickListener(this);
        playBtn = (Button) findViewById(R.id.button5);
        playBtn.setOnClickListener(this);
        stopBtn = (Button) findViewById(R.id.button6);
        stopBtn.setOnClickListener(this);
        sysBtn = (Button) findViewById(R.id.button7);
        sysBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
// TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.button1:
                Intent intfb = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://facebook.com"));

                startActivity(intfb);
                break;

            case R.id.button2:
                Intent inttw = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com"));
                startActivity(inttw);
                break;

            case R.id.button3:
                Intent inttel = new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:+6281234567890"));
                startActivity(inttel);
                break;

            case R.id.button4:
                Intent intsms = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("smsto:+6281234567890"));
                intsms.putExtra("sms_body", "Halo apa kabar");
                startActivity(intsms);
                break;

            case R.id.button5:
                startService(new Intent(activityUtama.this, ServiceKu.class));
                break;

            case R.id.button6:
                stopService(new Intent(activityUtama.this, ServiceKu.class));
                break;

            case R.id.button7:
                Intent intSys = new Intent(activityUtama.this, ListActivity.class);
                startActivity(intSys);
                break;

        }

    }
}

