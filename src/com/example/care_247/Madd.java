package com.example.care_247;

import java.util.Calendar;



import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class Madd extends Activity {
	TextView tvDisplayTime;
	AlertDialog levelDialog;
	 int hour,minute;
	 Button b1,b2;
	 String s1,s2,s3,s4;
	 EditText e;
	 Wdatabase wd;
	 AlarmManager alarmManager;
		PendingIntent pi;
		Calendar c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	
		String s,sd;
	 static final int TIME_DIALOG_ID = 999;

		AlertDialog.Builder builder;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.madd);
        
        b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		e=(EditText)findViewById(R.id.editText1);
		   builder = new AlertDialog.Builder(this);
		   wd=new Wdatabase(this);
		   
		   
		   
		   
		   
		   
		   
		  
		   
		   b1.setOnClickListener(new View.OnClickListener() {
				
				@SuppressWarnings("deprecation")
				@Override
				public void onClick(View arg0) {
					showDialog(TIME_DIALOG_ID);
					
				}
			});
		   b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				s1=e.getText().toString();
				s2=b1.getText().toString();
				s3="medicine name="+s1+"---Time is"+s2;
				 if(hour==0 || hour<12)
				 {
					s4="AM"; 
				 }
				 else if(hour==12)
				 {
					s4="PM"; 
				 }
				 else
				 {
					 s4="PM";
					 hour=hour-12;
				 }
				
				
				wd.open();
				wd.addNew(s3,hour,minute,s4);
				wd.close();
				
				 Intent i=new Intent(Madd.this,Rang.class);
				 pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
				 alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
				
				 wd.open();
				hour= wd.hour(1);
				minute=wd.minute(1);
				s=wd.getday(1).toString();
				sd=wd.getdetail(1).toString();
				wd.close();
				//i.putExtra("mdtail", sd);
			//Toast.makeText(getBaseContext(), ""+hour +"and"+minute+s, Toast.LENGTH_LONG).show();	
				 Calendar c1 = Calendar.getInstance();
					c1.setTimeInMillis(System.currentTimeMillis());
					c1.set(Calendar.HOUR,hour);
					c1.set(Calendar.MINUTE, minute);
				c1.set(Calendar.SECOND, 00);
				if(s.equals("AM"))
				c1.set(Calendar.AM_PM, Calendar.AM);
				else
					c1.set(Calendar.AM_PM, Calendar.PM);
					
			
			
				
				alarmManager.set(AlarmManager.RTC_WAKEUP, c1.getTimeInMillis(), pi);
				
				
				
				
				
				
				

				
				Intent ii=new Intent(Madd.this,Detail.class);
				startActivity(ii);
				
			}
		});

		   
}
	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case TIME_DIALOG_ID:
			
			return new TimePickerDialog(this, 
                                        timePickerListener, hour, minute,false);
 
		}
		return null;
	}
 
	private TimePickerDialog.OnTimeSetListener timePickerListener = 
            new TimePickerDialog.OnTimeSetListener() {
		public void onTimeSet(TimePicker view, int selectedHour,
				int selectedMinute) {
			hour = selectedHour;
			minute = selectedMinute;
 
		
			b1.setText(new StringBuilder().append(pad(hour))
					.append(":").append(pad(minute)));
 
			
 
		}
	};
 
		
	
	
		private static String pad(int c) {
			if (c >= 10)
			   return String.valueOf(c);
			else
			   return "0" + String.valueOf(c);
		}

}
