package com.jaya.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button rectangle,go,cbbutton;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rectangle=(Button)findViewById(R.id.rectangle);
        go=(Button)findViewById(R.id.go);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        cb1=(CheckBox)findViewById(R.id.cb1);
        cb2=(CheckBox)findViewById(R.id.cb2);
        cbbutton=(Button) findViewById(R.id.cbbutton);
        cbbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb= new StringBuilder("");
                if (cb1.isChecked())
                {
                    String s1=cb1.getText().toString();
                    sb.append(s1);
                }
                if (cb2.isChecked())
                {
                    String s2=cb2.getText().toString();
                    sb.append(s2);
                }
                if (sb!=null&&!sb.toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(),sb,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"NOTHING SELECTED",Toast.LENGTH_SHORT).show();
                }
            }
        });
        RadioGroup rg=(RadioGroup)findViewById(R.id.radiogroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.rb1:
                        Toast.makeText(getApplicationContext(),"select:-"+rb1.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(getApplicationContext(),"select:-"+rb2.getText().toString(),Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"GO button clicked",Toast.LENGTH_SHORT).show();
            }
        });
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"rectangle button clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
