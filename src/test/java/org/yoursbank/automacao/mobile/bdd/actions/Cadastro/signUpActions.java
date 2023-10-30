package org.yoursbank.automacao.mobile.bdd.actions.Cadastro;

import com.github.javafaker.Faker;
import org.yoursbank.automacao.mobile.bdd.pages.Cadastro.signUp;
import org.yoursbank.automacao.mobile.bdd.pages.MasterPageFactory;
import org.yoursbank.automacao.mobile.bdd.pages.PageBase;

import java.util.Arrays;
import java.util.List;

public class signUpActions extends PageBase {
    static Faker faker = new Faker();

    public static PageBase pageBase() {
        return MasterPageFactory.getPage(PageBase.class);
    }

    public static signUp autenticacaoPageSignUp() {
        return MasterPageFactory.getPage(signUp.class);
    }

    public static void validatePage() {
        autenticacaoPageSignUp().delay(5000);
        autenticacaoPageSignUp().btnCreateNewAccount();// Valida se o botão "Criar conta" está visivel
    }

    public static void clickSignUp() {
        autenticacaoPageSignUp().getOptSignUp().click(); // Clica no botão "Criar conta"
    }

    public static void validateTxtSignUp() {
        autenticacaoPageSignUp().validateTxtSignUp();
    }

    public static void validateAndClickOptResponsible() {
        autenticacaoPageSignUp().validateOptResponsible();
        autenticacaoPageSignUp().getOptResponsible().click();
    }
    public static void validateAndClickOptDependent() {
        autenticacaoPageSignUp().validateOptDependent();
        autenticacaoPageSignUp().getOptDependent().click();
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

    public static void validateErrorInvalidDDD() {
        autenticacaoPageSignUp().validateErrorInvalidDDD();
    }

    public static void validateErrorEmailAlredyExisting() {
        autenticacaoPageSignUp().validateErrorEmailAlredyExisting();
    }

    public static void validateErrorWhiteSpaceBeforeEmail() {
        autenticacaoPageSignUp().validateErrorWhiteSpaceBeforeEmail();
    }

    //--------------------------------//
    public static void insertFullName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.name().firstName() + " " + faker.name().firstName());
    }

    public static void insertFullNumber() {
        autenticacaoPageSignUp().getPhoneNumber().click();
        autenticacaoPageSignUp().getPhoneNumber().sendKeys("51" + "9" + faker.phoneNumber().subscriberNumber(8));
    }
    public static void insertEmailValid() {
        autenticacaoPageSignUp().getEmail().click();
        autenticacaoPageSignUp().getEmail().sendKeys(faker.internet().emailAddress());
        pageBase().hideKeyboard();
    }

    public static void insertFirstName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.name().firstName());
    }

    public static void whiteSpaceAfterName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.name().firstName() + " ");
    }

    public static void whiteSpaceBeforeName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(" " + faker.name().firstName());
    }

    public static void numberBeforeName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.number().numberBetween(1, 10) + faker.name().firstName());
    }

    public static void numberAfterName() {
        autenticacaoPageSignUp().getFullName().click();
        autenticacaoPageSignUp().getFullName().sendKeys(faker.name().firstName() + faker.number().numberBetween(1, 10));
    }

    public static void withoutdigitNine() {
        autenticacaoPageSignUp().getPhoneNumber().click();
        autenticacaoPageSignUp().getPhoneNumber().sendKeys("51" + faker.phoneNumber().subscriberNumber(8));
    }

    public static void justEightDigits() {
        autenticacaoPageSignUp().getPhoneNumber().click();
        autenticacaoPageSignUp().getPhoneNumber().sendKeys("51" + faker.phoneNumber().subscriberNumber(8));
    }

    public static void invalidDDD() {
        List<String> ddds = Arrays.asList("00", "10", "20", "30", "40", "50", "60", "70", "80", "90");
        for (String ddd : ddds) {
            autenticacaoPageSignUp().getPhoneNumber().click();
            autenticacaoPageSignUp().getPhoneNumber().sendKeys(ddd + faker.phoneNumber().subscriberNumber(9));

            // Verifique se a mensagem "O número de DDD é inválido" é exibida
            boolean isInvalidMessageDisplayed = autenticacaoPageSignUp().getTxtDDD().isEnabled();

            if (isInvalidMessageDisplayed) {
                System.out.println("A mensagem 'O número de DDD é inválido' foi exibida para o DDD " + ddd + ".");

            } else {
                System.out.println("A mensagem 'O número de DDD é inválido' não foi exibida para o DDD " + ddd + ".");
            }

            // Limpe o campo de telefone para a próxima iteração (se necessário)
            autenticacaoPageSignUp().getPhoneNumber().clear();
        }
    }

    public static void emailAlredyExisting() {
        insertFullName();
        insertFullNumber();
        autenticacaoPageSignUp().getEmail().click();
        autenticacaoPageSignUp().getEmail().sendKeys("amiltonjosefn@gmail.com");
        pageBase().hideKeyboard();

        autenticacaoPageSignUp().validateBtnVisible();
        autenticacaoPageSignUp().getBtnContinue().click();
    }

    public static void clickButtonOK() {
        autenticacaoPageSignUp().getBtnOK().click();
    }

    public static void emailNotExistent() {
        insertFullName();
        insertFullNumber();
        autenticacaoPageSignUp().getEmail().click();
        autenticacaoPageSignUp().getEmail().sendKeys("teste.qa");
        pageBase().hideKeyboard();
    }

    public static void disableButtonContinue() {
        autenticacaoPageSignUp().getBtnContinue().isEnabled();
    }
    public static void clickButtonContinue() {
        autenticacaoPageSignUp().getBtnContinue().isDisplayed();
        autenticacaoPageSignUp().getBtnContinue().click();
    }

    public static void whiteSpaceBeforeEmail() {
        insertFullName();
        insertFullNumber();
        autenticacaoPageSignUp().getEmail().click();
        autenticacaoPageSignUp().getEmail().sendKeys(" " + faker.internet().emailAddress());
        pageBase().hideKeyboard();
    }
}