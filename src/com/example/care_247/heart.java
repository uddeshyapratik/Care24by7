package com.example.care_247;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class heart  extends Activity{
	
	EditText e1,e2;
	Button b;
	String s1,s2;
	int i,j;
	TextView t;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.heart);
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		b=(Button)findViewById(R.id.button1);
		t=(TextView)findViewById(R.id.textView1);
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				s1=e1.getText().toString();
				s2=e2.getText().toString();
				
				i=Integer.parseInt(s1);
				j=Integer.parseInt(s2);
				
				if(j<40)
				{
				t.setText("You have major heart disease because your hdl is less than 40");	
				}
				if(j>=40 && j<=59)
				{
					t.setText("your HDL is higher so you are out of heart risk ");
					
				}
				if(j>=60)
				{
					t.setText("you are protective against heart disease ");
					
				}
				
			}
		});
		
		
		

}
}