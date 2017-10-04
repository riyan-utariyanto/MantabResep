package com.riyan.MantabResep;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Nasi extends AppCompatActivity {

    TextView textView1,textView2;
    ImageView imageView;
    String judulku,langkahku,bahanku;
    int gambarku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi);

        textView1 = (TextView)findViewById(R.id.txtBahan2);
        textView2 = (TextView)findViewById(R.id.txtLangkah2);
        imageView = (ImageView)findViewById(R.id.foto);

        Bundle extras = getIntent().getExtras();
        judulku = extras.getString("judul");
        gambarku = extras.getInt("image");
        bahanku = extras.getString("bahan2");
        langkahku = extras.getString("langkah2");

        setTitle(judulku);
        imageView.setImageResource(gambarku);
        textView1.setText(bahanku);
        textView2.setText(langkahku);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDefaultDisplayHomeAsUpEnabled(true);
    }
}
