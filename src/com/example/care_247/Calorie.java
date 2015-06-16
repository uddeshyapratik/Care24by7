package com.example.care_247;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Calorie extends ActionBarActivity {
	Button b1,b2,b3;
	TextView t,t8,t9,t10,t11,t12,t13;
	Dialog d;
	ImageView i;
	
	AlertDialog levelDialog;
	
	

	AlertDialog.Builder builder;
	final CharSequence[] items = {" Hamburger "," Chicken Breast "," boiled Egg "," Butter ","Roasted Peanuts","Milk","Cottage Cheese","Ice Cream","Bread","Muffin","Cookie","Baked Potato","Green Peas","Banana","Orange","Table Sugar","Jelly","Kaju Barfi","Energy Drink","Paratha","Soya Paneer","Grapes","Salmon Fish"};


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.food);
		builder = new AlertDialog.Builder(this);
		 t=new TextView(this);
		 d=new Dialog(this);
		i=(ImageView)findViewById(R.id.imageView2);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		t8=(TextView)findViewById(R.id.textView8);
		t9=(TextView)findViewById(R.id.textView9);
		t10=(TextView)findViewById(R.id.textView10);
		t11=(TextView)findViewById(R.id.textView11);
		t12=(TextView)findViewById(R.id.textView12);
		t13=(TextView)findViewById(R.id.textView13);
		
		
			b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					t.setText("Nutrients are the components in foods that a person utilizes to survive and grow.Organic nutrients include carbohydrates,fats,protein and vitamin.Inorganic chemical compounds such as dietary minerals,water and oxygen may also be considered nutrients.Nutrients needed in very small amounts are micronutrients and those that are needed in large qualities are called macronutrients.The effect of nutrirnts are dose-dependent and shortage are called deficiencies.Nutritional values for common food and products are listed in this app. ");
					//t.setText("hello");
					t.setPadding(60, 60, 60, 60);
					
					
					d.setTitle("Nutrient Content");
					d.setContentView(t);
					d.show();
				}
			});
			
			b3.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					 builder.setTitle("Select The Difficulty Level");
					 
				        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
				        public void onClick(DialogInterface dialog, int item) {
				           
				            
				            switch(item)
				            {
				                case 0:
				                	b3.setText(""+items[item]);
				                  i.setImageResource(R.drawable.a);
				                  t8.setText("3 Ounces"); 
				                  t9.setText("246 K.Cal");
				                  t10.setText("20 Gms.");
				                  t11.setText("18 Gms.");
				                  t12.setText("9 mg");
				                  t13.setText("2.1 mg");
				                  
				                  break;
				                case 1:
				                        // Your code when 2nd  option seletced
				                	   b3.setText(""+items[item]);
				                	   i.setImageResource(R.drawable.b);
				                	   t8.setText("3 Ounces"); 
						                  t9.setText("246 K.Cal");
						                  t10.setText("20 Gms.");
						                  t11.setText("18 Gms.");
						                  t12.setText("9 mg");
						                  t13.setText("2.1 mg");
				                        break;
				                case 2:
				                       // Your code when 3rd option seletced
				                	   b3.setText(""+items[item]);
				                	   i.setImageResource(R.drawable.h);
				                	   t8.setText("1 Whole"); 
						                  t9.setText("77 K.Cal");
						                  t10.setText("6 Gms.");
						                  t11.setText("5 Gms.");
						                  t12.setText("25 mg");
						                  t13.setText("0.6 mg");
				                	   break;
				                case 3:
				                         // Your code when 4th  option seletced    
				                	   b3.setText(""+items[item]);
				                	   i.setImageResource(R.drawable.c);
				                	   t8.setText("2(tsb)"); 
						                  t9.setText("190 K.Cal");
						                  t10.setText("8 Gms.");
						                  t11.setText("7 Gms.");
						                  t12.setText("11 mg");
						                  t13.setText("0.5 mg");
				                        break;
				                case 4:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.d);
				                	 t8.setText("1 Ounces"); 
					                  t9.setText("164 K.Cal");
					                  t10.setText("7 Gms.");
					                  t11.setText("5 Gms.");
					                  t12.setText("24 mg");
					                  t13.setText("0.5 mg");
				                break;
				                case 5:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.e);
				                	 t8.setText("1 Cup"); 
					                  t9.setText("150 K.Cal");
					                  t10.setText("8 Gms.");
					                  t11.setText("11 Gms.");
					                  t12.setText("291 mg");
					                  t13.setText("0.1 mg");
				                	break;
				                case 6:
				                b3.setText(""+items[item]);
				                i.setImageResource(R.drawable.g);
				                t8.setText("0.5 Cup"); 
				                  t9.setText("102 K.Cal");
				                  t10.setText("16 Gms.");
				                  t11.setText("4 Gms.");
				                  t12.setText("78 mg");
				                  t13.setText("0.2 mg");
				                break;
				                case 7:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.f);
				                	 t8.setText("0.5 Cup"); 
					                  t9.setText("134 K.Cal");
					                  t10.setText("2 Gms.");
					                  t11.setText("16 Gms.");
					                  t12.setText("88 mg");
					                  t13.setText("0.1 mg");
				                break;
				                case 8:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.ll);
				                	 t8.setText("1 Slice"); 
					                  t9.setText("72 K.Cal");
					                  t10.setText("3 Gms.");
					                  t11.setText("13 Gms.");
					                  t12.setText("35 mg");
					                  t13.setText("1.0 mg");
				                break;
				                case 9:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.aa);
				                	t8.setText("1 Whole"); 
					                  t9.setText("125 K.Cal");
					                  t10.setText("3 Gms.");
					                  t11.setText("19 Gms.");
					                  t12.setText("60 mg");
					                  t13.setText("1.4 mg");
				                break;
				                case 10:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.bb);
				                	t8.setText("3 Whole"); 
					                  t9.setText("139 K.Cal");
					                  t10.setText("2 Gms.");
					                  t11.setText("19 Gms.");
					                  t12.setText("8 mg");
					                  t13.setText("0.8 mg");
				                break;
				                case 11:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.li);
				                	t8.setText("1 Whole"); 
					                  t9.setText("220 K.Cal");
					                  t10.setText("5 Gms.");
					                  t11.setText("51 Gms.");
					                  t12.setText("20 mg");
					                  t13.setText("2.8 mg");
				                break;
				                case 12:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.mm);
				                	t8.setText("0.5 Cup"); 
					                  t9.setText("63 K.Cal");
					                  t10.setText("4 Gms.");
					                  t11.setText("11 Gms.");
					                  t12.setText("19 mg");
					                  t13.setText("1.2 mg");
				                break;
				                case 13:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.cc);
				                	t8.setText("1 Whole"); 
					                  t9.setText("105 K.Cal");
					                  t10.setText("1 Gms.");
					                  t11.setText("28 Gms.");
					                  t12.setText("7 mg");
					                  t13.setText("0.1 mg");
				                break;
				                case 14:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.nn);
				                	t8.setText("1 Whole"); 
					                  t9.setText("60 K.Cal");
					                  t10.setText("1 Gms.");
					                  t11.setText("15 Gms.");
					                  t12.setText("52 mg");
					                  t13.setText("0.1 mg");
				                break;
				                case 15:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.dd);
				                	t8.setText("1 tsp."); 
					                  t9.setText("16 K.Cal");
					                  t10.setText("0 Gms.");
					                  t11.setText("4 Gms.");
					                  t12.setText("0 mg");
					                  t13.setText("0 mg");
				                break;
				                case 16:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.ee);
				                	t8.setText("1 tsp."); 
					                  t9.setText("16 K.Cal");
					                  t10.setText("0 Gms.");
					                  t11.setText("4 Gms.");
					                  t12.setText("1 mg");
					                  t13.setText("0 mg");
				                break;
				                case 17:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.ff);
				                	t8.setText("1 Slice"); 
					                  t9.setText("125 K.Cal");
					                  t10.setText("3 Gms.");
					                  t11.setText("17 Gms.");
					                  t12.setText("35 mg");
					                  t13.setText("1.0 mg");
				                break;
				                case 18:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.pp);
				                	t8.setText("1 Can"); 
					                  t9.setText("115 K.Cal");
					                  t10.setText("0.6 Gms.");
					                  t11.setText("27.9 Gms.");
					                  t12.setText("33.2 mg");
					                  t13.setText("0.1 mg");
				                	
				                break;
				                case 19:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.oo);
				                	t8.setText("1 Piece"); 
					                  t9.setText("162 K.Cal");
					                  t10.setText("3 Gms.");
					                  t11.setText("26 Gms.");
					                  t12.setText("1 mg");
					                  t13.setText("8.0 mg");
				                break;
				                case 20:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.jj);
				                	t8.setText("100 gm"); 
					                  t9.setText("117 K.Cal");
					                  t10.setText("13.8 Gms.");
					                  t11.setText("4 Gms.");
					                  t12.setText("31 mg");
					                  t13.setText("1.0 mg");
				                break;
				                case 21:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.hh);
				                	t8.setText("1 Cup"); 
					                  t9.setText("104 K.Cal");
					                  t10.setText("1.1 Gms.");
					                  t11.setText("27.3 Gms.");
					                  t12.setText("15.1 mg");
					                  t13.setText("0.5 mg");
				                break;
				                case 22:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.gg);
				                	t8.setText("3 Ounces"); 
					                  t9.setText("183 K.Cal");
					                  t10.setText("23 Gms.");
					                  t11.setText("0 Gms.");
					                  t12.setText("6 mg");
					                  t13.setText("0.5 mg");
				                break;
				                case 23:
				                	b3.setText(""+items[item]);
				                	i.setImageResource(R.drawable.lk);
				                	t8.setText("4 Ounces"); 
					                  t9.setText("111 K.Cal");
					                  t10.setText("12.6 Gms.");
					                  t11.setText("3.8 Gms.");
					                  t12.setText("93.8 mg");
					                  t13.setText("0.1 mg");
				                break;
				                	
				            }
				            levelDialog.dismiss();    
				            }
				        });
				        levelDialog = builder.create();
				        levelDialog.show();


					
				}
			});
			b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Calorie.this,Home.class);
					startActivity(i);
				}
			});
	}}