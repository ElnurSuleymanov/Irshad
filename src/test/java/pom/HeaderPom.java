package pom;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class HeaderPom {
    private static HeaderPom INSTANCE;
    private HeaderPom() {

    }
    public static HeaderPom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HeaderPom();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }





}
