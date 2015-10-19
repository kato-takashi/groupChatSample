package com.gashfara.lovechat.ui.util;

import com.gashfara.lovechat.KiiChatApplication;

import android.content.Context;
import android.widget.Toast;

/**
 * Toastの表示処理を行うユーティリティクラスです。
 * 
 * @author noriyoshi.fukuzaki@kii.com
 */
public class ToastUtils {
	public static final void showShort(Context context, String msg) {
		show(context, msg, Toast.LENGTH_SHORT);
	}
	public static final void showLong(Context context, String msg) {
		show(context, msg, Toast.LENGTH_LONG);
	}
	private static final void show(Context context, String msg, int duration) {
		Toast.makeText(context, msg, duration).show();
	}
	public static final void showShort(Context context, int msgId) {
		show(context, msgId, Toast.LENGTH_SHORT);
	}
	public static final void showLong(Context context, int msgId) {
		show(context, msgId, Toast.LENGTH_LONG);
	}
	public static final void show(Context context, int msgId, int duration) {
		String msg = KiiChatApplication.getMessage(msgId);
		show(context, msg, duration);
	}
}
