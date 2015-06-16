package com.example.care_247;




import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public class Mess extends Activity {
	NotificationManager nm;
	static final int nt=1254635;
	
	@SuppressWarnings("deprecation")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	   setContentView(R.layout.fragment_main);
	
	   
	   
		
		nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
		
		Intent i=new Intent(this,MainActivity.class);
		PendingIntent pi= PendingIntent.getActivity(this, 0, i, 0);
		String body="Research suggests that people with mild eczema who drink oolong tea three times a day may show improvement in itching and other symptoms. Compounds in the tea called polyphenols appear to be responsible.";
		String title="Today's Health tip";
		Notification n=new Notification(R.drawable.ic_launcher, body,System.currentTimeMillis());
		n.setLatestEventInfo(this, title, body, pi);
		n.defaults=Notification.DEFAULT_ALL;
		nm.notify(nt,n);
		finish();
		
		
	   
	   
	   
	   
	   
	   
	   
	
	
	}

	

}
