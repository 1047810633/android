package com.cn.stepcounter;

import com.cn.stepcounter.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.view.animation.Animation;

/**
 * ������������
 * ��ɿ�������
 * ����ת�����������н���StepActivity
 */
public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splash);
		
		if (StepCounterService.FLAG || StepDetector.CURRENT_SETP > 0) {// �����Ѿ�������ֱ����ת�����н���
			Intent intent = new Intent(SplashActivity.this, StepCounterActivity.class); //����һ���µ�Intent��ָ����ǰӦ�ó���������																//��Ҫ������StepActivity��
			startActivity(intent);												//�������intent��startActivity
			this.finish();
		} else {
			try {
				Thread.sleep(2000);
				Intent intent = new Intent(SplashActivity.this, StepCounterActivity.class); //����һ���µ�Intent��ָ����ǰӦ�ó���������																//��Ҫ������StepActivity��
				startActivity(intent);												//�������intent��startActivity
				this.finish();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}

