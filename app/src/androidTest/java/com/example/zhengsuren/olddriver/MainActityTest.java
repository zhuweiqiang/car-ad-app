package com.example.zhengsuren.olddriver;

/**
 * Created by zhengsuren on 16/6/25.
 */



import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.app.Instrumentation.ActivityResult;

import com.example.zhengsuren.olddriver.MainActivity;
import com.example.zhengsuren.olddriver.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;



@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActityTest {

    private String mStringToBetyped;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initValidString() {
        // Specify a valid string.
        mStringToBetyped = "Espresso";
    }

    @Test
    public void mainActivity() {

        String username = "abc@qq.com";
        String password = "123456";


        //attempt login
        // Type text into an EditText view, then close the soft keyboard
        onView(withId(R.id.username)).perform(typeText(username),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText(password),closeSoftKeyboard());
        onView(ViewMatchers.withId(R.id.button)).perform(click());
    }


}
