package com.android_twitter_show_timelines_demo;

import android.app.Application;
import android.util.Log;

import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;



public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //initiate Twitter config
        TwitterConfig config = new TwitterConfig.Builder(this)
                .logger(new DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(new TwitterAuthConfig("QVKGnuu2nGcshUPQGzrcA2Kf1 ", "9JUd7bRU4uW3NsG8bDbatg6YMks7efXEMdJH7xFzar3CcAul06 "))//pass Twitter API Key and Secret
                .debug(true)
                .build();
        Twitter.initialize(config);
    }
}
