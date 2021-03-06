package com.zxj.music.fusion.util;


import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import com.zxj.music.fusion.*;
import java.net.*;
import java.io.*;

public class DownloadUtils
{
	private static final DownloadManager manager = (DownloadManager) App.app_context.getSystemService(Context.DOWNLOAD_SERVICE);
	public static final String PATH_SDCARD=Environment.getExternalStorageDirectory().getPath();
	public static final String PATH_QQ_MUSIC=PATH_SDCARD+"/qqmusic/song/";
	public static final String PATH_NETEASE_MUSIC="/netease/cloudmusic/Music/";
	public static final String PATH_KUGOU_MUSIC=PATH_SDCARD+"/kgmusic/download/";
	public static final String PATH_DOWNLOAD="/Download/";
	
	public static void download(String downloadUrl,String name){
// 创建下载请求
	DownloadManager.Request request = new DownloadManager.Request(Uri.parse(downloadUrl));

	//request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
	//request.setTitle(title);
	//request.setDescription(des);
		
		//}
	request.setDestinationInExternalPublicDir(PATH_DOWNLOAD,name);
	UiUtils.toast(App.app_context.getString(R.string.start_download));
    manager.enqueue(request);
	}
}
