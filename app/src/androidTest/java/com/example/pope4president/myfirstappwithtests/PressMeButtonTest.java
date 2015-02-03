package com.example.pope4president.myfirstappwithtests;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class PressMeButtonTest extends ActivityInstrumentationTestCase2<MainActivity>{
    public PressMeButtonTest(){
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testIsDisplayed() {
        onView(withId(R.id.button_send)).check(matches(isDisplayed()));
    }

    public void testDisplaysButtonText() {
        onView(withId(R.id.button_send)).check(matches(withText("Press Me")));
    }

    public void testMessageSend(){
        onView(withId(R.id.edit_message)).perform(typeText("Hello"));
        onView( withId(R.id.button_send)).perform(click());
        onView(withId(R.id.text_sent)).check(matches(withText("Hello")));
    }
}
