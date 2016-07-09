package com.sg_tmt.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

import io.repro.android.Repro;

public class MainActivity extends Activity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("test", "Custom App load");
                Repro.track("MainActivity");
                Repro.startRecording();
                Repro.track("add to cart", new HashMap<String, Object>() {{
                    put("product_id", 5321);
                }});

            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        Repro.track("Activity");
    }

    }
