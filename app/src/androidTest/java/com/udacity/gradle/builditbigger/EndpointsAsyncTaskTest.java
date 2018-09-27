package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void testDoInBackground() {

        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(new EndpointsAsyncTask.EndpointsResult() {
            @Override
            public void setResult(String result) {}
        });

        String result = asyncTask.doInBackground();

        assertNotNull(result);
        assertFalse(result.isEmpty());

    }
}