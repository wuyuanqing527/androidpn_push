package org.androidpn.client;

import org.androidpn.demoapp.R;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class BootCompletedReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent arg1) {
		// TODO Auto-generated method stub

		SharedPreferences pref=context.getSharedPreferences(Constants.SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE);
		if(pref.getBoolean(Constants.SETTINGS_AUTO_START, true)){
			ServiceManager serviceManager=new ServiceManager(context);
			serviceManager.setNotificationIcon(R.drawable.notification);
			serviceManager.startService();
		}
		
	}

}
