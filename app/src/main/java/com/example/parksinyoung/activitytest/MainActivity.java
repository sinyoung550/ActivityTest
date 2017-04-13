package com.example.parksinyoung.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain = (Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMainHendler);
    }
    View.OnClickListener butMainHendler=new View.OnClickListener() {//이벤트핸들러의 객체
        @Override
        public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
    };
}
