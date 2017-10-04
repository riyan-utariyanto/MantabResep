package com.riyan.MantabResep;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[], s2[], s3[], s4[];
    //s1 = judul from array
    //s2 = array deskripsi
    //s3 = array bahan-bahan
    //s4 = array langkah-langkah
    int ico[] = {R.drawable.ic_ayam, R.drawable.ic_mie, R.drawable.ic_piscok,
            R.drawable.ic_tahu, R.drawable.ic_nasi,R.drawable.ic_teler,R.drawable.ic_puding};
    int img[] = {R.drawable.ayam, R.drawable.mie, R.drawable.piscok, R.drawable.tahu,
            R.drawable.nasi,R.drawable.esteler,R.drawable.puding};
    MyAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RecyclerView) findViewById(R.id.myRecycler);
        s1 = getResources().getStringArray(R.array.judul);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.bahan_bahan);
        s4 = getResources().getStringArray(R.array.langkah_langkah);

        ad = new MyAdapter(this, s1, s2, s3, s4, ico, img);
        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Really Exit")
                .setMessage("Are you sure?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null);
                AlertDialog alert = builder.create();
                alert.show();
    }
}
