package com.example.userpass_compundcontrol;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	UserPassBox userbox;
	String userName,password;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		userbox = (UserPassBox)findViewById(R.id.userPassBox1);
		
		userbox.getSubmit().setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
            	userName =userbox.getUserName().getText().toString();
				password =userbox.getPassword().getText().toString();
				Toast.makeText(MainActivity.this,"User Name : "+ userName+"\nPassword : "+password,Toast.LENGTH_LONG).show();
			}
        });
	}
}
