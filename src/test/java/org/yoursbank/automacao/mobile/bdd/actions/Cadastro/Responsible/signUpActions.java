package org.yoursbank.automacao.mobile.bdd.actions.Cadastro.Responsible;

import com.github.javafaker.Faker;
import org.yoursbank.automacao.mobile.bdd.UsersPage;
import org.yoursbank.automacao.mobile.bdd.pages.Cadastro.Responsible.signUp;
import org.yoursbank.automacao.mobile.bdd.pages.MasterPageFactory;

public class signUpActions {
    static Faker faker = new Faker();
    public static UsersPage usersPage() {
        return MasterPageFactory.getPage(UsersPage.class);
    }

    public static signUp autenticacaoPageSignUp(){
        return MasterPageFactory.getPage(signUp.class);
    }

    public static void validatePage() {
        autenticacaoPageSignUp().delay(5000);
        autenticacaoPageSignUp().btnCreateNewAccount();// Valida se o botão "Criar conta" está visivel
    }
    public static void clickSignUp(){
        autenticacaoPageSignUp().getOptSignUp().click(); // Clica no botão "Criar conta"
    }
    public static void validateTxtSignUp(){
        autenticacaoPageSignUp().validateTxtSignUp();
    }

    public static void validateAndClickOptResponsible() {
        autenticacaoPageSignUp().validateOptResponsible();
        autenticacaoPageSignUp().getOptResponsible().click();
    }
    public static void validateTxtEnterYourAccountDetails() {
        autenticacaoPageSignUp().validateTxtEnterYourAccountDetails();
    }
    public static void validateErrorOnlyFirstName() {
        autenticacaoPageSignUp().validateErrorOnlyFirstName();
    }
    public static void validateErrorWhiteSpaceAfterName() {
        autenticacaoPageSignUp().validateErrorWhiteSpaceAfterName();
    }
    public static void validateErrorWhiteSpaceBeforeName() {
        autenticacaoPageSignUp().validateErrorWhiteSpaceBeforeName();
    }
    public static void validateErrorNumberBeforeAndAfterName() {
        autenticacaoPageSignUp().validateErrorNumberBeforeAndAfterName();
    }
    public static void validateErrorWithoutdigitNine() {
        autenticacaoPageSignUp().validateErrorWithoutdigitNine();
    }
    public static void validateErrorJustEightDigits() {
        autenticacaoPageSignUp().validateErrorJustEightDigits();
    }

    public static void insertFirstName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.name().firstName());
    }
    public static void whiteSpaceAfterName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.name().firstName()+" ");
    }
    public static void whiteSpaceBeforeName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(" "+faker.name().firstName());
    }
    public static void numberBeforeName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.number().numberBetween(1,10)+faker.name().firstName());
    }
    public static void numberAfterName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.name().firstName()+faker.number().numberBetween(1,10));
    }
    public static void withoutdigitNine() {
        autenticacaoPageSignUp().getPhoneNumber().click();
        autenticacaoPageSignUp().getPhoneNumber().sendKeys("51"+faker.phoneNumber().subscriberNumber(8));
    }
    public static void justEightDigits() {
        autenticacaoPageSignUp().getPhoneNumber().click();
        autenticacaoPageSignUp().getPhoneNumber().sendKeys("51"+faker.phoneNumber().subscriberNumber(8));
    }

}
