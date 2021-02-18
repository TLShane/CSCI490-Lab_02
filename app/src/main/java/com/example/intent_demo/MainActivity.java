package com.example.intent_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int BACKROUND_CODE = 1;

    private Button button;
    private Intent i;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);

        button = findViewById(R.id.button);
        i = new Intent(this, SecondActivity.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String s = editText.getText().toString();
                i.putExtra("testString", s);

                startActivity(i);
            }
        });
    }
    //   @Override
    //   protected void onActivityResult (int requestCode, int resultCode, Intent data) {
    //   super.onActivityResult(requestCode, resultCode, data);
    //
    //   if (requestCode == BACKROUND_CODE && requestCode == Activity.RESULT_OK){
    //       Bundle extras = data.getExtras();
    //       if (extras != null){
    //        ConstraintLayout currentLayout = findViewById(R.id.main_layout);
    //      }
    //  }
    //   }
}
