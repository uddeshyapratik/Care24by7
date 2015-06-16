package com.example.care_247;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Malarm  extends Activity{
	Button b1,b2;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.mla);
	        b1=(Button)findViewById(R.id.button1);
			b2=(Button)findViewById(R.id.button2);
			
			
			
			b1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Intent i=new Intent(Malarm.this,Madd.class);
					startActivity(i);
					
				}
			});
			
			b2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Intent i=new Intent(Malarm.this,Detail.class);
					startActivity(i);
					
				}
			});
	        
	        

}
}