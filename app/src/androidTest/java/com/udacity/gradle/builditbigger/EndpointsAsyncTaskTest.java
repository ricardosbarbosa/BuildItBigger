package com.udacity.gradle.builditbigger;

import android.text.TextUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ricardobarbosa on 03/02/17.
 */

public class EndpointsAsyncTaskTest {

    String joke = null;
    CountDownLatch signal = null;


    @Before
    public void setUp() throws Exception {
        signal = new CountDownLatch(1);
    }

    @After
    public void tearDown() throws Exception {
        signal.countDown();
    }

    @Test
    public void testOnPostExecute() throws Exception {

        EndpointsAsyncTask task = new EndpointsAsyncTask(new AsyncTaskDelegate() {
            @Override
            public void processFinish(Object output) {
                joke = (String)output;
                signal.countDown();
            }
        });
        task.execute();
        signal.await();

        assertNotNull(joke);
        assertFalse(TextUtils.isEmpty(joke));

    }
}