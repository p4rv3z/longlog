package parvez.vip.log;

import android.util.Log;

/**
 * Project: Log
 * Created by Muhammad Harun-Or-Roshid
 * Email: md.parvez28@gmail.com
 * Web: https://parvez.vip
 * On 28 June 2018 at 11:21 PM
 */

public class _L {

    public static final String TAG = "_LONG_LOG__";

    /**
     * Send a #DEBUG log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void d(String tag, String msg) {
        if (msg.length() > 4000) {
            Log.d(tag + "->", msg.substring(0, 4000));
            d(tag, msg.substring(4000));
        } else {
            Log.d(tag, msg);
        }
    }

    /**
     * Send a #DEBUG log message.
     *
     * @param msg The message you would like logged.
     * @default tag is _LONG_LOG__
     */
    public static void d(String msg) {
        d(TAG, msg);
    }


    /**
     * Send a #VERBOSE log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void v(String tag, String msg) {
        if (msg.length() > 4000) {
            Log.v(tag + "->", msg.substring(0, 4000));
            v(tag, msg.substring(4000));
        } else {
            Log.v(tag, msg);
        }
    }

    /**
     * Send a #VERBOSE log message.
     *
     * @param msg The message you would like logged.
     * @default tag is _LONG_LOG__
     */
    public static void v(String msg) {
        v(TAG, msg);
    }


    /**
     * Send a #INFO log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void i(String tag, String msg) {
        if (msg.length() > 4000) {
            Log.i(tag + "->", msg.substring(0, 4000));
            i(tag, msg.substring(4000));
        } else {
            Log.i(tag, msg);
        }
    }

    /**
     * Send a #INFO log message.
     *
     * @param msg The message you would like logged.
     * @default tag is _LONG_LOG__
     */
    public static void i(String msg) {
        i(TAG, msg);
    }


    /**
     * Send a #WARN log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void w(String tag, String msg) {
        if (msg.length() > 4000) {
            Log.w(tag + "->", msg.substring(0, 4000));
            w(tag, msg.substring(4000));
        } else {
            Log.w(tag, msg);
        }
    }

    /**
     * Send a #WARN log message.
     *
     * @param msg The message you would like logged.
     * @default tag is _LONG_LOG__
     */
    public static void w(String msg) {
        i(TAG, msg);
    }


    /**
     * Send a #ERROR log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void e(String tag, String msg) {
        if (msg.length() > 4000) {
            Log.e(tag + "->", msg.substring(0, 4000));
            e(tag, msg.substring(4000));
        } else {
            Log.e(tag, msg);
        }
    }

    /**
     * Send a #ERROR log message.
     *
     * @param msg The message you would like logged.
     * @default tag is _LONG_LOG__
     */
    public static void e(String msg) {
        e(TAG, msg);
    }


    /**
     * Send a #What a Terrible Failure log message.
     * Report a condition that should never happen.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void wtf(String tag, String msg) {
        if (msg.length() > 4000) {
            Log.wtf(tag + "->", msg.substring(0, 4000));
            wtf(tag, msg.substring(4000));
        } else {
            Log.wtf(tag, msg);
        }
    }

    /**
     * Send a #What a Terrible Failure log message.
     * Report a condition that should never happen.
     *
     * @param msg The message you would like logged.
     * @default tag is _LONG_LOG__
     */
    public static void wtf(String msg) {
        wtf(TAG, msg);
    }

}
