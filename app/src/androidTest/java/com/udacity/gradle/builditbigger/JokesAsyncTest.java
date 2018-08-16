package com.udacity.gradle.builditbigger;


import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;


/**
 * Created by devin on 8/14/2018.
 */

public class JokesAsyncTest extends AndroidTestCase {

    public MainActivityFragment mFragment = new MainActivityFragment();

    public void testAsyncForNull() {

        JokeAsync async =  new JokeAsync();
        async.execute(mFragment);
        String result = null;
        try {
            result = async.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

    public void testAsyncForServerConnection() {
        JokeAsync async =  new JokeAsync();
        async.execute(mFragment);
        String result = null;
        try {
            result = async.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        assertNotSame(result, "Connection refused");
    }
}
