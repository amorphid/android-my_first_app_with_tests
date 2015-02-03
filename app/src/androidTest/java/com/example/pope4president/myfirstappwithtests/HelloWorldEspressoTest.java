package com.example.pope4president.myfirstappwithtests;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class HelloWorldEspressoTest extends ActivityInstrumentationTestCase2<MainActivity>{
    public HelloWorldEspressoTest(){
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testListGoesOverTheFold() {
        onView(withId(R.id.hello_world)).check(matches(withText(R.string.hello_world)));
    }
}
