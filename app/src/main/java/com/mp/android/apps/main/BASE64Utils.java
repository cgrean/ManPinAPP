package com.mp.android.apps.main;

import android.util.Log;

import java.io.IOException;

import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

/**
 * Created by susyimes on 2017/7/19.
 */

public class BASE64Utils {

    public static String BASE64ToStr(String base64) {
        BASE64Decoder base64Decoder = new BASE64Decoder();
        String result = null;
        try {
            result = new String(base64Decoder.decodeBuffer(base64));
        } catch (IOException e) {
            Log.e("BASE64Utils", e.getMessage());
        }
        return result;
    }

    public static byte[] BASE64ToStr(byte[] src) {
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            return base64Decoder.decodeBuffer(new String(src));
        } catch (IOException e) {
            Log.e("BASE64Utils", e.getMessage());
        }
        return null;
    }

    public static String StrToBASE64(String str) {
        if (str != null) {
            BASE64Encoder base64Encoder = new BASE64Encoder();
            str = base64Encoder.encode(str.getBytes());
            return str.replaceAll("[\\s*\t\n\r]", "");
        }
        return null;
    }

    public static String StrToBASE64(byte[] src) {
        if (src != null) {
            BASE64Encoder base64Encoder = new BASE64Encoder();
            String str = base64Encoder.encode(src);
            return str.replaceAll("[\\s*\t\n\r]", "");
        }
        return null;
    }

}
