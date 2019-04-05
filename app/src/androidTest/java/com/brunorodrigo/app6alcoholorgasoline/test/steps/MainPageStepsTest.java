package com.brunorodrigo.app6alcoholorgasoline.test.steps;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import com.brunorodrigo.app6alcoholorgasoline.MainActivity;
import com.brunorodrigo.app6alcoholorgasoline.test.pages.robot.RobotMain;

import org.junit.Rule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertNotNull;

public class MainPageStepsTest {

    @Rule
    public ActivityTestRule<MainActivity>
            mActivityRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity activity;

    @Before("@main-feature")
    public void setUp(){
        mActivityRule.launchActivity(new Intent());
        activity = mActivityRule.getActivity();
    }

    @After("@main-feature")
    public void tearDown(){
        mActivityRule.finishActivity();
    }

    @Given("^I am on Main$")
    public void I_am_on_Main() {
        assertNotNull(activity);
    }

// Steps for ID's
    @Then("^User Views Element Text View")
    public void User_Views_Element_Text_View() {
        new RobotMain()
                .checkTextView();
    }


    @Then("^User Views Field Alcohol$")
    public void User_Views_Field_Alcohol() {
        new RobotMain()
                .checkViewFieldAlcohol();
    }

    @Then("^User Views Field Gasoline$")
    public void User_Views_Field_Gasoline() {
        new RobotMain()
                .checkViewFieldGasoline();
    }

    @Then("^User Views Button Calculate$")
    public void User_Views_Button_Calculate() {
        new RobotMain()
                .checkViewFieldBtnCalculate();
    }

    @Then("^User Views Text Result")
    public void User_Views_Text_Result() {
        new RobotMain()
                .checkTextResult();
    }

// Steps for Texts
    @Then("^User Views Text Know$")
    public void User_Views_Text_Know() {
        new RobotMain()
                .checkTextViewText();
    }

    @Then("^User Views Hint For Alcohol$")
    public void User_Views_For_Alcohol() {
        new RobotMain()
                .checkHintAlcohol();
    }

    @Then("^User Views Hint For Gasoline$")
    public void User_Views_For_Gasoline() {
        new RobotMain()
                .checkHintGasoline();
    }

    @Then("^User Views Text For Btn Calculate$")
    public void User_Views_For_Btn_Calculate() {
        new RobotMain()
                .checkTxtForBtnCalculate();
    }

    @Then("^User Views Text For Text Result$")
    public void User_Views_For_Text_Result() {
        new RobotMain()
                .checkTxtForTextResult();
    }

// Steps for Actions and Results
    @When("^User Tap On Calculate$")
    public void User_Tap_On_Calculate() {
        new RobotMain()
                .tapOnCalculate();
    }

    @Then("^User Views Message For Empty Fields$")
    public void User_Views_Message_For_Empty_Fields() {
        new RobotMain()
                .checkTxtEmptyFields();
    }

    @And("^User Write Field Alcohol$")
    public void User_Write_Field_Alcohol() {
        new RobotMain()
                .writeAlcohol();
    }

    @And("^User Write Field Gasoline$")
    public void User_Write_Field_Gasoline() {
        new RobotMain()
                .writeGasoline();
    }

    @And("^User Write Field Gasoline Higher$")
    public void User_Write_Field_Gasoline_Higher() {
        new RobotMain()
                .writeGasolineHigher();
    }

    @Then("^User View Message For Empty Gasoline$")
    public void User_View_Message_For_Empty_Gasoline() {
        new RobotMain()
                .checkTxtEmptyGasoline();
    }

    @Then("^User View Message For Empty Alcohol$")
    public void User_View_Message_For_Empty_Alcohol() {
        new RobotMain()
                .checkTxtEmptyAlcohol();
    }

    @Then("^User View Calculus Result Alcohol Better$")
    public void User_View_Calculus_Result_Alcohol_Better() {
        new RobotMain()
                .checkTxtResultAlcoholBetter();
    }

    @Then("^User View Calculus Result Gasoline Better$")
    public void User_View_Calculus_Result_Gasoline_Better() {
        new RobotMain()
                .checkTxtResultGasolineBetter();
    }

}
