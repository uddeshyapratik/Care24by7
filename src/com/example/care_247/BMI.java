package com.example.care_247;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI extends ActionBarActivity {
	Button b1,b2,b3,b4,b6;
	EditText e1,e2,e3;
	Dialog d,d1;
	TextView t,t1;
	float w;
	int w1,ht,ht1;
	float pound,feet,bmi;
	
	AlertDialog levelDialog;
	AlertDialog.Builder builder;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.bmihome);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b6=(Button)findViewById(R.id.button6);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
      
        
        
        builder = new AlertDialog.Builder(this);
   	 t=new TextView(this);
   	 d=new Dialog(this);
   	 t1=new TextView(this);
   	 d1=new Dialog(this);
 
 b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(BMI.this,BMI.class);
				startActivity(i);
			}
		});
 b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent is=new Intent(BMI.this,Home.class);
			startActivity(is);
		}
	});
 b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(BMI.this,BMI2.class);
				startActivity(ii);
			}
		});
 b6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			t.setText("BMI-Body Mass Index is a number calculated from weight and height of a person.BMI is a fairly reliable indicator of body fatness for most people.BMI has been recommended for evaluating overweight and obesity in children and adolescents");
			//t.setText("hello");
			t.setPadding(60, 60, 60, 60);
			
			
			d.setTitle("BMI");
			d.setContentView(t);
			d.show();		
			
		}
	});
 b3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		 
			if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||e3.getText().toString().equals("") )
			{
				Toast.makeText(BMI.this, "Enter the values in the field first", Toast.LENGTH_LONG).show();
			}
			else
			{
				w=Float.parseFloat(e2.getText().toString());
				w1=(int) (w);
			       ht=Integer.parseInt(e1.getText().toString());
			       ht1=Integer.parseInt(e3.getText().toString());
			       pound=(float) ((w*0.4536)/1000);
					feet=(float) (((int)12*2.54*ht+ht1*2.54)/100);
					bmi=((((float) ((pound/(feet*feet))*1000))));
					if(ht>0&&ht<=7 && ht1>0&&ht1<=11)
					{
						if(w1>0&&w1<=200)
						{
							if(bmi>0&&bmi<=18.5)
							{
								t1.setText("You BMI value is "+bmi+".You are in category of underweight.");
								//t.setText("hello");
								t1.setPadding(60, 60, 60, 60);
								
								
								d1.setTitle("BMI value ");
								d1.setContentView(t1);
								d1.show();		
							}
							else if(bmi>18.5 && bmi<=24.9)
							{
								t1.setText("You BMI value is "+bmi+".Your weight is normal.");
								//t.setText("hello");
								t1.setPadding(60, 60, 60, 60);
								
								
								d1.setTitle("BMI value ");
								d1.setContentView(t1);
								d1.show();	
							}
							else if(bmi>24.5 && bmi<=29.9)
							{
								t1.setText("You BMI value is "+bmi+".You are overweight,please do exercise and other activities to maintain your BMI level. ");
								//t.setText("hello");
								t1.setPadding(60, 60, 60, 60);
								
								
								d1.setTitle("BMI value ");
								d1.setContentView(t1);
								d1.show();	
							}
							else
							{
								t1.setText("You BMI value is "+bmi+".You are obese,please do exercise and other activities to maintain your BMI level.");
								//t.setText("hello");
								t1.setPadding(60, 60, 60, 60);
								
								
								d1.setTitle("BMI value ");
								d1.setContentView(t1);
								d1.show();
							}
							
						}
						else
						{
							Toast.makeText(BMI.this, "Enter the correct value of weight first", Toast.LENGTH_LONG).show();
						}
					}
					else
					{
						Toast.makeText(BMI.this, "Enter the correct value of height first", Toast.LENGTH_LONG).show();
					}
			}
	}
});
        
       
        
        

        
    }

}
