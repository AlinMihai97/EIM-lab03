package com.example.eimlab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View[] arr = new View[9];
        arr[0] = findViewById(R.id.button1);
        arr[1] = findViewById(R.id.button2);
        arr[2] = findViewById(R.id.button3);
        arr[3] = findViewById(R.id.button4);
        arr[4] = findViewById(R.id.button5);
        arr[5] = findViewById(R.id.button6);
        arr[6] = findViewById(R.id.button7);
        arr[7] = findViewById(R.id.button8);
        arr[8] = findViewById(R.id.button9);


        for(int i = 0; i < 9 ; i++) {
            // Log.d(arr[i].toString(), "mamaie");
            arr[i].setOnClickListener(new   View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button but = (Button) view;
                    ((EditText)findViewById(R.id.editText)).append(but.getText());
                }
            });
    }





    }
}
