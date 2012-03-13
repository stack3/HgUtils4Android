package net.stack3.hglib.utils;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

public class ActivityUtils {
	/**
	 * Show software keyboard.
	 * @param activity
	 * @param textView
	 */
	public static void showSoftKeyboard(Activity activity, TextView textView) {
		InputMethodManager inputMethodManager = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);  
		inputMethodManager.showSoftInput(textView, 0); 		
	}
	/**
	 * Hide software keyboard.
	 * @param activity
	 */
	public static void hideSoftKeyboard(Activity activity) {
		InputMethodManager inputMethodManager = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);             
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);		
	}
}
