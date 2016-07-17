package com.example.yahdif;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import java.util.HashMap;
import org.json.JSONArray;

import com.example.yahdif.R;

import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyAccount extends Activity {
	Button menu;
	Button logout;
    SessionManager session;
    TextView status;
    JSONArray contacts = null;
    String email, nama, id;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_account);
	    menu = (Button) findViewById(R.id.menu);
		 session = new SessionManager(getApplicationContext());
	        Toast.makeText(getApplicationContext(),
	                "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG)
	                .show();
	 
	        session.checkLogin();
	 
	        HashMap<String, String> user = session.getUserDetails();
	 
	        nama = user.get(SessionManager.KEY_NAME);
	        // id = user.get(SessionManager.KEY_ID);
	 
	        TextView status = (TextView) findViewById(R.id.status);
	        status.setText(Html.fromHtml("Welcome,<b>" + nama + "</b>  "));
	 
	        logout = (Button) findViewById(R.id.logout);
	 
	        logout.setOnClickListener(new View.OnClickListener() {
	 
	            @Override
	            public void onClick(View arg0) {
	                // TODO Auto-generated method stub
	                session.logoutUser();
	                finish();
	            }
	        });
	        menu.setOnClickListener(new View.OnClickListener() {
	        	 
	            @Override
	            public void onClick(View view) {
	                // Jalankan class TambahBukuTamu untuk menambah entri
	                Intent i = new Intent(getApplicationContext(),Menu.class);
	                startActivity(i);
	 
	            }
	        });
	    }
	 
	}