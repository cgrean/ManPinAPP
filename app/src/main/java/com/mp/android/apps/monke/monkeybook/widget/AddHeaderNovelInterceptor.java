package com.mp.android.apps.monke.monkeybook.widget;

import android.content.Context;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created on 2017/7/17.
 */

public class AddHeaderNovelInterceptor implements Interceptor {

    private Context mContext;

    public AddHeaderNovelInterceptor(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request request = original
                .newBuilder()
//                .addHeader("X-Requested-With", "mobile-client")
//                .addHeader("Accept-Encoding", "identity")
                .addHeader("deviceid", "35ac76dbde2f08ff")
                .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImM5YmM4ZjI4MWNkNzQxMzZiNzAwN2M3MjJiNjg1NTY4IiwiZW1haWwiOiJraW5nMTM2OTMxODIxNzZAZ21haWwuY29tIiwibmFtZSI6ImRvdmUga2luZyIsImF2YXRhciI6Imh0dHBzOi8vbGg1Lmdvb2dsZXVzZXJjb250ZW50LmNvbS8tY2RmY1Jvaml1dEkvQUFBQUFBQUFBQUkvQUFBQUFBQUFBQUEvQU1adXVjbmdTdmxTYlN1c19WdVZXNW5ZTUlqaEY4S2JXQS9zOTYtYy9waG90by5qcGciLCJzaWdudXBUeXBlIjowLCJ0eXBlIjoiMSIsImlhdCI6MTYxNjc1NTEyNiwiZXhwIjoxNjE5MzQ3MTI2fQ.NAPxKpVTbSH3v_qryHmb4lHmU2WemQXZMmLrRRMLpTI")
                .build();
        return chain.proceed(request);
    }
}

