package org.yoursbank.automacao.mobile.bdd.pages.Cadastro.Responsible;

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

    // ↓↓↓  Titulo das opções responsável e dependente  ↓↓↓ //
    public void validateOptResponsible(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'Sou o(a) responsável')]");//name
    }
    public void validateTxtSignUp(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'Escolha uma das opções abaixo para continuar:')]");
    }
    public void validateTxtEnterYourAccountDetails(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'Informe seus dados de conta')]");
    }
    public void validateErrorOnlyFirstName(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'O nome deve ser completo e ter somente letras')]");
    }
    public void validateErrorWhiteSpaceAfterName(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'O nome não pode conter espaços no final')]");
    }
    public void validateErrorWhiteSpaceBeforeName(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'O nome não pode conter espaços no inicio')]");
    }
    public void validateErrorNumberBeforeAndAfterName(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'O nome deve ser completo e ter somente letras')]");
    }
    public void validateErrorWithoutdigitNine(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'O número deve conter o dígito inicial 9')]");
    }
    public void validateErrorJustEightDigits(){
        validateElementPresence("//android.widget.TextView[contains(@text, 'O número deve conter 9 dígitos')]");
    }



    //--- Tela 1 ---//
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Criar nova conta')]")
    private WebElement optSignUp;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Sou o(a) responsável')]")
    private WebElement optResponsible;

    //--- Tela 2 ---//

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Nome completo')]")
    private WebElement fullName;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Número de celular')]")
    private WebElement phoneNumber;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'E-mail')]")
    private WebElement email;


}
