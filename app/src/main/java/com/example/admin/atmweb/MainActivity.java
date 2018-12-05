package com.example.admin.atmweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText et;
    TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText);
        tv=findViewById(R.id.textView);

        Button b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                tv.setText(et.getText());
                Intent i=new Intent(MainActivity.this,CollectMoney.class);
                startActivity(i);
            }
        });
    }
}
