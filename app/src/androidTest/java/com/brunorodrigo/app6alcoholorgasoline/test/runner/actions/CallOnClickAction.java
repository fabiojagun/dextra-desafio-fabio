package com.brunorodrigo.app6alcoholorgasoline.test.runner.actions;


import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;

import org.hamcrest.Matcher;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.Matchers.allOf;

// This setup is used to get a better click on smaller fields
public class CallOnClickAction implements ViewAction {

    private CallOnClickAction(){}

    public static CallOnClickAction callOnClick(){
        return new CallOnClickAction();
    }

    @Override
    public Matcher<View> getConstraints() {
        return allOf(isClickable(), isDisplayed());
    }

    @Override
    public String getDescription() {
        return "CallOnClick";
    }

    @Override
    public void perform(UiController uiController, View view) {
        view.callOnClick();

    }
}
