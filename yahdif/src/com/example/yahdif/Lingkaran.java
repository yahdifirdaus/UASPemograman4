package com.example.yahdif;


import com.example.yahdif.R;

import android.app.Activity;

	import android.os.Bundle;

	import android.view.View;

	import android.widget.Button;

import android.widget.EditText;

	 
	public class Lingkaran extends Activity {

	    private EditText txtJari;

	    private EditText txtLuas;

	    private Button btnHitung;

	 

	    /**

	     * Method yang dipanggil pada saat applikaasi dijalankan

	     * */

	    @Override

	    public void onCreate(Bundle savedInstanceState) {

	 

	        super.onCreate(savedInstanceState);

	        setContentView(R.layout.lingkaran);

	        txtJari = (EditText) findViewById(R.id.txtJari);

	        txtLuas = (EditText) findViewById(R.id.txtLuas);

	        btnHitung = (Button) findViewById(R.id.btnHitung);

	 

	    }

	 

	    /**

	     * Method untuk Menghitung Luas Lingkaran dipanggil pada saat button

	     * Hitung Luas diklik

	     *

	     * @param view

	     */

	    public void hitungLuas(View view) {

	        try {

	 

	            int jarijari = Integer.parseInt(txtJari.getText().toString());

	            double phi = 3.14;

	            double luas =  phi * jarijari * jarijari;

	            txtLuas.setText(String.valueOf(luas));

	        } catch (Exception e) {

	            e.printStackTrace();

	        }

	    }

	 

	   

	    public void backtoMenu(View view){

	        finish();

	    }

	}