package com.example.care_247;

import java.util.Calendar;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends ActionBarActivity{
	Dialog d,d1;
	TextView t,t1;
	AlertDialog levelDialog;
	AlertDialog.Builder builder;
	Button b1,b2;
	ImageView i4,i10,i5,i1,i2,i3,i11,i15,i6,i7,i13,i9,i12,i8;

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.fragment_main);
	        i4=(ImageView)findViewById(R.id.imageView4);
	        i5=(ImageView)findViewById(R.id.imageView5);
	        i10=(ImageView)findViewById(R.id.imageView10);
	        i1=(ImageView)findViewById(R.id.imageView1);
	        i2=(ImageView)findViewById(R.id.imageView2);
	        i3=(ImageView)findViewById(R.id.imageView3);
	        i11=(ImageView)findViewById(R.id.imageView11);
	        i15=(ImageView)findViewById(R.id.imageView15);
	        i6=(ImageView)findViewById(R.id.imageView6);
	        i7=(ImageView)findViewById(R.id.imageView7);
	        i13=(ImageView)findViewById(R.id.imageView13);
	        i9=(ImageView)findViewById(R.id.imageView9);
	        i12=(ImageView)findViewById(R.id.imageView12);
	        i8=(ImageView)findViewById(R.id.imageView8);
	        
	        t=new TextView(this);
	   	 d=new Dialog(this);
	   	 t1=new TextView(this);
	   	 d1=new Dialog(this);
b1=(Button)findViewById(R.id.button1);
b2=(Button)findViewById(R.id.button2);
b1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		t.setText(" Care 24*7 is a handy application which influences every person's attention towards their own health.The application will focus on regulating the daily activities of a person that will have a direct impact on their food habits,water consumption levels and exercise routines.");
		//t.setText("hello");
		t.setPadding(60, 60, 60, 60);
		
		
		d.setTitle("Care 24*7");
		d.setContentView(t);
		d.show();		
		
	}
});
b2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		t1.setText("All materials or health related informations on this application is provided for your information only and may not be construed as medical advice or instructions.No action or inaction should be taken based solely on the contents of the information in this application;instead,readers should consult appropriate health professionals on any matter relating to their health and well being. ");
		//t.setText("hello");
		t1.setPadding(60, 60, 60, 60);
		
		
		d1.setTitle("Disclaimer");
		d1.setContentView(t1);
		d1.show();	
	}
});
i4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i44=new Intent(Home.this,Smoke.class);
		startActivity(i44);
	}
});
i15.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent iee=new Intent(Home.this,Faq.class);
		startActivity(iee);
	}
});
i11.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent ie=new Intent(Home.this,Symptoms.class);
		startActivity(ie);
	}
});
i3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i3=new Intent(Home.this,Diabetes.class);
		startActivity(i3);
	}
});
i1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent iss=new Intent(Home.this,BMR.class);
		startActivity(iss);
	}
});
i5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i55=new Intent(Home.this,Stress.class);
		startActivity(i55);
	}
});
i10.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent ii=new Intent(Home.this,Calorie.class);
		startActivity(ii);
	}
});
i2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i21=new Intent(Home.this,BMI.class);
		startActivity(i21);
	}
});
i6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent i21=new Intent(Home.this,Malarm.class);
		startActivity(i21);
	}
		
	
});
i7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent i21=new Intent(Home.this,Walarm.class);
		startActivity(i21);
	}
		
	
});
i13.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent i21=new Intent(Home.this,Doctor.class);
		startActivity(i21);
	}
		
	
});
i9.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent i21=new Intent(Home.this,Exercise.class);
		startActivity(i21);
	}
		
	
});
i12.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent i21=new Intent(Home.this,Homerem.class);
		startActivity(i21);
	}
		
	
});
i8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent i21=new Intent(Home.this,heart.class);
		startActivity(i21);
	}
		
	
});
	 }
}
