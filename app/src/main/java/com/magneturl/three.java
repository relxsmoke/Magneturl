package com.magneturl;
import android.content.Intent;
import android.net.Uri;
import android.service.quicksettings.TileService;
import com.cn.help.读写;

public class three extends TileService
{
		@Override
		public void onClick ( )
			{
				super.onClick ( );

				读写 读取 = new 读写();
				String dq3 = "sdcard/Android/url3.txt";
				String z3 = 读取.读取(dq3);

				Intent intent3 = new Intent();
				intent3.setAction("android.intent.action.VIEW");
				Uri content_url3 = Uri.parse(z3);
				intent3.setData(content_url3);
				startActivity(intent3);

			}
}
