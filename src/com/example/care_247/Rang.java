package com.example.care_247;

import java.util.Calendar;


import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Rang  extends Activity{
	TextView t1;
	AlarmManager alarmManager,am2;
	PendingIntent pi;
	Calendar c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	int hour,minute,h1,m1;
	String s,s1;
	Button b;
	MediaPlayer mp;
	
	
	Wdatabase wd;
	
	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.rang);
	        b=(Button)findViewById(R.id.button1);
			t1=(TextView)findViewById(R.id.textView1);
			t1.setText("Please take your medicine ");
			wd=new Wdatabase(this);
			mp=MediaPlayer.create(this, R.raw.kk);
			
			mp.start();
			
			
			Intent i=new Intent(Rang.this,Rang.class);
			 pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
			 alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
			 am2 = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
				t1.setText("Please take your medicine ");
			 wd.open();
			hour= wd.hour(2);
			minute=wd.minute(2);
			s=wd.getday(2).toString();
			s1=wd.getdetail(2).toString();
			wd.close();
			 
			
			 Calendar c2 = Calendar.getInstance();
				c2.setTimeInMillis(System.currentTimeMillis());
				c2.set(Calendar.HOUR,hour);
				c2.set(Calendar.MINUTE, minute);
			c2.set(Calendar.SECOND, 00);
			if(s.equals("AM"))
			c2.set(Calendar.AM_PM, Calendar.AM);
			else
				c2.set(Calendar.AM_PM, Calendar.PM);
				
			
		
			
			alarmManager.set(AlarmManager.RTC_WAKEUP, c2.getTimeInMillis(), pi);
			
			
			wd.open();
		h1= wd.hour(3);
			m1=wd.minute(3);
			s=wd.getday(3).toString();
			s1=wd.getdetail(3).toString();
			wd.close();
			 
			
			 Calendar c3 = Calendar.getInstance();
				c3.setTimeInMillis(System.currentTimeMillis());
				c3.set(Calendar.HOUR,h1);
				c3.set(Calendar.MINUTE, m1);
			c3.set(Calendar.SECOND, 00);
			if(s.equals("AM"))
			c3.set(Calendar.AM_PM, Calendar.AM);
			else
				c3.set(Calendar.AM_PM, Calendar.PM);
				
			
		
			
			am2.set(AlarmManager.RTC_WAKEUP, c3.getTimeInMillis(), pi);
			b.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
			
					mp.stop();
				}
			});
			
			
			

			


	

}
}