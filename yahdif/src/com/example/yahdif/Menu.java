package com.example.yahdif;

import com.example.yahdif.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class Menu extends Activity{
 
    Button btnLihatData;
    Button btnBuatData;
    Button btnCobaData;
    Button btnExit;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
 
        // tombol lihat data dan buat data
  
        btnBuatData = (Button) findViewById(R.id.btnBuatData);
       
        btnExit = (Button) findViewById(R.id.btnExit);
 
        // event dari lihat data
        btnLihatData.setOnClickListener(new View.OnClickListener() {
 
            @Override
            public void onClick(View view) {
                // jalankan activity dari SemuaBukuTamu
                Intent i = new Intent(getApplicationContext(), HitungPersegiPanjang.class);
                startActivity(i);
 
            }
        });
 
        // jalankan activity untuk melihat BukuTamu
        btnBuatData.setOnClickListener(new View.OnClickListener() {
 
            @Override
            public void onClick(View view) {
                // Jalankan class TambahBukuTamu untuk menambah entri
                Intent i = new Intent(getApplicationContext(),HitungSegitiga.class);
                startActivity(i);
 
            }
        });
        
        btnCobaData.setOnClickListener(new View.OnClickListener() {
        	 
            @Override
            public void onClick(View view) {
                // Jalankan class TambahBukuTamu untuk menambah entri
                Intent i = new Intent(getApplicationContext(),Lingkaran.class);
                startActivity(i);
 
            }
        });
        
        btnExit.setOnClickListener(new View.OnClickListener() {
        	 
            @Override
            public void onClick(View view) {
                // Jalankan class TambahBukuTamu untuk menambah entri
                Intent i = new Intent(getApplicationContext(), MyAccount.class);
                startActivity(i);
 
            }
        });
    }
    
}
