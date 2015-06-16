package com.example.care_247;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Diabetes  extends Activity {

	EditText e,g;
	TextView t,t1,t2,t3;
	Button b;
	Float n,r;
	double m;
	Button b1,b6;
	String s,s1;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
			setContentView(R.layout.dbtes);
			b=(Button)findViewById(R.id.button1);
			b1=(Button)findViewById(R.id.button2);
			
			
			e=(EditText)findViewById(R.id.editText1);
	
			t=(TextView)findViewById(R.id.textView1);
			t1=(TextView)findViewById(R.id.textView2);
			t2=(TextView)findViewById(R.id.textView3);
			t3=(TextView)findViewById(R.id.textView6);
b1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Intent i=new Intent(Diabetes.this,Home.class);
					startActivity(i);
					
					
				}
			});
			
			b.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					if(e.getText().toString().equals("") )
					{
						Toast.makeText(Diabetes.this, "Enter the value in the field first", Toast.LENGTH_LONG).show();
					}
					else
					{
					s=e.getText().toString();
					
					r=Float.parseFloat(s);
					
					m=(int)(28.7*r)-(46.7);
					
					t2.setText(""+m);
					if(m>100)
					t3.setText("your sugar level is high.");
					if(m>70 && m<=100)
					t3.setText("your sugar level is normal.");
					if(m<70)
					t3.setText("your sugar level is low.");
					}
					
				}
			});
		}}