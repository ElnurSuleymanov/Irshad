package pom;

import lombok.Data;
import org.openqa.selenium.By;
@Data
public class FooterPom {

        private static FooterPom INSTANCE;
        private FooterPom() {

        }
        public static FooterPom getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new FooterPom();
                return INSTANCE;
            } else {
                return INSTANCE;
            }
        }

//        private By  getDivSectionLocator () { return divSectionLocator ;}
//        private final By divSectionLocator = By.className("footer__contacts__social__icons");
//        private final By socialMediaButton = By.cssSelector(".footer__contacts__social__icons a");
}
