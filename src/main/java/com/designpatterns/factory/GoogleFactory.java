package com.designpatterns.factory;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GoogleFactory {

    //In here we are using lambda expressions to avoid switch or if else conditions depending on the language intantiate one of the pages
    private static final Function<WebDriver, GooglePage> ENG = (d) -> new GoogleEnglishPage(d);
    private static final Function<WebDriver, GooglePage> FR = (d) -> new GoogleFrenchPage(d);
    private static final Function<WebDriver, GooglePage> SA = (d) -> new GoogleArabicPage(d);
    private static final Map<String, Function<WebDriver, GooglePage>> MAP = new HashMap<>();

    static {
        MAP.put("ENG", ENG);
        MAP.put("FR", FR);
        MAP.put("SA", SA);
    }

    public static GooglePage get(String language, WebDriver driver) {
        return MAP.get(language).apply(driver);
    }
}
