package com.example.care_247;



import java.util.Date;

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
import android.widget.ImageButton;
import android.widget.TextView;

public class Smoke extends ActionBarActivity {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	ImageButton ib;
	AlertDialog levelDialog;
	Dialog d;
	TextView tv;
	Date dt;
String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
Integer sd, sm,sy,ld,lm,ly,nc,cc,cd,cm,cy,dd,md,yd,td,sum,tc,ds,hs,ms;
Float mt,yr;
	
	AlertDialog.Builder builder;
	final CharSequence[] day = {" 1 "," 2 "," 3 "," 4 ","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    final CharSequence[] month={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
  final CharSequence[] cost={" 1 "," 2 "," 3 "," 4 ","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    final CharSequence[]year={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
	@SuppressWarnings("deprecation")
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	        setContentView(R.layout.smoking);
	        b1=(Button)findViewById(R.id.button1);
			b2=(Button)findViewById(R.id.button2);
			b3=(Button)findViewById(R.id.button3);
			b4=(Button)findViewById(R.id.button4);
			b5=(Button)findViewById(R.id.button5);
			b6=(Button)findViewById(R.id.button6);
			b7=(Button)findViewById(R.id.button7);
			b8=(Button)findViewById(R.id.button8);
			b9=(Button)findViewById(R.id.button9);
			b10=(Button)findViewById(R.id.button10);
		    b11=(Button)findViewById(R.id.button11);
		    b12=(Button)findViewById(R.id.button12);
		
			 builder = new AlertDialog.Builder(this);
			 d=new Dialog(this);
			 tv=new TextView(this);
			 dt=new Date();
		    cd=dt.getDate();
		    cm=dt.getMonth()+1;
		    cy=dt.getYear()+1900;
		    s9=b4.getText().toString();
		   switch(cm)
		   {
		   case 1:
			   s10="Jan";
			   break;
		   case 2:
			   s10="Feb";
			   break;
		   case 3:
			   s10="March";
			   break;
		   case 4:
			   s10="April";
			   break;
		   case 5:
			   s10="May";
			   break;
		   case 6:
			   s10="June";
			   break;
		   case 7:
			   s10="July";
			   break;
		   case 8:
			   s10="Aug";
			   break;
		   case 9:
			   s10="Sept";
			   break;
		   case 10:
			   s10="Oct";
			   break;
		   case 11:
			   s10="Nov";
			   break;
		   case 12:
			   s10="Dec";
			   break;
			default :
		    break;
			   }
		    
		    b2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					
					d.setTitle("Stop smoking start saving");
					tv.setText("Just think of all productive days and money lost when you smoke! You loose 11 minutes of your life with every cigarette you smoke. These could be 11 minutes well spent with your family and friends,at work studying ,traveling,exercising,laughing or doing what you love the most");
					tv.setPadding(15, 5, 5, 5);
					d.setContentView(tv);
					d.show();
					b4.setText("Month");			
					
					
				}
			});
		    
		    
		    b3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					 builder.setTitle("Select The Day");
					    builder.setSingleChoiceItems(day, -1, new DialogInterface.OnClickListener() {
					        public void onClick(DialogInterface dialog, int item) 
					        {
					        	 s9=b4.getText().toString();
					        	sd=item+1;
					        	
					        	if(s9.equals("Feb") && sd>29)
					        	{
					        		
					        		d.setTitle("Alert");
									tv.setText("Entered Day not comes in feb month");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b3.setText("Day");
									b4.setText("Month");
					        		
					        	}
					        	else if((s9.equals("April")||s9.equals("June")||s9.equals("Sept")||s9.equals("Nov"))&& sd>30)
					        	{
					        		d.setTitle("Alert");
									tv.setText("Entered Day not comes in this month");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b3.setText("Day");
									b4.setText("Month");
					        	}
					        	else if(s9.equals(s10) && sd>cd)
					        	{
					        		d.setTitle("Alert");
									tv.setText("Entered Day will come in future");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b3.setText("Day");
									b4.setText("Month");
					        		
					        	}
					        	else
					        	{
					        	b3.setText(day[item]);
					        	
					        	}


					            levelDialog.dismiss();    
					            }
					        });
					        levelDialog = builder.create();
					        levelDialog.show();
					
				}
			});
			
	 b4.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					 builder.setTitle("Select The Month");
					    builder.setSingleChoiceItems(month, -1, new DialogInterface.OnClickListener() {
					        public void onClick(DialogInterface dialog, int item) 
					        {
					        	
					        	
					        	 sm=item+1;
					        	if(sm==2 && (sd>=30))
					        	{
					        		
					        		d.setTitle("Alert");
									tv.setText("Entered Day not comes in feb month");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b4.setText("Month");
									
					        		
					        	}
					        	else if((sm==4||sm==6||sm==9||sm==11)&&(sd>30))
					        	{
					        		d.setTitle("Alert");
									tv.setText("Entered Day not comes in "+month[item]+" month");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b4.setText("Month");
					        	}
					        
					        	
					        	
					        	else
					        	{
					        	
					           b4.setText(month[item]);
					            
					        	} 

					            levelDialog.dismiss();    
					            }
					        });
					        levelDialog = builder.create();
					        levelDialog.show();
					
				}
			});
			
	 b5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 builder.setTitle("Select The year");
				    builder.setSingleChoiceItems(year, -1, new DialogInterface.OnClickListener() {
				        public void onClick(DialogInterface dialog, int item) 
				        {
				        	sy=Integer.parseInt(year[item].toString());
				        
				        
				        	if(sy>cy)
				        	{
				        		d.setTitle("Alert");
								tv.setText("Entered year will come in future  Please enter correct year");
								tv.setPadding(15, 5, 5, 5);
								d.setContentView(tv);
								d.show();
								b5.setText("Year");
				        	}
				        	
				        	else	if(sy.equals(cy) && (sm>cm))
			        		{
			        			
			        				d.setTitle("Alert");
									tv.setText("Entered month will come in future please enter correct month or year ");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b4.setText("Month");
									b5.setText("Year");
									
									
									
			        		  }
				        	else if(sy.equals(cy) && (sm.equals(cm)) && (sd>cd))
			        		{
			        			
			        				d.setTitle("Alert");
									tv.setText("Entered Day will come in future please enter correct month or year ");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b3.setText("Day");
									b4.setText("Month");
									b5.setText("Year");
									
									
									
			        		  }
				        			
				        			
				        		else
				        		{
				           b5.setText(year[item]);
				        		}
	                       

				            levelDialog.dismiss();    
				            }
				        });
				        levelDialog = builder.create();
				        levelDialog.show();
				
			}
		});

	 b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 builder.setTitle("Select The Day");
				    builder.setSingleChoiceItems(day, -1, new DialogInterface.OnClickListener() {
				        public void onClick(DialogInterface dialog, int item) 
				        {
				        	ld=item+1;
				           b6.setText(day[item]);
				            
	                        

				            levelDialog.dismiss();    
				            }
				        });
				        levelDialog = builder.create();
				        levelDialog.show();
				
			}
		});
		
	b7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				 builder.setTitle("Select The Month");
				    builder.setSingleChoiceItems(month, -1, new DialogInterface.OnClickListener() {
			
						public void onClick(DialogInterface dialog, int item) 
				        {
				        	 lm=item+1;
					        	if(lm==2 && (ld>=30))
					        	{
					        		d.setTitle("Alert");
									tv.setText("Entered Day not comes in feb month");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b7.setText("Month");
					        		
					        	}
					        	else if((lm==4||lm==6||lm==9||lm==11)&&(ld>30))
					        	{
					        		d.setTitle("Alert");
									tv.setText("Entered Day not comes in "+month[item]+" month");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b7.setText("Month");
					        	}
					        	
					        	else
					        	{
					        	
					           b7.setText(month[item]);
					            
					        	} 
				            


				            levelDialog.dismiss();    
				            }
				        });
				        levelDialog = builder.create();
				        levelDialog.show();
				
			}
		});
		
	b8.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			 builder.setTitle("Select The year");
			    builder.setSingleChoiceItems(year, -1, new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int item) 
			        {
			        	ly=Integer.parseInt(year[item].toString());
			        	if(sd.equals(ld)&& sm.equals(lm)&&sy.equals(ly))
			        	{
			        		d.setTitle("Alert");
							tv.setText("you enterd the same date of start and quit of smoking please check  it");
							tv.setPadding(15, 5, 5, 5);
							d.setContentView(tv);
							d.show();
							b8.setText("Year");
			        		
			        	}
			        	else if(sy.equals(ly) && sm>lm )
			        		{
			        			

					        		d.setTitle("Alert");
									tv.setText("quited month is less  than started month please enter correct month");
									tv.setPadding(15, 5, 5, 5);
									d.setContentView(tv);
									d.show();
									b7.setText("Month");
									b8.setText("Year");
			        			}
			        			
			        	else if(sy.equals(ly)&& sm.equals(lm) && sd>ld )
			        	{
			        						d.setTitle("Alert");
											tv.setText("Started day is less than quited day please enter correct day");
											tv.setPadding(15, 5, 5, 5);
											d.setContentView(tv);
											d.show();
											b7.setText("Month");
											b8.setText("Year");
											b6.setText("Day");
											
			        	}
			        					
			        				
			        			
			        			
			        		
			        	
			        	else
			        	{
			        	
			        	
			           b8.setText(year[item]);
			        	}


			            levelDialog.dismiss();    
			            }
			        });
			        levelDialog = builder.create();
			        levelDialog.show();
			
		}
	});
	b9.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			 builder.setTitle("Select The no of cigarettes");
			    builder.setSingleChoiceItems(cost, -1, new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int item) 
			        {
			        	nc=item+1;
			           b9.setText(cost[item]);
			            


			            levelDialog.dismiss();    
			            }
			        });
			        levelDialog = builder.create();
			        levelDialog.show();
			
		}
	});

	b10.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			 builder.setTitle("Select The cost of cigarettes");
			    builder.setSingleChoiceItems(cost, -1, new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int item) 
			        {
			        	cc=item+1;
			           b10.setText(cost[item]);
			            


			            levelDialog.dismiss();    
			            }
			        });
			        levelDialog = builder.create();
			        levelDialog.show();
			
		}
	});


	b12.setOnClickListener(new View.OnClickListener() {
		
		
		
		@Override
		public void onClick(View arg0) {
			
			s1=b3.getText().toString();
			s2=b4.getText().toString();
			s3=b5.getText().toString();
			s4=b6.getText().toString();
			s5=b7.getText().toString();
			s6=b8.getText().toString();
			s7=b9.getText().toString();
			s8=b10.getText().toString();
			if(s1.equals("Day")||s2.equals("Month")||s3.equals("Year")||s4.equals("Day")||s5.equals("Month")||s6.equals("Year")||s7.equals("0")||s8.equals("cost"))
			{
				d.setTitle("Alert");
				tv.setText("Please enter the correct values");
				tv.setPadding(15, 5, 5, 5);
				d.setContentView(tv);
				d.show();
				
				
			}
			
			else
			{
			
			if(sd>ld)
			{
				if(lm==2)
				{
					ld+=29;
					lm-=1;
					dd=ld-sd;
				}
				else if(lm==4||lm==6||lm==9||lm==11)
				{
					ld+=30;
					lm-=1;
					dd=ld-sd;
				}
				else
				{
					ld+=31;
					lm-=1;
					dd=ld-sd;
				}
			}
			else
			{
				dd=ld-sd;
			}
			if(lm<sm)
			{
				lm+=12;
				ly-=1;
				md=lm-sm;
				
			}
			else
			{
				md=lm-sm;
			}
			
			if(sy==ly)
			{
				yd=0;
			}
			else
			{
				yd=ly-sy;
			}
		
			td=dd+md*30+yd*365;
			sum=td*11*nc;
			tc=nc*td*cc;
			mt=tc/(float)td *30;
			yr=mt*12;
			
			hs=sum/60;
			ms=sum%60;
			if(hs>23)
			{
				ds=hs/24;
				hs=hs%24;
				
				d.setTitle("Result");
				tv.setText("you loss your" +ds+ "days" +hs +"hr" +ms+ "minuts "+"\n"+"total expenditure on smoking "+tc+"\n" +"Monthly expenditure is "+mt+"\n"+"yearly expenditure is "+yr);
				tv.setPadding(15, 5, 5, 5);
				d.setContentView(tv);
				d.show();
			}
			else
			{
				
				d.setTitle("Result");
				tv.setText("you loss your"  +hs +"hr" +ms+ "minuts "+"\n"+"total expenditure on smoking "+tc+"\n" +"Monthly expenditure is "+mt+"\n"+"yearly expenditure is "+yr);
				tv.setPadding(15, 5, 5, 5);
				d.setContentView(tv);
				d.show();
			}
	
			
		}
		}
	});
b11.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent(Smoke.this,Home.class);
		startActivity(i);
	}
});

		}

	}

