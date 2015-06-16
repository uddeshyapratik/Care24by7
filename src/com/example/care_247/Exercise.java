package com.example.care_247;




import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Exercise extends Activity {
	AlertDialog levelDialog;
	Button b,b1,b2,b3;
	EditText e1;
	String  m="";
	AlertDialog.Builder builder;
	final CharSequence[] items = {"Running","Swimming","Jumping","Aerobic Exercise","Cycling","Water Aerobic","Dancing"};
	final CharSequence[] items1 = {"Mediation","Asthana","Mantra Yoga","Tadasana","Anjaneyasana","Natarajasana","Bhakti Yoga","Vinyasa Yoga","Anusara Yoga","Kundalini Yoga","Ardha Chandrasana","Balasana","Bridge Pose","Dolphin Pose","Garudasana","High Lunge","Malasana","Padangusthasana","Parighsana","Parvottanasana","Utkatasana","Utthita Trikonasana","Utthita Parsvakonasana"};
	
  
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.exercise);
        
        builder = new AlertDialog.Builder(this);
		b1=(Button)findViewById(R.id.button3);
		b=(Button)findViewById(R.id.button4);
		e1=new EditText(this);
		b.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				 builder.setTitle("Select The Exercise Types");
			        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int item) {
			          m=Integer.toString(item);
		            	 
			            switch(item)
			            {
			            case 0:
			            	Intent i =new Intent(Exercise.this,PhotoActivity.class);
			            	i.putExtra("id",m);
			            
					        startActivity(i);
					          
					        
					       
	                        	
			                  
	                         break;
	                case 1:
	                   	Intent k =new Intent(Exercise.this,PhotoActivity.class);
                       k.putExtra("id", m);
				       	startActivity(k);
		
	                		                	 	                        // Your code when 2nd  option seletced
				        	b.setText(""+items[item]);
	                        
	                	   
	                        break;
	                case 2:
	                   	Intent j =new Intent(Exercise.this,PhotoActivity.class);
	                       j.putExtra("id", m);
					       	startActivity(j);

	                       // Your code when 3rd option seletced
	                	    b.setText(""+items[item]);
	                        break;
	                case 3:
	                   	Intent l =new Intent(Exercise.this,PhotoActivity.class);
	                       l.putExtra("id", m);
					       	startActivity(l);

	                         // Your code when 4th  option seletced   
	                	 					        
	                	   b.setText(""+items[item]);
	                        break;
	                case 4:
	    
	                	Intent n1=new Intent(Exercise.this,PhotoActivity.class);
	                       n1.putExtra("id", m);
					       	startActivity(n1);
           
	                	// Your code when 4th  option seletced    
               	   b.setText(""+items[item]);
                       break;
	                case 5:
	                   	Intent p=new Intent(Exercise.this,PhotoActivity.class);
	                       p.putExtra("id", m);
					       	startActivity(p);
        
                        // Your code when 4th  option seletced    
               	   b.setText(""+items[item]);
                       break;
	                case 6:
	                   	Intent o=new Intent(Exercise.this,PhotoActivity.class);
	                       o.putExtra("id", m);
					       	startActivity(o);

	                	 					        
                        // Your code when 4th  option seletced    
               	   b.setText(""+items[item]);
                       break;
	               }
			            levelDialog.dismiss();    
			            }

		
			        });
			       
			        levelDialog = builder.create();
			        levelDialog.show();

			       
			}
			
		
			        
		});
b1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				 builder.setTitle("Select The Yoga Types");
			        builder.setSingleChoiceItems(items1, -1, new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int item1) {
			        	  m=Integer.toString(item1);
				            
				           
			            
			            switch(item1)
			            {
			            case 0:
		                	 Intent j =new Intent(Exercise.this,PhotoActivity.class);

						        j.putExtra("id", m);
						        	startActivity(j);
						        
		                         break;
		                case 1:
		                	Intent k =new Intent(Exercise.this,PhotoActivity.class);

					        k.putExtra("id", m);
					        	startActivity(k);
					        
		                        // Your code when 2nd  option seletced
		                	   b1.setText(""+items1[item1]);
		                        break;
		                case 2:
		                	Intent l =new Intent(Exercise.this,PhotoActivity.class);

					        l.putExtra("id", m);
					        	startActivity(l);
		                       // Your code when 3rd option seletced
		                	   b1.setText(""+items1[item1]);
		                        break;
		                case 3:
		                	Intent m1 =new Intent(Exercise.this,PhotoActivity.class);

					        m1.putExtra("id", m);
					        	startActivity(m1);
		                         // Your code when 4th  option seletced    
		                	   b1.setText(""+items1[item1]);
		                        break;
		                case 4:
		                	Intent n1 =new Intent(Exercise.this,PhotoActivity.class);

					        n1.putExtra("id", m);
					        	startActivity(n1);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 5:
		                	Intent o =new Intent(Exercise.this,PhotoActivity.class);

					        o.putExtra("id", m);
					        	startActivity(o);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 6:
		                	Intent p =new Intent(Exercise.this,PhotoActivity.class);

					        p.putExtra("id", m);
					        	startActivity(p);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 7:
		                	Intent q =new Intent(Exercise.this,PhotoActivity.class);

					        q.putExtra("id", m);
					        	startActivity(q);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 8:
		                	Intent r =new Intent(Exercise.this,PhotoActivity.class);

					        r.putExtra("id", m);
					        	startActivity(r);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 9:
		                	Intent s =new Intent(Exercise.this,PhotoActivity.class);

					        s.putExtra("id", m);
					        	startActivity(s);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 10:
		                	Intent t =new Intent(Exercise.this,PhotoActivity.class);

					        t.putExtra("id", m);
					        	startActivity(t);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 11:
		                	Intent u =new Intent(Exercise.this,PhotoActivity.class);

					        u.putExtra("id", m);
					        	startActivity(u);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 12:
		                	Intent v =new Intent(Exercise.this,PhotoActivity.class);

					        v.putExtra("id", m);
					        	startActivity(v);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 13:
		                	Intent w =new Intent(Exercise.this,PhotoActivity.class);

					        w.putExtra("id", m);
					        	startActivity(w);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 14:
		                	Intent x =new Intent(Exercise.this,PhotoActivity.class);

					        x.putExtra("id", m);
					        	startActivity(x);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 15:
		                	Intent y =new Intent(Exercise.this,PhotoActivity.class);

					        y.putExtra("id", m);
					        	startActivity(y);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 16:
		                	Intent z =new Intent(Exercise.this,PhotoActivity.class);

					        z.putExtra("id", m);
					        	startActivity(z);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 17:
		                	Intent a =new Intent(Exercise.this,PhotoActivity.class);

					        a.putExtra("id", m);
					        	startActivity(a);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 18:
		                	Intent b =new Intent(Exercise.this,PhotoActivity.class);

					        b.putExtra("id", m);
					        	startActivity(b);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 19:
		                	Intent c =new Intent(Exercise.this,PhotoActivity.class);

					        c.putExtra("id", m);
					        	startActivity(c);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;
		                case 20:
		                	Intent d =new Intent(Exercise.this,PhotoActivity.class);

					        d.putExtra("id", m);
					        	startActivity(d);
	                         // Your code when 4th  option seletced    
	                	   b1.setText(""+items1[item1]);
	                        break;case 21:
			                	Intent e =new Intent(Exercise.this,PhotoActivity.class);

						        e.putExtra("id", m);
						        	startActivity(e);
		                         // Your code when 4th  option seletced    
		                	   b1.setText(""+items1[item1]);
		                        break;case 22:
				                	Intent f =new Intent(Exercise.this,PhotoActivity.class);

							        f.putExtra("id", m);
							        	startActivity(f);
			                         // Your code when 4th  option seletced    
			                	   b1.setText(""+items1[item1]);
			                        break;
         
			            }
			            levelDialog.dismiss();    
			            }
			        });
			        levelDialog = builder.create();
			        levelDialog.show();


			
			}
		
		});
        

	

}
}