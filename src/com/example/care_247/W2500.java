package com.example.care_247;

import java.util.Calendar;
import java.util.Date;







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
import android.widget.ImageView;

public class W2500 extends Activity {
	String s1,s2,s3,s4,s5;
	ImageView v1,v2,v3,v4,v5,v6,v7,v8;

	int h,m,gt,al,he,me,month,flag,hu,mu,h1,m1;
PendingIntent pi;
AlarmManager am;
Wdatabase1 wd;
Date d;
MediaPlayer mm;
	Calendar cal,c1,c2,c3,c4,c5,c6,c7,c8,c9;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.w2500);
	        v1=(ImageView)findViewById(R.id.imageView1);
	        v2=(ImageView)findViewById(R.id.imageView2);
	        v3=(ImageView)findViewById(R.id.imageView3);
	        v4=(ImageView)findViewById(R.id.imageView4);
	        mm=MediaPlayer.create(this, R.raw.kk);
	        mm.start();
	        am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
		      wd=new Wdatabase1(this);
		      d=new Date();
		      month=d.getMonth()+1;
		        Intent i=getIntent();
			       s1=i.getStringExtra("hour").toString();
				   s2=i.getStringExtra("mnt").toString();
				   s3=i.getStringExtra("gtm").toString();
				   
				   h=Integer.parseInt(s1);
				   m=Integer.parseInt(s2);
			       gt=Integer.parseInt(s3);
			       h1=h;
			       m1=m;
			       
			       al=h*60+m+gt*8;	
			   	he=al/60;
			   	me=al%60;   
			      
			       
			if(h==0 || h<12)
			{
				
				s4="AM";
			}
			
			else if(h==12)
			{
			s4="PM";	
			}
			else 
			{
				s4="PM";
				h=h-12;
			}
			
			if(he==0 || he<12)
			{
				
				s5="AM";
			}
			
			else if(he==12)
			{
			s5="PM";	
			}
			else 
			{
				s5="PM";
				he=he-12;
			}
		
		Intent k=new Intent(this,W2500.class);
		pi=PendingIntent.getActivity(getApplicationContext(), 0, k, 0);
		
		
			wd.open();
		flag=wd.getflag(month);
			wd.close();
			
			
			c9 = Calendar.getInstance();
			c9.setTimeInMillis(System.currentTimeMillis());
			c9.set(Calendar.HOUR,h);
			c9.set(Calendar.MINUTE, m);
			c9.set(Calendar.SECOND, 00);
			if(s4.equals("AM"))
			c9.set(Calendar.AM_PM,Calendar.AM);
			else
			c9.set(Calendar.AM_PM,Calendar.PM);
			
			
			hu=h1*60+m1+gt;
			mu=hu%60;
			hu=hu/60;
			if(hu==0 || hu<12)
			{
				
				s5="AM";
			}
			
			else if(hu==12)
			{
			s5="PM";	
			}
			else 
			{
				s5="PM";
				hu=hu-12;
			}
			
			
			
			
			c1 = Calendar.getInstance();
			c1.setTimeInMillis(System.currentTimeMillis());
			c1.set(Calendar.HOUR,hu);
			c1.set(Calendar.MINUTE, mu);
			c1.set(Calendar.SECOND, 00);
			if(s5.equals("AM"))
			c1.set(Calendar.AM_PM,Calendar.AM);
			else
				c1.set(Calendar.AM_PM,Calendar.PM);

			if(((System.currentTimeMillis())>=(c1.getTimeInMillis()))&& (flag==1||flag==2||flag==3||flag==4))
			{
			
				v1.setImageResource(R.drawable.pem);
				
				
			}
			hu=h1*60+m1+gt*2;
			mu=hu%60;
			hu=hu/60;
			if(hu==0 || hu<12)
			{
				
				s5="AM";
			}
			
			else if(hu==12)
			{
			s5="PM";	
			}
			else 
			{
				s5="PM";
				hu=hu-12;
			}
			
			
			
			
			c2 = Calendar.getInstance();
			c2.setTimeInMillis(System.currentTimeMillis());
			c2.set(Calendar.HOUR,hu);
			c2.set(Calendar.MINUTE, mu);
			c2.set(Calendar.SECOND, 00);
			if(s5.equals("AM"))
			c2.set(Calendar.AM_PM,Calendar.AM);
			else
				c2.set(Calendar.AM_PM,Calendar.PM);

			if(((System.currentTimeMillis())>=(c2.getTimeInMillis()))&& (flag==1||flag==2||flag==3||flag==4))
			{
			
				v2.setImageResource(R.drawable.pem);
				
				
			}
			
			hu=h1*60+m1+gt*3;
			mu=hu%60;
			hu=hu/60;
			if(hu==0 || hu<12)
			{
				
				s5="AM";
			}
			
			else if(hu==12)
			{
			s5="PM";	
			}
			else 
			{
				s5="PM";
				hu=hu-12;
			}
			
			
			
			
			c3 = Calendar.getInstance();
			c3.setTimeInMillis(System.currentTimeMillis());
			c3.set(Calendar.HOUR,hu);
			c3.set(Calendar.MINUTE, mu);
			c3.set(Calendar.SECOND, 00);
			if(s5.equals("AM"))
			c3.set(Calendar.AM_PM,Calendar.AM);
			else
				c3.set(Calendar.AM_PM,Calendar.PM);

			if(((System.currentTimeMillis())>=(c3.getTimeInMillis()))&& (flag==1||flag==2||flag==3||flag==4))
			{
			
				v3.setImageResource(R.drawable.pem);
				
				
			}
			
			hu=h1*60+m1+gt*4;
			mu=hu%60;
			hu=hu/60;
			if(hu==0 || hu<12)
			{
				
				s5="AM";
			}
			
			else if(hu==12)
			{
			s5="PM";	
			}
			else 
			{
				s5="PM";
				hu=hu-12;
			}
			
			
			
			
			c4 = Calendar.getInstance();
			c4.setTimeInMillis(System.currentTimeMillis());
			c4.set(Calendar.HOUR,hu);
			c4.set(Calendar.MINUTE, mu);
			c4.set(Calendar.SECOND, 00);
			if(s5.equals("AM"))
			c4.set(Calendar.AM_PM,Calendar.AM);
			else
				c4.set(Calendar.AM_PM,Calendar.PM);

			if(((System.currentTimeMillis())>=(c4.getTimeInMillis()))&&(flag==1||flag==2||flag==3||flag==4))
			{
			
				v4.setImageResource(R.drawable.pem);
				
				
			}
			
			v1.setOnClickListener(new View.OnClickListener() {
				
				
				@Override
				public void onClick(View arg0) {
					if(flag==0 && ((System.currentTimeMillis())<(c1.getTimeInMillis()))&& ((System.currentTimeMillis())>=(c9.getTimeInMillis())) )
					{
					
				wd.open();
				wd.updateflag(month, 1);
				wd.close();
				v1.setImageResource(R.drawable.pem);
			mm.stop();
				
			
				
				}
				}
			});
			

	          v2.setOnClickListener(new View.OnClickListener() {
				
				
				@Override
				public void onClick(View arg0) {
					if(flag==1 && ((System.currentTimeMillis())<(c2.getTimeInMillis()))&& ((System.currentTimeMillis())>=(c1.getTimeInMillis())) )
					{
					
				wd.open();
				wd.updateflag(month, 2);
				wd.close();
				v2.setImageResource(R.drawable.pem);
				mm.stop();
			
				
				}
				}
			});
	          
	          v3.setOnClickListener(new View.OnClickListener() {
	  			
	  			
	  			@Override
	  			public void onClick(View arg0) {
	  				if(flag==2 && ((System.currentTimeMillis())<(c3.getTimeInMillis()))&& ((System.currentTimeMillis())>=(c2.getTimeInMillis())) )
	  				{
	  				
	  			wd.open();
	  			wd.updateflag(month, 3);
	  			wd.close();
	  			v3.setImageResource(R.drawable.pem);
	  			mm.stop();
	  			}
	  			}
	  		});
	          
	          v4.setOnClickListener(new View.OnClickListener() {
	  			
	  			
	  			@Override
	  			public void onClick(View arg0) {
	  				if(flag==3 && ((System.currentTimeMillis())<(c4.getTimeInMillis()))&& ((System.currentTimeMillis())>=(c3.getTimeInMillis())) )
	  				{
	  				
	  			wd.open();
	  			wd.updateflag(month, 4);
	  			wd.close();
	  			v4.setImageResource(R.drawable.pem);
	  			am.cancel(pi);
	  			mm.stop();
	  			
	  			}
	  			}
	  		});
	        

	

}
}