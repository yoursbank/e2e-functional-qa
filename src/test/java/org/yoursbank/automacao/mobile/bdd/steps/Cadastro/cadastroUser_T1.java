package org.yoursbank.automacao.mobile.bdd.steps.Cadastro;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import lombok.extern.slf4j.Slf4j;
import org.yoursbank.automacao.mobile.bdd.UsersPage;
import org.yoursbank.automacao.mobile.bdd.actions.Cadastro.signUpActions;

@Slf4j
public class cadastroUser_T1 extends UsersPage {

    // Contexto para escolher
    @Dado("que eu esteja na página de cadastro")
    public void que_Eu_Esteja_Na_Página_De_Cadastro() {
        log.info("Faço a validação da tela de start");
        signUpActions.validatePage();
    }

    @E("clico no botão signUp")
    public void clico_No_Botão_SignUp() {
        log.info("Clico em criar nova conta");
        signUpActions.clickSignUp();
    }

    @E("verifico se estou na tela de cadastro")
    public void verifico_Se_Estou_Na_Tela_De_Cadastro() {
        log.info("Verifico o texto 'Escolha uma das opções abaixo para continuar'");
        signUpActions.validateTxtSignUp();
    }

    @Então("clico na opção responsável")
    public void clico_Na_Opção_Responsável() {
        log.info("Clico na opção de responsável");
        signUpActions.validateAndClickOptResponsible();
    }
    @Então("clico na opção dependente")
    public void clico_Na_Opção_Dependete() {
        log.info("Clico na opção de responsável");
        signUpActions.validateAndClickOptDependent();
    }

    // Cenário 1
    @Dado("que estou na tela de cadastro")
    public void que_Estou_Na_Tela_De_Cadastro() {
        log.info("Verifico se estou na tela de cadastro");
        signUpActions.validateTxtEnterYourAccountDetails();
    }

    @Quando("informo apenas meu primeiro nome")
    public void informo_Apenas_Meu_Primeiro_Nome() {
        log.info("Insiro apenas meu primeiro nome");
        signUpActions.insertFirstName();
    }

    @Então("o sistema exibe uma mensagem de erro")
    public void o_Sistema_Exibe_Uma_Mensagem_De_Erro() {
        log.info("Valido a mensagem de erro");
        signUpActions.validateErrorOnlyFirstName();
    }

    // Cenario 2
    @Quando("informo meu nome com espaços em branco no final")
    public void informo_Meu_Nome_Com_Espaços_Em_Branco_No_Final() {
        signUpActions.whiteSpaceAfterName();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o nome não pode conter espaços em branco no final")
    public void O_Nome_Não_Pode_Conter_Espaço_Em_Branco_No_Final() {
        signUpActions.validateErrorWhiteSpaceAfterName();
    }

    //Cenario 3
    @Quando("informo meu nome com espaços em branco no inicio")
    public void informo_Meu_Nome_Com_Espaços_Em_Branco_No_Inicio() {
        signUpActions.whiteSpaceBeforeName();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o nome pode conter espaços em branco no começo")
    public void O_Nome_Não_Pode_Conter_Espaço_Em_Branco_No_Começo() {
        signUpActions.validateErrorWhiteSpaceBeforeName();
    }

    //Cenario 4
    @Quando("informo meu nome e um número no inicio")
    public void informo_Meu_Nome_E_Um_Número_inicio() {
        signUpActions.numberBeforeName();
    }

    @Então("o sistema exibe uma mensagem de erro informando que não pode usar numeros")
    public void Um_Numero_É_Inválido_Antes_E_Depois_Do_Nome() {
        signUpActions.validateErrorNumberBeforeAndAfterName();
    }

    //Cenario 5
    @Quando("informo meu nome e um número no final")
    public void informo_Meu_Nome_E_Um_Número_final() {
        signUpActions.numberAfterName();
    }

    //Cenario 6
    @Quando("informo um número de celular sem o digito 9")
    public void informo_Um_Número_De_Celular_Sem_O_Digito_Nove() {
        signUpActions.withoutdigitNine();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o número de celular sem o digito 9")
    public void O_Sistema_Exibe_Uma_Mensagem_De_Erro_Informando_Que_O_Número_De_Celular_É_Inválido() {
        signUpActions.validateErrorWithoutdigitNine();
    }

    //Cenario 7
    @Quando("informo apenas 8 digitos do numero de celular")
    public void informo_Apenas_8_Digitos_Do_Numero_De_Celular() {
        signUpActions.justEightDigits();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o número contem apenas 8 dígitos")
    public void O_sistema_exibe_uma_mensagem_de_erro_informando_que_o_número_contém_apenas_8_dígitos() {
        signUpActions.validateErrorJustEightDigits();
    }

    //Cenario 8
    @Quando("informo um número de celular com DDD inválido")
    public void informo_Um_Número_De_Celular_Com_DDD_Inválido() {
        signUpActions.invalidDDD();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o número de celular com DDD é inválido")
    public void O_Sistema_Exibe_Uma_Mensagem_De_Erro_Informando_Que_O_Número_De_Celular_Com_DDD_É_Inválido() {
        signUpActions.validateErrorInvalidDDD();
    }

    //Cenario 9
    @Quando("informo um e-mail já cadastrado")
    public void informo_Um_EMail_Já_Cadastrado() {
        signUpActions.emailAlredyExisting();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o e-mail já está em uso")
    public void O_Sistema_Exibe_Uma_Mensagem_De_Erro_Informando_Que_O_Email_Já_Está_Em_Uso() {
        signUpActions.validateErrorEmailAlredyExisting();
        signUpActions.clickButtonOK();
    }

    // Cenario 10
    @Quando("informo um e-mail em formato inválido")
    public void informo_Um_Email_Em_Formato_Inválido() {
        signUpActions.emailNotExistent();
    }

    @Então("o sistema devera deixar o botão continuar desabilitado")
    public void O_Sistema_Deverá_Deixar_O_Botão_Continuar_Desabilitado() {
        signUpActions.disableButtonContinue();
    }

    // Cenario 11
    @Quando("informo um e-mail com espaço em branco")
    public void Informo_Um_Email_Com_Espaço_Em_Branco() {
        signUpActions.whiteSpaceBeforeEmail();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o e-mail não pode conter espaços em branco")
    public void O_Sistema_Exibe_Uma_Mensagem_De_Erro_Informando_Que_O_Email_Não_Pode_Conter_Espaços_Em_Branco() {
        signUpActions.validateErrorWhiteSpaceBeforeEmail();
        signUpActions.disableButtonContinue();
    }

    // Cenario de cadastro - T1 Completo
    @Quando("informo meu nome completo")
    public void informo_Meu_Nome_Completo() {
        signUpActions.insertFullName();
    }

    @E("informo um número de celular válido")
    public void Informo_Um_Número_De_Celular_Válido() {
        signUpActions.insertFullNumber();
    }

    @E("informo um e-mail válido")
    public void Informo_Um_Email_Válido() {
        signUpActions.insertEmailValid();
    }

    @Então("é enviado um código pin para o email informado")
    public void prossigo_Para_Tela_De_Validação_Do_Pin() {
        signUpActions.clickButtonContinue();
    }
}


