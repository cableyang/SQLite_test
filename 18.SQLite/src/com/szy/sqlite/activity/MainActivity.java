package com.szy.sqlite.activity;

import java.util.Random;

import com.szy.sqlite.dao.StudentDAO;
import com.szy.sqlite.dao.StudentDAO2;
import com.szy.sqlite.model.Student;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        StudentDAO2 StudentDAO2=new StudentDAO2(this.getBaseContext());
        for(int i=1; i<10; i++)
        {
        	Student student=new Student(i,"coolszy", (short)i);
     	    StudentDAO2.update(student); 	
        }
        
		StudentDAO studentDAO=new StudentDAO(this.getBaseContext());
		for(int i=1; i<10; i++)
		{	 	
	    Student student2=studentDAO.find(i);
		Log.i("student2", student2.toString());
		}
	
    }
}