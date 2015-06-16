package com.example.care_247;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Walarm  extends Activity{
	ImageView i1,i2;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.walarm);
	        i2=(ImageView)findViewById(R.id.imageView2);
	        i1=(ImageView)findViewById(R.id.imageView1);
	          i1.setOnClickListener(new View.OnClickListener() {
	  			
	  			@Override
	  			public void onClick(View arg0) {
	  				Intent i=new Intent(Walarm.this,Seta.class);
	  				startActivity(i);
	  				
	  			}
	  		});

	          
	      }
	
	

}
