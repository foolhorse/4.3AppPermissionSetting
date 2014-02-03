package com.foolhorse.newsetting;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/**
 * 用来启动Android 4.3上隐藏的 应用程序权限 设置
 * 
 * @author ID_MARR
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			ComponentName componentName = new ComponentName("com.android.settings","com.android.settings.Settings$AppOpsSummaryActivity");  
			Intent i = new Intent();
			i.setComponent(componentName);  
			startActivity(i);
			finish();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
