package com.example.care_247;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Faq extends Activity {
	Dialog d;
	TextView t;
	AlertDialog levelDialog;
	AlertDialog.Builder builder;
		Button buttonSend,b1,b2;
		EditText textTo;
		EditText textSubject;
		EditText textMessage;
		EditText Name;
	 
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
			setContentView(R.layout.enquiry);
			 t=new TextView(this);
		   	 d=new Dialog(this);
			buttonSend = (Button) findViewById(R.id.button3);
			b2=(Button)findViewById(R.id.button2);
			b1=(Button)findViewById(R.id.button1);
		//	Name = (EditText) findViewById(R.id.editText1);
			textSubject = (EditText) findViewById(R.id.editText1);
			textMessage = (EditText) findViewById(R.id.editText2);
	 
			buttonSend.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View v) {
					if(textSubject.getText().toString().equals("")||textMessage.getText().toString().equals("") )
					{
						Toast.makeText(Faq.this, "Enter the values in the field first", Toast.LENGTH_LONG).show();
					}
					else
					{
				  String to ="rsdeadlyking00@gmail.com";
				  String subject =textSubject.getText().toString();
				  String message = textMessage.getText().toString();
	 
				  Intent email = new Intent(Intent.ACTION_SEND);
				  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
				  //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
				  //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
				  email.putExtra(Intent.EXTRA_SUBJECT, subject);
				  email.putExtra(Intent.EXTRA_TEXT, message);

				  //need this to prompts email client only
				  email.setType("message/rfc822");
				  
				  startActivity(Intent.createChooser(email, "Choose an Email client :"));
					}
				}
			});
			b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Faq.this,Home.class);
					startActivity(i);
				}
			});
			b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					t.setText("User can send their feedback or ask queries regarding the application ");
					//t.setText("hello");
					t.setPadding(60, 60, 60, 60);
					
					
					d.setTitle("Care 24*7 FAQ");
					d.setContentView(t);
					d.show();		
					
				}
			});
		}
	}
