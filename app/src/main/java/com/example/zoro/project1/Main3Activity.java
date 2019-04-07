package com.example.zoro.project1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView teks3_1, teks3_2;
    Button tombol3;
    EditText edittext3_1, edittext3_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tombol3=(Button) findViewById(R.id.tombol3);
        edittext3_1=(EditText) findViewById(R.id.edittext3_1);
        edittext3_2=(EditText) findViewById(R.id.edittext3_2);
        teks3_1=(TextView)findViewById(R.id.teks3_1);
        teks3_2=(TextView)findViewById(R.id.teks3_2);

        Typeface customfont1=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        tombol3.setTypeface(customfont1);
        Typeface customfont2=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        edittext3_1.setTypeface(customfont2);
        Typeface customfont22=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        edittext3_2.setTypeface(customfont22);
        Typeface customfont3=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks3_1.setTypeface(customfont3);
        Typeface customfont33=Typeface.createFromAsset(getAssets(),"font/nunito_bold.ttf");
        teks3_2.setTypeface(customfont33);
    }
    public void berubah (View view) {
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        final EditText etData = (EditText) findViewById(R.id.edittext3_1);
        intent.putExtra("data1", etData.getText().toString());
        startActivity(intent);
    }
}
