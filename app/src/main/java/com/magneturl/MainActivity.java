package com.magneturl;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.cn.help.读写;

/**
作者：Zero
联系：2767832980@qq.com
P   S：我采用了最笨的方式，各位可优化！
*/

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Button button1 = (Button) findViewById(R.id.mainButton1);
		Button button2 = (Button) findViewById(R.id.mainButton2);
		Button button3 = (Button) findViewById(R.id.mainButton3);
		final EditText text1 = (EditText) findViewById(R.id.mainEditText1);
		final EditText text2 = (EditText) findViewById(R.id.mainEditText2);
		final EditText text3 = (EditText) findViewById(R.id.mainEditText3);
		
		button1.setOnClickListener ( new OnClickListener ( )
		{
			@Override
			public void onClick ( View p1 )
			{
				if(TextUtils.isEmpty(text1.getText().toString().trim())){
					text1.setText("");
					Toast.makeText(MainActivity.this,"请输入正确的网址",Toast.LENGTH_LONG).show();
				}
				else{
					读写 写入1 = new 读写();
					String nr1 = text1.getText().toString().trim();
					String lj1 = "sdcard/Android/url1.txt";
					写入1.写入(nr1,lj1);
					Toast.makeText(MainActivity.this,"完成",Toast.LENGTH_SHORT).show();
				}
			}
		} );
		
		button2.setOnClickListener ( new OnClickListener ( )
				{
					@Override
					public void onClick ( View p1 )
						{
							if(TextUtils.isEmpty(text2.getText().toString().trim())){
									text2.setText("");
									Toast.makeText(MainActivity.this,"请输入正确的网址",Toast.LENGTH_LONG).show();
								}
							else{
									读写 写入2 = new 读写();
									String nr2 = text2.getText().toString().trim();
									String lj2 = "sdcard/Android/url2.txt";
									写入2.写入(nr2,lj2);
									Toast.makeText(MainActivity.this,"完成",Toast.LENGTH_SHORT).show();
								}
						}
				} );
				
		button3.setOnClickListener ( new OnClickListener ( )
				{
					@Override
					public void onClick ( View p1 )
						{
							if(TextUtils.isEmpty(text3.getText().toString().trim())){
									text3.setText("");
									Toast.makeText(MainActivity.this,"请输入正确的网址",Toast.LENGTH_LONG).show();
								}
							else{
									读写 写入3 = new 读写();
									String nr3 = text3.getText().toString().trim();
									String lj3 = "sdcard/Android/url3.txt";
									写入3.写入(nr3,lj3);
									Toast.makeText(MainActivity.this,"完成",Toast.LENGTH_SHORT).show();
								}
						}
				} );
    }
	
}
