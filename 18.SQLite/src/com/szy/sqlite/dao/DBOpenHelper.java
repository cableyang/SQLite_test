package com.szy.sqlite.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * @author  coolszy
 * @blog    http://blog.csdn.net/coolszy
 */
public class DBOpenHelper extends SQLiteOpenHelper
{
	private static final int VERSION = 1;
	private static final String DBNAME = "MYDATA.db";
	private static final String STUDENT="t_student";
	
	public DBOpenHelper(Context context)
	{
		super(context, DBNAME, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL("create table "+STUDENT+" (sid integer primary key,name varchar(20),age integer)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		Log.i("StudentDAOTest", "UpGrade!");
	}

}
