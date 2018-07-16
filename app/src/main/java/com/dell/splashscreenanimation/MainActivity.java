package com.dell.splashscreenanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pass;
    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText)findViewById(R.id.editText);
        pass = (EditText)findViewById(R.id.editText2);
        log = (Button)findViewById(R.id.button);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uname.getText().toString().equals("Prat") &&
                        pass.getText().toString().equals("123")){

                    Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

}
