package com.example.zoro.project1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView teks1, teks2;
    Button tombol1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol1=(Button) findViewById(R.id.tombol1);
        teks1=(TextView)findViewById(R.id.teks1_1);
        teks2=(TextView)findViewById(R.id.teks1_2);


        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        tombol1.setTypeface(customfont);
        Typeface customfont2=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks1.setTypeface(customfont2);
        Typeface customfont3=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks2.setTypeface(customfont3);
    }
    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

}
