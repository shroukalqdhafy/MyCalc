package com.example.mycalc;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv_output = findViewById(R.id.tv_output);
        final EditText ed_num1 =findViewById(R.id.ed_num1);
        final EditText ed_num2 =findViewById(R.id.ed_num2);
        Button btn_add =findViewById(R.id.btn_add);
        Button btn_sub =findViewById(R.id.btn_sub);
        Button btn_mlt =findViewById(R.id.btn_mlt);
        Button btn_div =findViewById(R.id.btn_div);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 =Integer.parseInt(ed_num1.getText().toString());
                int num2 =Integer.parseInt(ed_num2.getText().toString());
                int output =num1 + num2;
                tv_output.setText(String.valueOf(output));
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 =Integer.parseInt(ed_num1.getText().toString());
                int num2 =Integer.parseInt(ed_num2.getText().toString());
                int output =num1 - num2;
                tv_output.setText(String.valueOf(output));
            }
        });
        btn_mlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 =Integer.parseInt(ed_num1.getText().toString());
                int num2 =Integer.parseInt(ed_num2.getText().toString());
                int output =num1 * num2;
                tv_output.setText(String.valueOf(output));
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 =Integer.parseInt(ed_num1.getText().toString());
                    int num2 =Integer.parseInt(ed_num2.getText().toString());
                    int output =num1 / num2;
                    tv_output.setText(String.valueOf(output));
                }catch (Exception ex){
                    if (Objects.equals(ex.getMessage(), "divide by zero"))
                    {
                        Toast.makeText(MainActivity.this, "divide by zero", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(MainActivity.this, "Error"+ex.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


    }
}