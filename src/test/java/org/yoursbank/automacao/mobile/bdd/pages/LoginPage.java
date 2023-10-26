package org.yoursbank.automacao.mobile.bdd.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebElement;


@Getter
@NoArgsConstructor
public class LoginPage extends PageBase {


    // ---→ Campo do e-mail ←--- //
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
    private WebElement txtEmail;

    // ---→ Campo da senha ←--- //
    @AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
    private WebElement txtPassword;

    // ---→ Botão de visualização da senha ←--- //
    @AndroidFindBy(xpath = "//android.widget.EditText[2]/android.widget.Button")
    private WebElement btnEyes;

    // ---→ Botão de login ←--- //
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"LOGIN\"]")
    private WebElement btnLogin;

    // ---→ Mensagem de erro (usuário/senha inválido(a)) ←--- //
    public void validateLoginInvalid() {
        validateElementPresence("//android.view.View[@content-desc=\"Wrong e-mail or password\"]");
    }

    // ---→ Botão tente novamente ←--- //
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Try again\"]")
    private WebElement btnTryAgain;
}

