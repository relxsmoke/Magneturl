package com.magneturl;
import android.content.Intent;
import android.net.Uri;
import android.service.quicksettings.TileService;
import com.cn.help.读写;

public class one extends TileService
	{
		@Override
		public void onClick ( )
			{
				super.onClick ( );
				
				读写 读取 = new 读写();
				String dq1 = "sdcard/Android/url1.txt";
				String z1 = 读取.读取(dq1);
				
				Intent intent1 = new Intent();
				intent1.setAction("android.intent.action.VIEW");
				Uri content_url1 = Uri.parse(z1);
				intent1.setData(content_url1);
				startActivity(intent1);
				
			}
}
