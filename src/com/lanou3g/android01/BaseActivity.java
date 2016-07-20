package com.lanou3g.android01;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {

	public abstract void create(Bundle savedInstanceState);

	public abstract void start();

	public abstract void resume();

	public abstract void pause();

	public abstract void stop();

	public abstract void destroy();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		create(savedInstanceState);
	}

	protected void onStart() {
		super.onStart();
		start();
	}

	public void onResume() {
		super.onResume();
		resume();
	}

	public void onPause() {
		super.onPause();
		pause();
	}

	public void onStop() {
		super.onStop();
		stop();
	}

	public void onDestroy() {
		super.onDestroy();
		destroy();
	}

}
