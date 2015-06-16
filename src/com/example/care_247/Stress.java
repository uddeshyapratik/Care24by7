package com.example.care_247;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Stress extends  Activity {

	RadioGroup r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16;
	int i[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int j[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int sum=0;
	
	TextView t18;
	
	String s[]={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12,rb13,rb14,rb15,rb16;
Button b1,b2,b3;
Dialog d;
TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.stress);
		r1=(RadioGroup)findViewById(R.id.radioGroup1);
		r2=(RadioGroup)findViewById(R.id.radioGroup2);
		r3=(RadioGroup)findViewById(R.id.radioGroup3);
		r4=(RadioGroup)findViewById(R.id.radioGroup4);
		r5=(RadioGroup)findViewById(R.id.radioGroup5);
		r6=(RadioGroup)findViewById(R.id.radioGroup6);
		r7=(RadioGroup)findViewById(R.id.radioGroup7);
		r8=(RadioGroup)findViewById(R.id.radioGroup8);
		r9=(RadioGroup)findViewById(R.id.radioGroup9);
		r10=(RadioGroup)findViewById(R.id.radioGroup10);
		r11=(RadioGroup)findViewById(R.id.radioGroup11);
		r12=(RadioGroup)findViewById(R.id.radioGroup12);
		r13=(RadioGroup)findViewById(R.id.radioGroup13);
		r14=(RadioGroup)findViewById(R.id.radioGroup14);
		r15=(RadioGroup)findViewById(R.id.radioGroup15);
		r16=(RadioGroup)findViewById(R.id.radioGroup16);
		t18=(TextView)findViewById(R.id.textView18);
		d=new Dialog(this);
		tv=new TextView(this);

		final Vibrator v=(Vibrator)this.getSystemService(Context.VIBRATOR_SERVICE);
		
		b1=(Button)findViewById(R.id.btn1);
		b2=(Button)findViewById(R.id.button1);
		b3=(Button)findViewById(R.id.button3);
t18.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			Intent intent=new Intent(Stress.this,Home.class);
			startActivity(intent);
				
			}
		});
		
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			Intent intent=new Intent(Stress.this,Stress.class);
			startActivity(intent);
				
			}
		});
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
			
				i[0]=r1.getCheckedRadioButtonId();
				 rb1=(RadioButton)r1.findViewById(i[0]);
				 s[15]=rb1.getText().toString();
			
				 
				 i[1]=r2.getCheckedRadioButtonId();
				 rb2=(RadioButton)r2.findViewById(i[1]);
				 s[10]=rb2.getText().toString();
				 
				 i[2]=r3.getCheckedRadioButtonId();
				 rb3=(RadioButton)r3.findViewById(i[2]);
				 s[0]=rb3.getText().toString();
				 
				 i[3]=r4.getCheckedRadioButtonId();
				 rb4=(RadioButton)r4.findViewById(i[3]);
				 s[1]=rb4.getText().toString();
				 
				 i[4]=r5.getCheckedRadioButtonId();
				 rb5=(RadioButton)r5.findViewById(i[4]);
				 s[11]=rb5.getText().toString();
				 
				 i[5]=r6.getCheckedRadioButtonId();
				 rb6=(RadioButton)r6.findViewById(i[5]);
				 s[2]=rb6.getText().toString();
				 
				 i[6]=r7.getCheckedRadioButtonId();
				 rb7=(RadioButton)r7.findViewById(i[6]);
				 s[12]=rb7.getText().toString();
				 
				 i[7]=r8.getCheckedRadioButtonId();
				 rb8=(RadioButton)r8.findViewById(i[7]);
				 s[3]=rb8.getText().toString();
				 
				 i[8]=r9.getCheckedRadioButtonId();
				 rb9=(RadioButton)r9.findViewById(i[8]);
				 s[13]=rb9.getText().toString();
				 
				 i[9]=r10.getCheckedRadioButtonId();
				 rb10=(RadioButton)r10.findViewById(i[9]);
				 s[4]=rb10.getText().toString();
				 
				 i[10]=r11.getCheckedRadioButtonId();
				 rb11=(RadioButton)r11.findViewById(i[10]);
				 s[5]=rb11.getText().toString();
				 
				 i[11]=r12.getCheckedRadioButtonId();
				 rb12=(RadioButton)r12.findViewById(i[11]);
				 s[6]=rb12.getText().toString();
				 
				 i[12]=r13.getCheckedRadioButtonId();
				 rb13=(RadioButton)r13.findViewById(i[12]);
				 s[7]=rb13.getText().toString();
				 
				 i[13]=r14.getCheckedRadioButtonId();
				 rb14=(RadioButton)r14.findViewById(i[13]);
				 s[8]=rb14.getText().toString();
				 
				 i[14]=r15.getCheckedRadioButtonId();
				 rb15=(RadioButton)r15.findViewById(i[14]);
				 s[14]=rb15.getText().toString();
				 
				 i[15]=r16.getCheckedRadioButtonId();
				 rb16=(RadioButton)r16.findViewById(i[15]);
				 s[9]=rb16.getText().toString();
				 
				 
				 for(int k=0;k<10;k++)
				 {
					 if(s[k].equals("Yes"))
				    {
						 j[k]=3;
					 }
					  if(s[k].equals("No"))
					 {
						 j[k]=1;
					 }
					if(s[k].equals("Sometimes"))
					 {
						 j[k]=2;
					 }
				 }
				for(int l=10;l<15;l++)
				{
					 if(s[l].equals("Yes"))
					 {
						 j[l]=1;
					 }
					 if(s[l].equals("No"))
					 {
						 j[l]=3;
					 }
					 if(s[l].equals("Sometimes"))
					 {
						 j[l]=2;
					 }
				}
				
				 if(s[15].equals("Yes")||s[15].equals("No"))
				{
					j[15]=3;
				}
				 if(s[15].equals("Sometimes"))
				{
					j[15]=2;
				}
				
				for(int k=0;k<=15;k++)
				{
					sum=sum+j[k];
				}
				if(sum>32 && sum<=48)
				{
					d.setTitle("Result");
					tv.setText("Your Stress test score is "+sum+"\n"+"You are moderately stressed(33-48). Brighten up!you are too blue "+"\n"+" you must be careful to take situation and comments from others in your stride.In some situations It is advisable for you to calm down so that you may optimize what you do and how you behave with others"+"\n"+"you may be at risk of depression,if you do not adopt a positive attitude towards life.Generally of a happy nature,you must make a concious choice not to become upset or find a good outlet for every day complaints ");
					tv.setPadding(15, 5, 5, 5);
					d.setContentView(tv);
					d.show();
					v.vibrate(5000);
					
				}
				 if(sum>=16 && sum<=32)
				 {
					
					 d.setTitle("Result");
						tv.setText("Your Stress test score is "+sum+"\n"+"You are moderately stressed(16-32) some days are blue!"+"\n"+" you must be careful to take situation and comments from others in your stride.In some situations It is advisable for you to calm down so that you may optimize what you do and how you behave with others"+"\n"+"you are not at risk of depression,but need to cope better with sudden changes in your current scenario");
						tv.setPadding(15, 5, 5, 5);
						d.setContentView(tv);
						d.show();
					 v.vibrate(2000);
					
						
					 
				 }
			
				
				
				
		   sum=0;
			}
		});
		
	b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			 d.setTitle("Leave stress Live long");
				tv.setText("Life can often bog you down.Every day starts with a number of things to do,places to go,ways to act and react and people to intract with.Every one has their own way of dealing with multiple demands on their time. Stress can result from trying to manage your time in the best way possible,keeping cordial relationship with all,while meeting you your own needs and aspirations.This is a challenge in todays past-paced life ");
				tv.setPadding(15, 5, 5, 5);
				d.setContentView(tv);
				d.show();
			
			
			
		}
	});
	
		 
		
		
		
}
}
