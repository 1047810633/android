package com.cn.stepcounter;

import com.cn.stepcounter.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.animation.Animation;

/**
 * 程序启动界面
 * 完成开机动画
 * 并跳转到主程序运行界面StepActivity
 */
public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash);
		
		if (StepCounterService.FLAG || StepDetector.CURRENT_SETP > 0) {// 程序已经启动，直接跳转到运行界面
			Intent intent = new Intent(SplashActivity.this, StepCounterActivity.class); //创建一个新的Intent，指定当前应用程序上下文																//和要启动的StepActivity类
			startActivity(intent);												//传递这个intent给startActivity
			this.finish();
		} else {
			try {
				Thread.sleep(2000);
				Intent intent = new Intent(SplashActivity.this, StepCounterActivity.class); //创建一个新的Intent，指定当前应用程序上下文																//和要启动的StepActivity类
				startActivity(intent);												//传递这个intent给startActivity
				this.finish();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}

