package org.yoursbank.automacao.mobile.bdd.pages.Cadastro.Dependent;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;
import org.yoursbank.automacao.mobile.bdd.pages.PageBase;

@Getter
@NoArgsConstructor
public class signUp extends PageBase {

    public void btnCreateNewAccount() {
        validateElementPresence("//android.widget.TextView[contains(@text, 'Criar nova conta')]");
    }
    public void validateOptDependent(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'Sou filho(a)')]");//name
    }

    // ↓↓↓  Titulo das opções responsável e dependente  ↓↓↓ //
    public void validateOptsResAndDepen(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'Sou o(a) responsável')]");//name
    }



    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Criar nova conta')]")
    private WebElement optSignUp;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sou filho(a)')]")
    private WebElement optDependent;


}
