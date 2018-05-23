package com.fanwe.lib.cache;

import android.util.Log;


class LogUtils
{
    public static final String TAG = "SDDisk";

    private static boolean mIsDebug;

    public static void setDebug(boolean debug)
    {
        mIsDebug = debug;
    }

    public static boolean isDebug()
    {
        return mIsDebug;
    }

    public static void i(String msg)
    {
        if (!isDebug())
        {
            return;
        }
        Log.i(TAG, msg);
    }

    public static void e(String msg)
    {
        if (!isDebug())
        {
            return;
        }
        Log.e(TAG, msg);
    }
}
