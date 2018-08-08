package com.example.quentinclayton.guessingfungame;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class NinthActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ninth_activity);
        ImageView img = findViewById(R.id.ninth);
        Button correct = (Button)findViewById(R.id.correct9);
        AssetManager am = getAssets();
        try {
            InputStream ims = am.open("worldofwarcraft.jpg");

            Drawable d = Drawable.createFromStream(ims, null);

            img.setImageDrawable(d);

        } catch (IOException ex) {
            return;
        }
        correct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent k = new Intent(NinthActivity.this, TenthActivity.class);
                startActivity(k);
            }
        });
    }
}
