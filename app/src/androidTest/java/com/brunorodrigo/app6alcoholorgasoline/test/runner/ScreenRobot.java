package com.brunorodrigo.app6alcoholorgasoline.test.runner;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.support.test.espresso.Espresso;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

// Common set up for Robot
public abstract class ScreenRobot <T extends ScreenRobot> {

    // This is used to get the context of the activity
    private Activity activityContext;

    public static <T extends ScreenRobot> T withRobot(Class<T> screenRobotClass) {
        if (screenRobotClass == null) {
            throw new IllegalArgumentException("instance class == null");
        }

        try {
            return screenRobotClass.newInstance();
        } catch (IllegalAccessException iae) {
            throw new RuntimeException("IllegalAccessException", iae);
        } catch (InstantiationException ie) {
            throw new RuntimeException("InstantiationException", ie);
        }
    }

    public T checkIsDisplayed(@IdRes int... viewIds) {
        for (int viewId : viewIds) {
            onView(withId(viewId)).check(matches(isDisplayed()));
        }
        return (T) this;
    }

    public T checkViewHasText(@IdRes int viewId, String expected) {
        onView(withId(viewId)).check(matches(withText(expected)));
        return (T) this;
    }

    public T checkViewContainsText(String text) {
        onView(withText(text)).check(matches(isDisplayed()));
        return (T) this;
    }

    public T checkViewHasHint(@IdRes int viewId, @StringRes String messageResId) {
        onView(withId(viewId)).check(matches(withHint(messageResId)));
        return (T) this;
    }

    public T clickOnView(@IdRes int viewId) {
        onView(withId(viewId)).perform(click());
        return (T) this;
    }

    public T enterTextIntoView(@IdRes int viewId, String text) {
        onView(withId(viewId)).perform(typeText(text));
        Espresso.closeSoftKeyboard();
        return (T) this;
    }

}

