package com.emrehmrc.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private static final String TAG = "Main3Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: 3");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView textView=findViewById(R.id.txt3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);

            }
        });
    }
    @Override
    public void finish() {
        super.finish();
        Log.d(TAG, "finish: 3");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 3");
    }
}
