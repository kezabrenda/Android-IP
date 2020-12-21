package com.example.myindependentproject;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class CleaningActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<CleaningActivity> activityTestRule =
            new ActivityTestRule<>(CleaningActivity.class);

    @Test
    public void listItemClickDisplaysToastWithCorrectCleaningPlace() {
        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
        String cleaningPlaceName = "Shalom Dry Cleaner";
        onData(anything())
                .inAdapterView(withId(R.id.listView))
                .atPosition(0)
                .perform(click());
        onView(withText(cleaningPlaceName)).inRoot(withDecorView(not(activityDecorView)))
                .check(matches(withText(cleaningPlaceName)));
    }

}