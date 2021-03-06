package com.wiley.autotest.selenium.elements.upgrade.v3.conditions.element;

import com.wiley.autotest.selenium.elements.upgrade.TeasyElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.annotation.Nullable;

public class ElementClickable implements ExpectedCondition<Boolean> {

    private TeasyElement element;

    public ElementClickable(TeasyElement element) {
        this.element = element;
    }

    @Nullable
    @Override
    public Boolean apply(@Nullable WebDriver driver) {
        return element.isDisplayed() && element.isEnabled();
    }

    @Override
    public String toString() {
        return String.format("Element '%s' is not clickable", element.toString());
    }

}
