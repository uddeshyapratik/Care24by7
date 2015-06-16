package com.example.care_247;












import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;
import android.widget.Toast;

public class Wdatabase {

	private Context mContext;
	private DbHelper mDBHELPER;
	private SQLiteDatabase mDB;
	

	public static final String DB_Name="MDCN";
	public static final int DB_VERSION=1;
	public static final String DB_TB_Name="mdcn1";
	public static final String SQL_CREATE_TABLE="CREATE TABLE mdcn1(id INTEGER PRIMARY KEY AUTOINCREMENT ,mdetails text,hour int,minute int,day text );";
		
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
	
	public Wdatabase(Context context) {
		
		mContext=context;
	}
	
	

	public Wdatabase open()
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
	
	
	public void addNew(String md,int h,int m,String dd)
	{ 
			ContentValues cv=new ContentValues();
			
			cv.put("mdetails",md);
			cv.put("hour",h);
			cv.put("minute",m);
			cv.put("day",dd);
			
			
		int	val=(int) mDB.insert(DB_TB_Name, null, cv);
		
		if(val>=0)
		{
			Dialog m1=new Dialog(mContext);
			m1.setTitle("Message");
			TextView tv=new TextView(mContext);
			tv.setText("alarm is set.");
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
	
	
	public String getdetail(int m)
	{
		String col[]={"id","mdetails"};
		Cursor c=mDB.query(DB_TB_Name,col," id="+m, null, null, null, null);
		String res = "";
		if(c!=null){
	    c.moveToFirst();
	
		
		while(!c.isAfterLast())
		{
		
			res=c.getString(1);
			c.moveToNext();
		}
		return res;
		}
		else
	{
			
		return "no data";
		}
	}
	
	public int hour(int m)
	{
		String col[]={"id","hour"};
		Cursor c=mDB.query(DB_TB_Name,col," id="+m, null, null, null, null);
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
	public int minute(int m)
	{
		String col[]={"id","minute"};
		Cursor c=mDB.query(DB_TB_Name,col," id="+m, null, null, null, null);
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
	
	public String getday(int m)
	{
		String col[]={"id","day"};
		Cursor c=mDB.query(DB_TB_Name,col," id="+m, null, null, null, null);
		String res = "";
		if(c!=null){
	    c.moveToFirst();
	
		
		while(!c.isAfterLast())
		{
		
			res=c.getString(1);
			c.moveToNext();
		}
		return res;
		}
		else
	{
			
		return "no data";
		}
	}
	
	/* public int getconsum(int m)
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
	
	
/*	public void updateflag(int a,int b ) {
		
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
	

//******************************* DELETE DATA FROM TABLE USING PRIMARY KEY ***************************************
	
	 */
	 public void deletemdcn(int m) {

			int val =mDB.delete("mdcn1", "id="+m, null);
			
			if(val>=0)
			{
				Dialog d=new Dialog(mContext);
				d.setTitle("Message");
				TextView tv=new TextView(mContext);
				tv.setText("alarm is successfully Deleted.");
				tv.setPadding(15, 5, 5, 5);
				d.setContentView(tv);
				d.show();
			}

}



	



	

}




