//package org.yoursbank.automacao.mobile.bdd.actions.Cadastro.Dependent;
//
//import com.github.javafaker.Faker;
//import org.yoursbank.automacao.mobile.bdd.UsersPage;
//import org.yoursbank.automacao.mobile.bdd.pages.Cadastro.Responsible.signUp;
//import org.yoursbank.automacao.mobile.bdd.pages.MasterPageFactory;
//
//public class signUpActions {
//    public static UsersPage usersPage() {
//        return MasterPageFactory.getPage(UsersPage.class);
//    }
//
//    public static signUp autenticacaoPageSignUp(){
//        return MasterPageFactory.getPage(signUp.class);
//    }
//    public static void validatePage() {
//        autenticacaoPageSignUp().delay(5000);
//        autenticacaoPageSignUp().btnCreateNewAccount();
//    }
//    public static void validateAndClickOptResponsible() {
//        autenticacaoPageSignUp().validateOptResponsible();
//        autenticacaoPageSignUp().getOptResponsible().click();
//    }
//    public static void validateAndClickOptDependent() {
//        autenticacaoPageSignUp().validateOptDependent();
//        autenticacaoPageSignUp().getOptDependent().click();
//    }
//
//    public static void clickSignUp(){
//        autenticacaoPageSignUp().getOptSignUp().click();
//    }
//
//    public static void validadeSignUpPaths() {
//        autenticacaoPageSignUp().validateSignUp();
//    }
//    public static void clickAndFillSignUpPaths(){
//        Faker faker = new Faker();
//        autenticacaoPageSignUp().getPathName().click();
//        autenticacaoPageSignUp().getPathName().sendKeys("Melissa");
//
//        String Email = faker.internet().emailAddress();
//
//        autenticacaoPageSignUp().getPathEmail().click();
//        autenticacaoPageSignUp().getPathEmail().sendKeys(Email);
//
//        autenticacaoPageSignUp().getPathPassword().click();
//        autenticacaoPageSignUp().getPathPassword().sendKeys("Stella@2023");
//        autenticacaoPageSignUp().getPathConfirmPassword().click();
//        autenticacaoPageSignUp().getPathConfirmPassword().sendKeys("Stella@2023");
//        validateAndClickBtnSignUp();
//        usersPage().atualizarStatusUsuario(Email);
//    }
//}
