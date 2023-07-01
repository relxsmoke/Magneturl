package com.magneturl;
import android.content.Intent;
import android.net.Uri;
import android.service.quicksettings.TileService;
import com.cn.help.读写;

public class two extends TileService
{
		@Override
		public void onClick ( )
			{
				super.onClick ( );

				读写 读取 = new 读写();
				String dq2 = "sdcard/Android/url2.txt";
				String z2 = 读取.读取(dq2);

				Intent intent2 = new Intent();
				intent2.setAction("android.intent.action.VIEW");
				Uri content_url2 = Uri.parse(z2);
				intent2.setData(content_url2);
				startActivity(intent2);

			}
}
