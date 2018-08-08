package com.example.quentinclayton.guessingfungame;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class SeventhActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventh_activity);
        ImageView img = findViewById(R.id.seventh);
        Button correct = (Button)findViewById(R.id.correct7);
        Button incorrect1 = (Button) findViewById(R.id.incorrect1);
        Button incorrect2 = (Button) findViewById(R.id.incorrect2);
        Button incorrect3 = (Button) findViewById(R.id.incorrect3);
        AssetManager am = getAssets();
        try {
            InputStream ims = am.open("spacewar.jpg");

            Drawable d = Drawable.createFromStream(ims, null);

            img.setImageDrawable(d);

        } catch (IOException ex) {
            return;
        }
        correct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent k = new Intent(SeventhActivity.this, EighthActivity.class);
                startActivity(k);
                Toast.makeText(SeventhActivity.this, "Correct Answer", Toast.LENGTH_LONG).show();
                MainActivity.score += 1;
            }
        });
        incorrect1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(SeventhActivity.this, "Incorrect Answer", Toast.LENGTH_LONG).show();
                MainActivity.score -= 1;
            }
        });
        incorrect2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(SeventhActivity.this, "Incorrect Answer", Toast.LENGTH_LONG).show();
                MainActivity.score -= 1;
            }
        });
        incorrect3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(SeventhActivity.this, "Incorrect Answer", Toast.LENGTH_LONG).show();
                MainActivity.score -= 1;
            }
        });
    }
}
