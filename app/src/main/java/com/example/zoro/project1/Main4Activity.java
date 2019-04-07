package com.example.zoro.project1;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView teks41, teks42;
    Button tombol4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView tvData2 = (TextView) findViewById(R.id.tv_teks1);
        tvData2.setText(getIntent().getStringExtra("data1"));

        teks41=(TextView)findViewById(R.id.teks4_1);
        teks42=(TextView)findViewById(R.id.teks4_2);
        tombol4=(Button) findViewById(R.id.tombol4);

        Typeface customfont1=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        tombol4.setTypeface(customfont1);
        Typeface customfont3=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks41.setTypeface(customfont3);
        Typeface customfont33=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks42.setTypeface(customfont33);
        Typeface customfont34=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        tvData2.setTypeface(customfont34);
    }
}
