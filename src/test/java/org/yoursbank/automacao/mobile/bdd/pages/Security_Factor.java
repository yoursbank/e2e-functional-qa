package org.yoursbank.automacao.mobile.bdd.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;

@Getter
@NoArgsConstructor
public class Security_Factor extends PageBase {

    public void validatePageSecurityFactor(){
        validateElementPresence("//android.view.View[@content-desc=\"SECURITY FACTOR\"]");
    }
    public void verificaFraseSecurityFactor() {
        validateElementPresence("//android.view.View[@content-desc=\"Do you wish to add a security factor to access S.Touch ?\"]");
    }

    public void validateOptionsYes(){
        validateElementPresence("//android.widget.ImageView[@content-desc=\"Yes\"]");
    }

    public void validateOptionsNotNow(){
        validateElementPresence("//android.widget.ImageView[@content-desc=\"Not now\"]");
    }

    //---→ Opção de Yes ←---//
    @AndroidFindBy(xpath= "//android.widget.ImageView[@content-desc=\"Yes\"]")
    private WebElement optYes;

    //---→ Opção de Not Now ←---//
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Not now\"]")
    private WebElement optNotNow;

}
