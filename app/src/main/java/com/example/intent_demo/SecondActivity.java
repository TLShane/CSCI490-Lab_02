package com.example.intent_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textView2;
    private ImageView image1;
    private ImageView image2;
    private int imageID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //part 1 of lab
        //Intent i = getIntent();
        // String s = i.getExtras().getString("testString");
        //String s = editText.getText().toString();
        //i.putExtra("testString", s);
        //textView2 = findViewById(R.id.textView2);
        //textView2.setText(s);

        //part 2 of lab
        image1 = findViewById(R.id.moonimage);
        image2 = findViewById(R.id.waterimage);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageID = R.drawable.supermoon;
                finish();
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageID = R.drawable.waterfall;
                finish();
            }
        });



    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("imageID", imageID);
        setResult(-1, intent);
        super.finish();

    }
}
