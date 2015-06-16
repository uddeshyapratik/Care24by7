package com.example.care_247;

import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;
import android.widget.Toast;

public class Wdatabase1 {

	private Context mContext;
	private DbHelper mDBHELPER;
	private SQLiteDatabase mDB;
	

	public static final String DB_Name="WTR1";
	public static final int DB_VERSION=1;
	public static final String DB_TB_Name="wtr1";
	public static final String SQL_CREATE_TABLE="CREATE TABLE wtr1(month int primary key,day int,consum int,nglass int,total int,flag int );";
		
	private static final class DbHelper extends SQLiteOpenHelper{

		public DbHelper(Context context) {
			super(context, DB_Name, null, DB_VERSION);
			
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL(SQL_CREATE_TABLE);		
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			
			
			db.execSQL("DROP TABLE IF EXIST REGG");
			onCreate(db);
		}
	}
	
	public Wdatabase1(Context context) {
		
		mContext=context;
	}
	
	

	public Wdatabase1 open()
	{
		mDBHELPER=new DbHelper(mContext);
		mDB=mDBHELPER.getWritableDatabase();
		return this;
	}
	
	public void close()
	{
		mDBHELPER.close();
	}

/******************************* INSERT DATA INTO DATABASE ********************************************/	
	
	
	public void addNew(int m,int d,int c,int ng,int t,int f)
	{ 
			ContentValues cv=new ContentValues();
			cv.put("month", m);
			cv.put("day",d);
			cv.put("consum", c);
			cv.put("nglass", ng);
			cv.put("total", t);
			cv.put("flag",f);
			
		int	val=(int) mDB.insert(DB_TB_Name, null, cv);
		
		if(val>=0)
		{
			Dialog m1=new Dialog(mContext);
			m1.setTitle("Message");
			TextView tv=new TextView(mContext);
			tv.setText("first alarm.");
			tv.setPadding(15, 5, 5, 5);
			m1.setContentView(tv);
			m1.show();
		}
			
				try
				{
					Thread.sleep(2000);
				}
				catch(Exception e)
				{
					
				}
			}
			
	
	
	
/*******************************************  SELECT ALL FROM DATABASE *************************************************/
	
	
	public int getday(int m)
	{
		String col[]={"month","day"};
		Cursor c=mDB.query(DB_TB_Name,col," month="+m, null, null, null, null);
		int res = 0;
		if(c!=null){
	    c.moveToFirst();
	
		
		while(!c.isAfterLast())
		{
		
			res=c.getInt(1);
			c.moveToNext();
		}
		return res;
		}
		else
	{
			
		return 0;
		}
	}
	
	public int getconsum(int m)
	{
		String col[]={"month","consum"};
		Cursor c=mDB.query(DB_TB_Name,col," month="+m, null, null, null, null);
		int res = 0;
		if(c!=null){
	    c.moveToFirst();
	
		
		while(!c.isAfterLast())
		{
		
			res=c.getInt(1);
			c.moveToNext();
		}
		return res;
		}
		else
	{
			
		return 0;
		}
	}
	public int getglass(int m)
	{
		String col[]={"month","nglass"};
		Cursor c=mDB.query(DB_TB_Name,col," month="+m, null, null, null, null);
		int res = 0;
		if(c!=null){
	    c.moveToFirst();
	
		
		while(!c.isAfterLast())
		{
		
			res=c.getInt(1);
			c.moveToNext();
		}
		return res;
		}
		else
	{
			
		return 0;
		}
	}
	
	public int gettotal(int m)
	{
		String col[]={"month","total"};
		Cursor c=mDB.query(DB_TB_Name,col," month="+m, null, null, null, null);
		int res = 0;
		if(c!=null){
	    c.moveToFirst();
	
		
		while(!c.isAfterLast())
		{
		
			res=c.getInt(1);
			c.moveToNext();
		}
		return res;
		}
		else
	{
			
		return 0;
		}
	}
	public int getflag(int m)
	{
		String col[]={"month","flag"};
		Cursor c=mDB.query(DB_TB_Name,col," month="+m, null, null, null, null);
		int res = 0;
		if(c!=null){
	    c.moveToFirst();
	
		
		while(!c.isAfterLast())
		{
		
			res=c.getInt(1);
			c.moveToNext();
		}
		return res;
		}
		else
	{
			
		return 0;
		}
	}
/*	public String getpass(int a) {
		String col[]={"ID","PASS"};
		Cursor c=mDB.query(DB_TB_Name, col, "ID="+a, null, null, null, null);
		String res="";
		if(c!=null){
		c.moveToFirst();
		while(!c.isAfterLast())
		{
			res=res+c.getString(1);
			c.moveToNext();
		}
		return res;
		}
		else
		{
			return "No Data";
		
	}
}
	public String geten(int a) {
		String col[]={"ID","PASS","EN"};
		Cursor c=mDB.query(DB_TB_Name, col, "ID="+a, null, null, null, null);
		String res="";
		if(c!=null){
		c.moveToFirst();
		while(!c.isAfterLast())
		{
			res=res+c.getString(2);
			c.moveToNext();
		}
		return res;
		}
		else
		{
			return "No Data";
		
	}
	}




/*************************************** UPDATE TABLE USING PRIMARY KEY *****************************************************/
	
	
	public void updateflag(int a,int b ) {
		
		try{
		ContentValues cv= new ContentValues();
		
		cv.put("flag", b);
		
				
		int val=mDB.update("wtr1", cv, "month="+a, null);
				
		if(val>=0)
		{
			Dialog d=new Dialog(mContext);
			d.setTitle("Message");
			TextView tv=new TextView(mContext);
			tv.setText("voting is success.");
			tv.setPadding(15, 5, 5, 5);
			d.setContentView(tv);
			d.show();
		}
		}
		catch(Exception e)
		{
			Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
		}
	}

	
public void updatealarm(int a,int b,int c,int d,int e,int f ) {
		
		try{
		ContentValues cv= new ContentValues();
		
		cv.put("day", b);
		cv.put("consum", c);
		cv.put("nglass", d);
		cv.put("total", e);
		cv.put("flag", f);
		
		
				
		int val=mDB.update("wtr1", cv, "month="+a, null);
				
		if(val>=0)
		{
			Dialog d1=new Dialog(mContext);
			d1.setTitle("Message");
			TextView tv=new TextView(mContext);
			tv.setText("alarm  is success.");
			tv.setPadding(15, 5, 5, 5);
			d1.setContentView(tv);
			d1.show();
		}
		}
		catch(Exception e1)
		{
			Toast.makeText(mContext, e1.getMessage(), Toast.LENGTH_SHORT).show();
		}
	}
	
}
/******************************* DELETE DATA FROM TABLE USING PRIMARY KEY ***************************************
	
	 
	 public void deleteEmp(int empId) {

			int val =mDB.delete("EMP", "ID="+empId, null);
			
			if(val>=0)
			{
				Dialog d=new Dialog(mContext);
				d.setTitle("Message");
				TextView tv=new TextView(mContext);
				tv.setText("Data is successfully Deleted.");
				tv.setPadding(15, 5, 5, 5);
				d.setContentView(tv);
				d.show();
			}

}}*/






