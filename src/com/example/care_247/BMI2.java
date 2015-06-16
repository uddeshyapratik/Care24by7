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

public class BMI2 extends ActionBarActivity {
	
Button b1,b2,b4,b6;
Button b3;
EditText e1,e2,e3;
Dialog d,d1;
TextView t,t1;
float w,ht;
int w1,ht1;
float pound,feet,bmi;

AlertDialog levelDialog;
AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.bm);
b1=(Button)findViewById(R.id.button1);
b2=(Button)findViewById(R.id.button2);
b3=(Button)findViewById(R.id.button3);
b4=(Button)findViewById(R.id.button4);
b6=(Button)findViewById(R.id.button6);
e1=(EditText)findViewById(R.id.editText1);
e2=(EditText)findViewById(R.id.editText2);
builder = new AlertDialog.Builder(this);
	 t=new TextView(this);
	 d=new Dialog(this);
	 t1=new TextView(this);
	 d1=new Dialog(this);
b1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent(BMI2.this,BMI.class);
		startActivity(i);
	}
});
b4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i4=new Intent(BMI2.this,Home.class);
		startActivity(i4);
	}
});
b2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent ii=new Intent(BMI2.this,BMI2.class);
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
		// TODO Aut	o-generated method stub
		 
			if(e1.getText().toString().equals("")||e2.getText().toString().equals("") )
			{
				Toast.makeText(BMI2.this, "Enter the values in the field first", Toast.LENGTH_LONG).show();
			}
			else
			{
				w=Float.parseFloat(e2.getText().toString());
				w1=(int) (w);
			       ht=Float.parseFloat(e1.getText().toString());
			       
			       
					feet=((ht)/100);
				
					bmi=((((float) ((w1/(feet*feet))))));
		
					
					if(ht>0&&ht<=220)
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
							Toast.makeText(BMI2.this, "Enter the correct value of weight first", Toast.LENGTH_LONG).show();
						}
					}
					else
					{
						Toast.makeText(BMI2.this, "Enter the correct value of height first", Toast.LENGTH_LONG).show();
					}
			}
	}
});
        
       


        
    }

}
