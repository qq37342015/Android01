package com.lanou3g.android01;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tv;
	
	// Android的main方法
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.e("helloworld", "onCreate");

		// LogCat可以通过标签的方式过滤出想要的内容，Tag代表的就是标签
		// Java中的打印语句，在Android中的标签是System.out
		// System.out.println("哈哈哈哈哈哈哈哈哈哈");

		// Android中的打印语句
		// Log.v("helloworld", "这是verbose");// verbose
		// Log.i("helloworld", "这是info");// info
		// Log.d("helloworld", "这是debug");// debug
		// Log.w("helloworld", "这是warn");// warn
		// Log.e("helloworld", "这是error");// error

		// Android四大组件：
		// Activity：界面，Android应用程序的最小单元
		// Service：服务，后台运行的，没有界面的
		// BroadcastReceiver：广播，用来传递信息
		// ContentProvider：内容提供者，用于提供自己的信息给别的应用程序使用

		// 控件的使用步骤
		// 1.在布局文件中，生成对应的控件的代码
		// <TextView     -----控件的类别
		// android:id="@+id/textView2" ----id，确认控件的唯一标示，可以随意修改
		// android:layout_width="wrap_content" ---宽
		// android:layout_height="wrap_content"---高
		// android:text="陈路遥" />
		// 对于宽高来说有三个值
		// wrap_content:包裹，fill_parent=match_parent:充满
		// 一个控件最起码要有宽和高
		// 宽和高也可以是固定的尺寸数值+单位名称
		// 2.定义一个对象的变量
		// 3.初始化这个对象
		// 4.使用
		// 系统会先调用布局文件，然后再调用java的代码
		tv = (TextView)findViewById(R.id.textView2);
		tv.setText("abcdefg");
		tv.setTypeface(Typeface.createFromAsset(getAssets(), "ManuskriptGotisch.ttf"));
	}

	// 重写的定义，不小于等于父类的权限
	protected void onStart() {
		super.onStart();
		Log.e("helloworld", "onStart");
	}

	public void onResume() {
		super.onResume();
		Log.e("helloworld", "onResume");
	}

	public void onPause() {
		super.onPause();
		Log.e("helloworld", "onPause");
	}

	public void onStop() {
		super.onStop();
		Log.e("helloworld", "onStop");
	}

	public void onDestroy() {
		super.onDestroy();
		Log.e("helloworld", "onDestroy");
	}

}
