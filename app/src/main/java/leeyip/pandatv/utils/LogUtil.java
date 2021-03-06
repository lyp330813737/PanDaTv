package leeyip.pandatv.utils;

import android.util.Log;

/**
 * @author: 范建海
 * @createTime: 2016/8/24 20:42
 * @className:  LogUtil
 * @Description: 日志工具类  DEBUG布尔常量控制是否显示日志
 *                          TAG为日志的标记
 */
public class LogUtil {
    /** 控制显示日志的常量 **/
    public static final boolean DEBUG = true;
    /** 日志标记常量 **/
    public static final String TAG = "yxck";

    public static void d(String desc) {
        if (DEBUG)
            Log.d(TAG,desc);
    }

    public static void d(String tag,String desc) {
        if (DEBUG)
            Log.d(tag,desc);
    }

    public static void d(String desc, Throwable tr) {
        if (DEBUG)
            Log.d(TAG, desc, tr);
    }

    public static void v(String desc) {
        if (DEBUG)
            Log.v(TAG, desc);
    }

    public static void v(String tag,String desc) {
        if (DEBUG)
            Log.v(tag,desc);
    }

    public static void v(String desc, Throwable tr) {
        if (DEBUG)
            Log.v(TAG, desc);
    }

    public static void w(String desc) {
        if (DEBUG)
            Log.w(TAG, desc);
    }

    public static void w(String tag,String desc) {
        if (DEBUG)
            Log.w(tag,desc);
    }

    public static void w(String desc, Throwable e) {
        if (DEBUG)
            Log.w(TAG, desc, e);
    }

    public static void i(String desc) {
        if (DEBUG)
            Log.i(TAG,desc);
    }

    public static void i(String tag,String desc) {
        if (DEBUG)
            Log.i(tag,desc);
    }

    public static void i(String desc, Throwable tr) {
        if (DEBUG)
            Log.i(TAG, desc, tr);
    }

    public static void e(String desc) {
        if (DEBUG)
            Log.e(TAG, desc);
    }

    public static void e(String tag,String desc) {
        if (DEBUG)
            Log.e(tag,desc);
    }

    public static void e(String desc, Throwable tr) {
        if (DEBUG)
            Log.e(TAG, desc, tr);
    }
}
