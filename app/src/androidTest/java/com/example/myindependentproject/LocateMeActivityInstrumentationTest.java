package com.example.myindependentproject;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class LocateMeActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<LocateMeActivity> activityTestRule =
            new ActivityTestRule<>(LocateMeActivity.class);


    @Test
    public void locationIsSentToCleaningActivity(){
        String location = "Greece";
        onView(withId(R.id.placeLocationEditText)).perform(typeText(location)).perform(closeSoftKeyboard());
        try {
            Thread.sleep(90);
        } catch (InterruptedException e){
            System.out.println("got interrupted!");
        }
        onView(withId(R.id.cleaningPlacesButton)).perform(click());
        onView(withId(R.id.locationTextView)).check(matches
                (withText("Here are all the cleaning places near: " + location)));
    }

}