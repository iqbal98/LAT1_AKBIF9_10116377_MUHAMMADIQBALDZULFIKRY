package com.example.zoro.project1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView teks2_1, teks2_2, teks2_3, teks2_4, teks2_5, teks2_6, teks2_7, teks2_8;
    Button tombol2_1, tombol2_2;
    EditText edittext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tombol2_1=(Button) findViewById(R.id.tombol2_1);
        tombol2_2=(Button) findViewById(R.id.tombol2_2);
        edittext1=(EditText) findViewById(R.id.edittext1);
        teks2_1=(TextView)findViewById(R.id.teks2_1);
        teks2_2=(TextView)findViewById(R.id.teks2_2);
        teks2_3=(TextView)findViewById(R.id.teks2_3);
        teks2_4=(TextView)findViewById(R.id.teks2_4);
        teks2_5=(TextView)findViewById(R.id.teks2_5);
        teks2_6=(TextView)findViewById(R.id.teks2_6);
        teks2_7=(TextView)findViewById(R.id.teks2_7);
        teks2_8=(TextView)findViewById(R.id.teks2_8);

        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        tombol2_1.setTypeface(customfont);
        Typeface customfont1=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        tombol2_2.setTypeface(customfont1);
        Typeface customfont2=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        edittext1.setTypeface(customfont2);
        Typeface customfont3=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks2_1.setTypeface(customfont3);
        Typeface customfont4=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks2_2.setTypeface(customfont4);
        Typeface customfont5=Typeface.createFromAsset(getAssets(),"font/rubik_regular.ttf");
        teks2_3.setTypeface(customfont5);
        Typeface customfont6=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks2_4.setTypeface(customfont6);
        Typeface customfont7=Typeface.createFromAsset(getAssets(),"font/rubik_regular.ttf");
        teks2_5.setTypeface(customfont7);
        Typeface customfont8=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks2_6.setTypeface(customfont8);
        Typeface customfont9=Typeface.createFromAsset(getAssets(),"font/rubik_regular.ttf");
        teks2_7.setTypeface(customfont9);
        Typeface customfont10=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks2_8.setTypeface(customfont10);
    }
    public void pindah2(View view) {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);

    }
}
