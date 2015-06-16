package com.example.care_247;

import java.util.Calendar;
import java.util.Date;





import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Seta extends Activity {
	private TextView tvDisplayTime;
	AlertDialog levelDialog;
	Button b1,b2,b3,b4,b5;
	private int hour,day,month,dd,con,total;
	private int minute;
	String s1,s2,s3,s4,s5,s6;
	AlarmManager alarmManager;
	PendingIntent pi;
	long tt;
Date d;

	Wdatabase1 wd;
	AlertDialog.Builder builder;
	final CharSequence[] Qty = {"2 lt"};
	final CharSequence[] size = {"250 ml","500 ml"};
	final CharSequence[] gt = {"10 min","20 min","30 min","40 min","50 min","1 hour"};
	
	static final int TIME_DIALOG_ID = 999;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.seta);
	        
	        b1=(Button)findViewById(R.id.button1);
	        b2=(Button)findViewById(R.id.button2);
	        b3=(Button)findViewById(R.id.button3);
	        b4=(Button)findViewById(R.id.button4);
	        b5=(Button)findViewById(R.id.button5);
	        wd=new Wdatabase1(this);
	         d=new Date();
	         day=d.getDay();
	         month=d.getMonth()+1;
	 
	      
	        builder = new AlertDialog.Builder(this);
	        
	       
		
			b3.setOnClickListener(new View.OnClickListener() {
				
				@SuppressWarnings("deprecation")
				@Override
				public void onClick(View arg0) {
					showDialog(TIME_DIALOG_ID);
					
				}
			});
			
			b1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					builder.setTitle("Select The Quantity");
				    builder.setSingleChoiceItems(Qty, -1, new DialogInterface.OnClickListener() {
				        public void onClick(DialogInterface dialog, int item) 
				        {
				        	switch(item)
				        	{
				        	case 0:
				        		b1.setText(Qty[item]);
				        		break;
				        	case 1:
				        		b1.setText(Qty[item]);
				        		break;
				        	case 2:
				        		b1.setText(Qty[item]);
				        		break;
				        	}
				        	
				        	 levelDialog.dismiss();    
			            }
			        });
			        levelDialog = builder.create();
			        levelDialog.show();
			
		}
					
				
			});
	b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			builder.setTitle("Select The Size");
		    builder.setSingleChoiceItems(size, -1, new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int item) 
		        {
		        	switch(item)
		        	{
		        	case 0:
		        		b2.setText(size[item]);
		        		break;
		        	case 1:
		        		b2.setText(size[item]);
		        		break;
		        	
		        	}
		        	
		        	
		        	 levelDialog.dismiss();    
	            }
	        });
	        levelDialog = builder.create();
	        levelDialog.show();
			
			
		}
	});		
		
	b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			builder.setTitle("Select The Time");
		    builder.setSingleChoiceItems(gt, -1, new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int item) 
		        {
		        	
		        	switch(item)
		        	{
		        	case 0:
		        		b4.setText(gt[item]);
		        		tt=10;
		        		break;
		        	case 1:
		        		b4.setText(gt[item]);
		        		tt=20;
		        		break;
		        	case 2:
		        		b4.setText(gt[item]);
		        		tt=30;
		        		break;
		        	case 3:
		        		b4.setText(gt[item]);
		        		tt=40;
		        		break;
		        	case 4:
		        		b4.setText(gt[item]);
		        		tt=50;
		        		break;
		        	case 5:
		        		b4.setText(gt[item]);
		        		tt=60;
		        		break;
		        		
		        	}
		        	
		        	
		        	
		        	 levelDialog.dismiss();    
	            }
	        });
	        levelDialog = builder.create();
	        levelDialog.show();
			
		}
	});
			
	b5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			s1=b1.getText().toString();
			s2=b2.getText().toString();
			s3=b3.getText().toString();
			s4=b4.getText().toString();
		if(s1.equals("Quantity")|| s2.equals("size")||s3.equals("Time")|| s4.equals("G-Time"))	
		{
			Toast.makeText(getBaseContext(), "Please enter the correct values", Toast.LENGTH_LONG).show();
		}
		else if(s1.equals("2 lt") && s2.equals("250 ml"))
	    {
			wd.open();
			dd=wd.getday(month);
			wd.close();
			
			if(dd==0 )
			{
				wd.open();
				wd.addNew(month, day, 2, 0, 0, 0);
				wd.close();
				
				Intent i=new Intent(Seta.this,W2250.class);
				
				i.putExtra("hour", String.valueOf(hour));
				i.putExtra("mnt", String.valueOf(minute));
				i.putExtra("gtm",String.valueOf(tt) );
				//startActivity(i);
				 pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
				 alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
				 if(hour==0 || hour<12)
				 {
					s6="AM"; 
				 }
				 else if(hour==12)
				 {
					s6="PM"; 
				 }
				 else
				 {
					 s6="PM";
					 hour=hour-12;
				 }
				 
				 Calendar cal = Calendar.getInstance();
					cal.setTimeInMillis(System.currentTimeMillis());
					cal.set(Calendar.HOUR,hour);
					cal.set(Calendar.MINUTE, minute);
				cal.set(Calendar.SECOND, 00);
				if(s6.equals("AM"))
				cal.set(Calendar.AM_PM, Calendar.AM);
				else
					cal.set(Calendar.AM_PM, Calendar.PM);
					
					
				//alarmManager.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),pi);
				
				alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),tt*60*1000, pi);
			}
			else if(dd==day)
			{
				Toast.makeText(getBaseContext(), "Water alarm is already set for today", Toast.LENGTH_LONG).show();
			}
			
			else
			{
				
				
				
				wd.open();
				con=wd.getconsum(month);
				total=wd.gettotal(month);
				con=con+2;
				wd.updatealarm(month, day,con , 0, total, 0);
				wd.close();
				
				
				Intent i=new Intent(Seta.this,W2250.class);
				
				i.putExtra("hour", String.valueOf(hour));
				i.putExtra("mnt", String.valueOf(minute));
				i.putExtra("gtm",String.valueOf(tt) );
				//startActivity(i);
				 pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
				 alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
				 if(hour==0 || hour<12)
				 {
					s6="AM"; 
				 }
				 else if(hour==12)
				 {
					s6="PM"; 
				 }
				 else
				 {
					 s6="PM";
					 hour=hour-12;
				 }
				 
				 Calendar cal = Calendar.getInstance();
					cal.setTimeInMillis(System.currentTimeMillis());
					cal.set(Calendar.HOUR,hour);
					cal.set(Calendar.MINUTE, minute);
				cal.set(Calendar.SECOND, 00);
				if(s6.equals("AM"))
				cal.set(Calendar.AM_PM, Calendar.AM);
				else
					cal.set(Calendar.AM_PM, Calendar.PM);
					
					
			
				
				alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),tt*60*1000, pi);
			}
			
			
			
			
		}
		else if(s1.equals("2 lt") && s2.equals("500 ml"))
	    {
			//Toast.makeText(getBaseContext(), "" +s1 +"water with"+ s2 +" glasses", Toast.LENGTH_LONG).show();
			
			
			
			wd.open();
			dd=wd.getday(month);
			wd.close();
			
			if(dd==0 )
			{
				wd.open();
				wd.addNew(month, day, 2, 0, 0, 0);
				wd.close();
				
				Intent i=new Intent(Seta.this,W2500.class);
				
				i.putExtra("hour", String.valueOf(hour));
				i.putExtra("mnt", String.valueOf(minute));
				i.putExtra("gtm",String.valueOf(tt) );
				//startActivity(i);
				 pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
				 alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
				 if(hour==0 || hour<12)
				 {
					s6="AM"; 
				 }
				 else if(hour==12)
				 {
					s6="PM"; 
				 }
				 else
				 {
					 s6="PM";
					 hour=hour-12;
				 }
				 
				 Calendar cal = Calendar.getInstance();
					cal.setTimeInMillis(System.currentTimeMillis());
					cal.set(Calendar.HOUR,hour);
					cal.set(Calendar.MINUTE, minute);
				cal.set(Calendar.SECOND, 00);
				if(s6.equals("AM"))
				cal.set(Calendar.AM_PM, Calendar.AM);
				else
					cal.set(Calendar.AM_PM, Calendar.PM);
					
					
				//alarmManager.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),pi);
				
				alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),tt*60*1000, pi);
			}
			else if(dd==day)
			{
				Toast.makeText(getBaseContext(), "Water alarm is already set for today", Toast.LENGTH_LONG).show();
			}
			
			else
			{
				
				
				
				wd.open();
				con=wd.getconsum(month);
				total=wd.gettotal(month);
				con=con+2;
				wd.updatealarm(month, day,con , 0, total, 0);
				wd.close();
				
				
				Intent i=new Intent(Seta.this,W2500.class);
				
				i.putExtra("hour", String.valueOf(hour));
				i.putExtra("mnt", String.valueOf(minute));
				i.putExtra("gtm",String.valueOf(tt) );
				//startActivity(i);
				 pi=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
				 alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
				 if(hour==0 || hour<12)
				 {
					s6="AM"; 
				 }
				 else if(hour==12)
				 {
					s6="PM"; 
				 }
				 else
				 {
					 s6="PM";
					 hour=hour-12;
				 }
				 
				 Calendar cal = Calendar.getInstance();
					cal.setTimeInMillis(System.currentTimeMillis());
					cal.set(Calendar.HOUR,hour);
					cal.set(Calendar.MINUTE, minute);
				cal.set(Calendar.SECOND, 00);
				if(s6.equals("AM"))
				cal.set(Calendar.AM_PM, Calendar.AM);
				else
					cal.set(Calendar.AM_PM, Calendar.PM);
					
					
			
				
				alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),tt*60*1000, pi);
			}
			
			
			
		}
		
		else 
		{
			
		
		}
			
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
	 
			
				b3.setText(new StringBuilder().append(pad(hour))
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
