package com.example.parksinyoung.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editName,editTel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain = (Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMainHendler);
        editName=(EditText)findViewById(R.id.Edit_name);
        editTel=(EditText)findViewById(R.id.Edit_tel);
    }
    View.OnClickListener butMainHendler=new View.OnClickListener() {//이벤트핸들러의 객체
        @Override
        public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            String name = editName.getText().toString(); //변수 name에 저장
            String tel = editTel.getText().toString(); //변수 tel에 저장
            intent.putExtra("name",name); //putExtra(이름,값);
            intent.putExtra("name",tel);
            startActivity(intent);
        }
    };
}
