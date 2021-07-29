package com.co.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Calculator {

    public static final Target NUMBER = Target.the(" box numbers").locatedBy("//*[@resource-id='com.android.calculator2:id/digit_{0}']");
    public static final Target OPERATOR = Target.the("box operators").locatedBy("//android.widget.Button[@content-desc='{0}']");
    public static final Target RESULT = Target.the("tex result").located(By.id("com.android.calculator2:id/result"));
}
