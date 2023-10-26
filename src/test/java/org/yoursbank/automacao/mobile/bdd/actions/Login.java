package org.yoursbank.automacao.mobile.bdd.actions;

import org.yoursbank.automacao.mobile.bdd.pages.Cadastro.Responsible.signUp;
import org.yoursbank.automacao.mobile.bdd.pages.LoginPage;
import org.yoursbank.automacao.mobile.bdd.pages.MasterPageFactory;

public class Login {

    public static LoginPage autenticacaoPage() {
        return MasterPageFactory.getPage(LoginPage.class);
    }
    public static signUp autenticacaoPageSignUp(){
        return MasterPageFactory.getPage(signUp.class);
    }

    public static void validatePage() {
//        autenticacaoPageSignUp().validatePage();
        autenticacaoPage().getBtnLogin().click();
    }
    public static void clickEyes(){
        LoginPage autenticacaoPage = autenticacaoPage();
        autenticacaoPage.getBtnEyes().click();
        pathPage().delay(3000);
        autenticacaoPage.getBtnEyes().click();
    }

    public static LoginPage pathPage() { //---→ LOCAL
        return MasterPageFactory.getPage(LoginPage.class);
    }

    public static void fillLogin(String usuario, String senha) {
        LoginPage autenticacaoPage = autenticacaoPage();

        autenticacaoPage.getTxtEmail().click();
        autenticacaoPage.getTxtEmail().sendKeys(usuario);
        autenticacaoPage.getTxtPassword().click();
        autenticacaoPage.getTxtPassword().sendKeys(senha);
        clickEyes();

    }

    public static void fillInvalidLogin() {
        LoginPage autenticacaoPage = autenticacaoPage();

        autenticacaoPage.getTxtEmail().click();
        autenticacaoPage.getTxtEmail().sendKeys("testInvalido@gmail.com");
        autenticacaoPage.getTxtPassword().click();
        autenticacaoPage.getTxtPassword().sendKeys("senhaInválida");
        clickEyes();
    }

    public static void validateLoginInvalid() {
        autenticacaoPage().validateLoginInvalid();
        autenticacaoPage().getBtnTryAgain();
    }

    public static void submit() {
        autenticacaoPage().getBtnLogin().click();
    }
}