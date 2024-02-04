package com.example.lusod2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button= (Button )findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                openMainActivity3();
            }
        });
    }
    public void  openMainActivity3(){
        Intent intent = new Intent( this, MainActivity3.class );
        startActivity(intent);
    }

}