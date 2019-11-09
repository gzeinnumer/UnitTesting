package com.gzeinnumer.unittesting;


import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


//todo 2
public class MainActivityTest {
//    androidTestImplementation 'com.android.support.test:rules:1.0.2'
//    testImplementation 'junit:junit:4.12'
//    androidTestImplementation 'androidx.test:core:1.2.0'
//    androidTestImplementation 'androidx.test:rules:1.2.0'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.1'
//    androidTestImplementation 'androidx.test.ext:truth:1.2.0'
//    androidTestImplementation 'com.google.truth:truth:0.42'
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = mainActivityActivityTestRule.getActivity();
    }

    //ini akan dinilai 1 pass
    @Test
    public void testLaunch(){
        View view = mainActivity.findViewById(R.id.tv_main);
        assertNotNull(view);
    }



    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}