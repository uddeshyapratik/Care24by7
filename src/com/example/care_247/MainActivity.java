package com.example.care_247;

import java.util.Calendar;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {
	ImageView i;
	NotificationManager nm;
	Calendar cal;
	static final int nt=1254635;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(nt);
		
				Intent ii=new Intent(this,Mess.class);
				
			PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, ii, 0);
			 AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
			 
			 cal=Calendar.getInstance();
				cal.setTimeInMillis(System.currentTimeMillis());
				cal.set(Calendar.HOUR,10);
				cal.set(Calendar.MINUTE, 00);
				cal.set(Calendar.AM_PM,Calendar.AM);
			 alarmManager.set(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis() , pi);

       i=(ImageView)findViewById(R.id.imageView4);
       Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
       i.startAnimation(animation);
       
       i.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		
			Intent i1=new Intent(MainActivity.this,Home.class);
			startActivity(i1);
		}
	});

      

  
    }

}
