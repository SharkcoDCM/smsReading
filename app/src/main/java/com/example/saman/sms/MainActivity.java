package com.example.saman.sms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textV1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void updateTheTextView(final String t) {
        MainActivity.this.runOnUiThread(new Runnable() {
            public void run() {
                Log.i("samaaantaag",t);
//                Toast.makeText(MainActivity.this,t,Toast.LENGTH_LONG).show();
//                TextView textV1 = (TextView) findViewById(R.id.txtV1);
//                textV1.setText(t);
            }
        });
    }

}

