package com.example.pope4president.myfirstappwithtests;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{
    public MainActivityTest(){
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testSendButtonDisplays() {
        onView(withId(R.id.button_send)).check(matches(isDisplayed()));
    }

    public void testSendButtonText() {
        onView(withId(R.id.button_send)).check(matches(withText("Press Me")));
    }
}
