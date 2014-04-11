package com.example.userpass_compundcontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.*;

public class UserPassBox extends GridLayout {
	private TextView textview1,textview2;
	private EditText userName,password;;
	private Button submit;
	public UserPassBox(Context context) {
		super(context); 
		loadViews();
	}
	public UserPassBox(Context context, AttributeSet attrs) {
		super(context, attrs);

		LayoutInflater inflater = LayoutInflater.from(context);
		inflater.inflate(R.layout.user_password, this);
 
		loadViews();
	}	
	public EditText getUserName() {
		return userName;
	}
	public EditText getPassword() {
		return password;
	}
	public Button getSubmit() {
		return submit;
	}
	public void setUserName(EditText userName) {
		this.userName = userName;
	}
	public void setPassword(EditText password) {
		this.password = password;
	}
	private void loadViews() {
		textview1 = (TextView) findViewById(R.id.textView1);
		textview2 = (TextView) findViewById(R.id.textView2);
		userName = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password);	
		submit = (Button) findViewById(R.id.button1);
	}
}
