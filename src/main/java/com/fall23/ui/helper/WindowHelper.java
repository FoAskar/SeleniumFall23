package com.fall23.ui.helper;

import com.fall23.ui.drivers.Driver;

import java.util.LinkedList;
import java.util.Set;

public class WindowHelper {


    public static Set<String> getWindowHandles() {

        return Driver.getDriver().getWindowHandles();
    }

    public static void switchToWindow(int index) {
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles()
        );
        if (index < 0 || index > windowsId.size()) {
            throw new IllegalArgumentException("You provide wrong Index " + index);
        }
        Driver.getDriver().switchTo().window(windowsId.get(index));

    }

    public static void switchToParent() {
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles());
        Driver.getDriver().switchTo().window(windowsId.get(0));
    }

    public static void switchToParentWithChildClose() {
        switchToParent();
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles());
        for (int i = 1; i < windowsId.size(); i++) {
            Driver.getDriver().switchTo().window(windowsId.get(i));
            Driver.getDriver().close();
        }
        switchToParent();
    }

}






