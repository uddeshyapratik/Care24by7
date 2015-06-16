package com.example.care_247;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Detail extends Activity {
	String s1,s2;
	Button b,b2;
	TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	Wdatabase wd;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.detailr);
	        t1=(TextView)findViewById(R.id.textView1);
			t2=(TextView)findViewById(R.id.textView2);
			t3=(TextView)findViewById(R.id.textView3);
			t4=(TextView)findViewById(R.id.textView4);
			t5=(TextView)findViewById(R.id.textView5);
			t6=(TextView)findViewById(R.id.textView6);
			t7=(TextView)findViewById(R.id.textView7);
			t8=(TextView)findViewById(R.id.textView8);
			t9=(TextView)findViewById(R.id.textView9);
			t10=(TextView)findViewById(R.id.textView10);
			b=(Button)findViewById(R.id.button1);
			b2=(Button)findViewById(R.id.button2);
			wd=new Wdatabase(this);
			wd.open();
	         s2	=	wd.getdetail(1);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t1.setText(s2);
	         }
			
	         s2	=	wd.getdetail(2);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t2.setText(s2);
	         }
	         s2	=	wd.getdetail(3);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t3.setText(s2);
	         }
	        s2	=	wd.getdetail(4);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t4.setText(s2);
	         }
	         s2	=	wd.getdetail(5);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t5.setText(s2);
	         }
	         s2	=	wd.getdetail(6);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t6.setText(s2);
	         }
	        s2	=	wd.getdetail(7);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t7.setText(s2);
	         }
	         s2	=	wd.getdetail(8);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t8.setText(s2);
	         }
	        s2	=	wd.getdetail(9);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t9.setText(s2);
	         }
	         s2	=	wd.getdetail(10);
	         if(s2.equals("no data"))
	         {
	        	 
	         }
	         else
	         {
	        	 t10.setText(s2);
	         }
			wd.close();
			
					b2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
			Intent i=new Intent(Detail.this,Madd.class);
			startActivity(i);
					
				}
			});
	         

					
			
			b.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					Intent i=new Intent(Detail.this,MainActivity.class);
					startActivity(i);
				}
			});
			
			
	        

}
}