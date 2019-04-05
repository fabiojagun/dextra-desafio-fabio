package com.brunorodrigo.app6alcoholorgasoline.test.pages.robot;

import com.brunorodrigo.app6alcoholorgasoline.R;
import com.brunorodrigo.app6alcoholorgasoline.test.runner.ScreenRobot;

import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TEXT_HINT_ALCOHOL;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TEXT_HINT_GASOLINE;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TEXT_VIEW_KNOW;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_ALCOHOL_BETTER;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_ALCOHOL_EMPTY;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_BTN_CALCULATE;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_FOR_EMPTY_FIELDS;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_GASOLINE_BETTER;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_GASOLINE_EMPTY;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_RESULT_TXT;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_VALUE_ALCOHOL;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_VALUE_GASOLINE;
import static com.brunorodrigo.app6alcoholorgasoline.test.pages.constants.ConstantsMain.TXT_VALUE_GASOLINE_BETTER;

public class RobotMain extends ScreenRobot<RobotMain> {

    private static final int ID_FIELD_ALCOHOL = R.id.editAlcoholPrice;
    private static final int ID_FIELD_GASOLINE = R.id.editGasolinePrice;
    private static final int ID_BTN_CALCULATE = R.id.button;
    private static final int ID_TXT_RESULT = R.id.textResult;
    private static final int ID_TXT_VIEW = R.id.textView;

// Validating ID's
    public RobotMain checkTextView(){
        checkIsDisplayed(ID_TXT_VIEW);
        return this;
    }

    public RobotMain checkViewFieldAlcohol(){
        checkIsDisplayed(ID_FIELD_ALCOHOL);
        return this;
    }

    public RobotMain checkViewFieldGasoline(){
        checkIsDisplayed(ID_FIELD_GASOLINE);
        return this;
    }

    public RobotMain checkViewFieldBtnCalculate(){
        checkIsDisplayed(ID_BTN_CALCULATE);
        return this;
    }

    public RobotMain checkTextResult(){
        checkIsDisplayed(ID_TXT_RESULT);
        return this;
    }

// Validating Texts
    public RobotMain checkTextViewText(){
        checkViewContainsText(TEXT_VIEW_KNOW);
        return this;
    }

    public RobotMain checkHintAlcohol(){
        checkViewHasHint(ID_FIELD_ALCOHOL, TEXT_HINT_ALCOHOL);
        return this;
    }

    public RobotMain checkHintGasoline(){
        checkViewHasHint(ID_FIELD_GASOLINE, TEXT_HINT_GASOLINE);
        return this;
    }

    public RobotMain checkTxtForBtnCalculate(){
        checkViewHasText(ID_BTN_CALCULATE, TXT_BTN_CALCULATE);
        return this;
    }

    public RobotMain checkTxtForTextResult(){
        checkViewHasText(ID_TXT_RESULT, TXT_RESULT_TXT);
        return this;
    }

// Actions and Results
    public RobotMain tapOnCalculate(){
        clickOnView(ID_BTN_CALCULATE);
        return this;
    }

    public RobotMain checkTxtEmptyFields(){
        checkViewHasText(ID_TXT_RESULT, TXT_FOR_EMPTY_FIELDS);
        return this;
    }

    public RobotMain writeAlcohol(){
        enterTextIntoView(ID_FIELD_ALCOHOL, TXT_VALUE_ALCOHOL);
        return this;
    }

    public RobotMain writeGasoline(){
        enterTextIntoView(ID_FIELD_GASOLINE, TXT_VALUE_GASOLINE);
        return this;
    }

    public RobotMain writeGasolineHigher(){
        enterTextIntoView(ID_FIELD_GASOLINE, TXT_VALUE_GASOLINE_BETTER);
        return this;
    }

    public RobotMain checkTxtEmptyGasoline(){
        checkViewHasText(ID_TXT_RESULT, TXT_GASOLINE_EMPTY);
        return this;
    }

    public RobotMain checkTxtEmptyAlcohol(){
        checkViewHasText(ID_TXT_RESULT, TXT_ALCOHOL_EMPTY);
        return this;
    }

    public RobotMain checkTxtResultAlcoholBetter(){
        checkViewHasText(ID_TXT_RESULT, TXT_ALCOHOL_BETTER);
        return this;
    }

    public RobotMain checkTxtResultGasolineBetter(){
        checkViewHasText(ID_TXT_RESULT, TXT_GASOLINE_BETTER);
        return this;
    }
}