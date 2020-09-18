package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView out;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out=findViewById(R.id.textView);
        //out.setText("haha");

        edit=findViewById(R.id.editText1);
        //String str=input.getText().toString();


    }
    public void btn(View v){
        String str=edit.getText().toString();
        float t1=Float.parseFloat(str);
        double t2=t1 * 33.8;
        String outstr=String.valueOf(t2);
        out.setText(outstr);


    }

}
//2020/9/18修改后提交
//冲