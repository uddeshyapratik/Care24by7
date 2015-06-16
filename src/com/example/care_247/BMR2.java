package com.example.care_247;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BMR2 extends ActionBarActivity {
	int age,wt,in,ft,bmr,bmr1,bmr2,bmr3,bmr4,bmr5;
	double pound,feet,wet;
	public RadioGroup rgGender;
	int bmrr,bmr11,bmr22,bmr33,bmr44,bmr55;	
	int fet;
	
	EditText e1,e2,e3,e4;
	Button b1,b2,b3,b4,b5,b6;
	//String s;
	//String s1;
	TextView t1,t2,t3,t4;
	RadioButton radioBtn1;
	RadioGroup radioGroupWebsite;
	Dialog d,d1;
	TextView t,tt;
	AlertDialog levelDialog;
	AlertDialog.Builder builder;
	final CharSequence[] items = {" Basal Metabolic Rate(BMR)","Sedentary-little or no exercise","Lightly-exercise/sports 1-3 times/week","Moderately-exercise/sports 3-5/week","Very Active-hard exercise/sports 6-7 times/week","Extra Active-very hard exercise/sports or physical job"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.bmr2);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		b6=(Button)findViewById(R.id.button6);
	    e1=(EditText)findViewById(R.id.editText1);
	    e2=(EditText)findViewById(R.id.editText2);
	    e3=(EditText)findViewById(R.id.editText3);
	    t1=(TextView)findViewById(R.id.textView1);
	    t2=(TextView)findViewById(R.id.textView2);
	    t3=(TextView)findViewById(R.id.textView3);
	    t4=(TextView)findViewById(R.id.textView4);
	    rgGender = (RadioGroup) findViewById(R.id.radiosex);
	    builder = new AlertDialog.Builder(this);
	    t=new TextView(this);
		 d=new Dialog(this);
		 tt=new TextView(this);
		 d1=new Dialog(this);
		radioGroupWebsite = (RadioGroup) findViewById(R.id.radiosex);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(),BMR.class);
	            startActivity(i);
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(getApplicationContext(),BMR2.class);
	            startActivity(i1);
				
			}
		});
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				t.setText("The Calorie Calculator can be used to estimate the calories you need to consume.It is based on the Mifflin-st jeor equation.You can estimate the calories available in food from the nutrient calculator. ");
				//t.setText("hello");
				t.setPadding(60, 60, 60, 60);
				
				
				d.setTitle("Nutrient Content");
				d.setContentView(t);
				d.show();		
			}
		});
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//int selected = radioGroupWebsite.getCheckedRadioButtonId();
			//	radioBtn1 = (RadioButton) findViewById(selected);
			//	Toast.makeText(BMR2.this,radioBtn1.getText(), Toast.LENGTH_SHORT).show(); 
				Intent i1q=new Intent(getApplicationContext(),Home.class);
	            startActivity(i1q);
				
			}
		});	
		
b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				builder.setTitle("Select the activity");
		        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int item) {
		           
		            
		            switch(item)
		            {
		                case 0:
		                  b3.setText("Basal Metabolic Rate(BMR)");
		                         break;
		                case 1:
		                        // Your code when 2nd  option seletced
		                	b3.setText("Sedentary-little or no exercise");
		                        break;
		                case 2:
		                       // Your code when 3rd option seletced
		                	   b3.setText("Lightly");
		                        break;
		                case 3:
		                         // Your code when 4th  option seletced    
		                	 b3.setText("Moderately");
		                        break;
		                case 4:
		                	 b3.setText("Very Active");
		                	break;
		                case 5:
		                	 b3.setText("Extra Active");
		                	break;
		                
		            }
		            levelDialog.dismiss();    
		            }
		        });
		        levelDialog = builder.create();
		        levelDialog.show();



			}
		});

b4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||e3.getText().toString().equals("") )
		{
			Toast.makeText(BMR2.this, "Enter the values in the field first", Toast.LENGTH_LONG).show();
		}
		else
		{
		
		age=Integer.parseInt(e1.getText().toString());
		wet=Double.parseDouble(e2.getText().toString());
		fet=Integer.parseInt(e3.getText().toString());
		int selected = rgGender.getCheckedRadioButtonId();
		radioBtn1 = (RadioButton) findViewById(selected);
		String s,s3,s4,s5,s6,s7,s8,s9,s10,ss1;
		s3="Male";
		s4="ACTIVITY";
		s5="Basal Metabolic Rate(BMR)";
		s6="Sedentary-little or no exercise";
		s7="Lightly";
		s8="Moderately";
		s9="Very Active";
		s10="Extra Active";
		s=radioBtn1.getText().toString();
		ss1=b3.getText().toString();
		bmr=(int)(10*wet+6.25*fet-5*age+5);
		bmr1=(int)(bmr*1.2);
		bmr2=(int)(bmr*1.375);
		bmr3=(int)(bmr*1.55);
		bmr4=(int)(bmr*1.725);
		bmr5=(int)(bmr*1.90);
	   
		//for female
	   bmrr=(int)(10*wet+6.25*fet-5*age-161);
		bmr11=(int)(bmrr*1.2);
		bmr22=(int)(bmrr*1.375);
		bmr33=(int)(bmrr*1.55);
		bmr44=(int)(bmrr*1.725);
		bmr55=(int)(bmrr*1.90);
		if(age>0 && age<=100)
		{
			
			if(wet>0.00 && wet<=200.00)
			{
				//Toast.makeText(BMR2.this, ""+wet, Toast.LENGTH_LONG).show();
				if(fet>0 && fet<300)
				{
					if(s.equals(s3))
					{
						
					//	Toast.makeText(MainActivity.this, "gents first"+feet, Toast.LENGTH_LONG).show();
					if(s4.equals(ss1))
					{
						Toast.makeText(BMR2.this, "Select the activity first!!", Toast.LENGTH_LONG).show();
					}
					else if(s5.equals(ss1))
					{
						//Toast.makeText(MainActivity.this, "BMR", Toast.LENGTH_LONG).show();
						
						//Toast.makeText(MainActivity.this, "BMR "+bmr, Toast.LENGTH_LONG).show();
						tt.setText("You required "+bmr+" Calories/day to maintain your weight");
						//t.setText("hello");
						tt.setPadding(60, 60, 60, 60);
						
						
						d1.setTitle("Calories required ");
						d1.setContentView(tt);
						d1.show();		
					}
					else if(s6.equals(ss1))
					{
					//	Toast.makeText(MainActivity.this, "BMR works", Toast.LENGTH_LONG).show();
						 
						//Toast.makeText(MainActivity.this, "BMR "+bmr1, Toast.LENGTH_LONG).show();
						tt.setText("You required "+bmr1+" Calories/day to maintain your weight");
					//	t.setText("hello");
						tt.setPadding(60, 60, 60, 60);
						
						
						d1.setTitle("Calories required ");
						d1.setContentView(tt);
						d1.show();		
					}
					else if(s7.equals(ss1))
					{
						tt.setText("You required "+bmr2+" Calories/day to maintain your weight");
						//	t.setText("hello");
							tt.setPadding(60, 60, 60, 60);
							
							
							d1.setTitle("Calories required ");
							d1.setContentView(tt);
							d1.show();	
					}
					else if(s8.equals(ss1))
					{
						tt.setText("You required "+bmr3+" Calories/day to maintain your weight");
						//	t.setText("hello");
							tt.setPadding(60, 60, 60, 60);
							
							
							d1.setTitle("Calories required ");
							d1.setContentView(tt);
							d1.show();	
					}
					else if(s9.equals(ss1))
					{
						tt.setText("You required "+bmr4+" Calories/day to maintain your weight");
						//	t.setText("hello");
							tt.setPadding(60, 60, 60, 60);
							
							
							d1.setTitle("Calories required ");
							d1.setContentView(tt);
							d1.show();	
					}
					
					
					
					
					else if(s10.equals(ss1))
					{
						tt.setText("You required "+bmr5+" Calories/day to maintain your weight");
						//	t.setText("hello");
							tt.setPadding(60, 60, 60, 60);
							
							
							d1.setTitle("Calories required ");
							d1.setContentView(tt);
							d1.show();	
					}
				//	Toast.makeText(BMR2.this,""+s, Toast.LENGTH_LONG).show();
				}
					else
					{
					//	Toast.makeText(MainActivity.this, "Ladies first", Toast.LENGTH_LONG).show();
//						Toast.makeText(MainActivity.this, "gents first"+feet, Toast.LENGTH_LONG).show();
						if(s4.equals(ss1))
						{
							Toast.makeText(BMR2.this, "Select the activity first!!", Toast.LENGTH_LONG).show();
						}
						else if(s5.equals(ss1))
						{
							//Toast.makeText(MainActivity.this, "BMR", Toast.LENGTH_LONG).show();
							
							//Toast.makeText(MainActivity.this, "BMR "+bmr, Toast.LENGTH_LONG).show();
							tt.setText("You required "+bmrr+" Calories/day to maintain your weight");
							//t.setText("hello");
							tt.setPadding(60, 60, 60, 60);
							
							
							d1.setTitle("Calories required ");
							d1.setContentView(tt);
							d1.show();		
						}
						else if(s6.equals(ss1))
						{
						//	Toast.makeText(MainActivity.this, "BMR works", Toast.LENGTH_LONG).show();
							 
							//Toast.makeText(MainActivity.this, "BMR "+bmr1, Toast.LENGTH_LONG).show();
							tt.setText("You required "+bmr11+" Calories/day to maintain your weight");
						//	t.setText("hello");
							tt.setPadding(60, 60, 60, 60);
							
							
							d1.setTitle("Calories required ");
							d1.setContentView(tt);
							d1.show();		
						}
						else if(s7.equals(ss1))
						{
							tt.setText("You required "+bmr22+" Calories/day to maintain your weight");
							//	t.setText("hello");
								tt.setPadding(60, 60, 60, 60);
								
								
								d1.setTitle("Calories required ");
								d1.setContentView(tt);
								d1.show();	
						}
						else if(s8.equals(ss1))
						{
							tt.setText("You required "+bmr33+" Calories/day to maintain your weight");
							//	t.setText("hello");
								tt.setPadding(60, 60, 60, 60);
								
								
								d1.setTitle("Calories required ");
								d1.setContentView(tt);
								d1.show();	
						}
						else if(s9.equals(ss1))
						{
							tt.setText("You required "+bmr44+" Calories/day to maintain your weight");
							//	t.setText("hello");
								tt.setPadding(60, 60, 60, 60);
								
								
								d1.setTitle("Calories required ");
								d1.setContentView(tt);
								d1.show();	
						}
						else if(s10.equals(ss1))
						{
							tt.setText("You required "+bmr55+" Calories/day to maintain your weight");
							//	t.setText("hello");
								tt.setPadding(60, 60, 60, 60);
								
								
								d1.setTitle("Calories required ");
								d1.setContentView(tt);
								d1.show();	
					}
					}
				}
				
				else
				{
					Toast.makeText(BMR2.this, "Please enter valid height", Toast.LENGTH_LONG).show();
				}
			}
			else
			{
				Toast.makeText(BMR2.this, "Please enter valid weight", Toast.LENGTH_LONG).show();
			}
		}
		
		else
		{
			Toast.makeText(BMR2.this, "Please enter valid age between 0-100", Toast.LENGTH_LONG).show();
		}
		
		
	}}
});

    
	}
	
}


