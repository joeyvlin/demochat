package com.codepath.chat.demochat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by jlin on 8/1/16.
 */
public class ChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Message.class);

        // set applicationId and server based on the values in the Heroku settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("93bd0b59a90d46b1999e484431b83f41")
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://simplechatclient.herokuapp.com/parse").build());

    }
}
