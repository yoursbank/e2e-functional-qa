package org.yoursbank.automacao.mobile.bdd.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import lombok.extern.slf4j.Slf4j;
import org.yoursbank.automacao.mobile.bdd.UsersPage;
import org.yoursbank.automacao.mobile.bdd.actions.Cadastro.Responsible.signUpActions;

@Slf4j
public class cadastroUser extends UsersPage {

    // Contexto para escolher Responsável
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
    public void verificoSeEstouNaTelaDeCadastro() {
        log.info("Verifico o texto 'Escolha uma das opções abaixo para continuar'");
        signUpActions.validateTxtSignUp();
    }

    @Então("clico na opção responsável")
    public void clico_Na_Opção_Responsável() {
        log.info("Clico na opção de responsável");
        signUpActions.validateAndClickOptResponsible();
    }

    // Cenário 1 - @SignUpRespCenario1
    @Dado("que estou na tela de cadastro do responsável")
    public void que_Estou_Na_Tela_De_Cadastro_Do_Responsável() {
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

    // Cenario 2 - @SignUpRespCenario2
    @Quando("informo meu nome com espaços em branco no final")
    public void informo_Meu_Nome_Com_Espaços_Em_Branco_No_Final() {
        signUpActions.whiteSpaceAfterName();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o nome não pode conter espaços em branco no final")
    public void O_Nome_Não_Pode_Conter_Espaço_Em_Branco_No_Final() {
        signUpActions.validateErrorWhiteSpaceAfterName();
    }

    //Cenario 3 - @SignUpRespCenario3
    @Quando("informo meu nome com espaços em branco no inicio")
    public void informo_Meu_Nome_Com_Espaços_Em_Branco_No_Inicio() {
        signUpActions.whiteSpaceBeforeName();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o nome pode conter espaços em branco no começo")
    public void O_Nome_Não_Pode_Conter_Espaço_Em_Branco_No_Começo() {
        signUpActions.validateErrorWhiteSpaceBeforeName();
    }
    //Cenario 4 - @SignUpRespCenario4
    @Quando("informo meu nome e um número no inicio")
    public void informo_Meu_Nome_E_Um_Número_inicio() {
        signUpActions.numberBeforeName();
    }

    @Então("o sistema exibe uma mensagem de erro informando que não pode usar numeros")
    public void Um_Numero_É_Inválido_Antes_E_Depois_Do_Nome() {
        signUpActions.validateErrorNumberBeforeAndAfterName();
    }
    //Cenario 5 - @SignUpRespCenario5
    @Quando("informo meu nome e um número no final")
    public void informo_Meu_Nome_E_Um_Número_final() {
        signUpActions.numberAfterName();
    }

    //Cenario 6 - @SignUpRespCenario6
    @Quando("informo um número de celular sem o digito 9")
    public void informo_Um_Número_De_Celular_Sem_O_Digito_Nove() {
        signUpActions.withoutdigitNine();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o número de celular sem o digito 9")
    public void O_Sistema_Exibe_Uma_Mensagem_De_Erro_Informando_Que_O_Número_De_Celular_É_Inválido() {
        signUpActions.validateErrorWithoutdigitNine();
    }
    //Cenario 7 - @SignUpRespCenario7
    @Quando("informo apenas 8 digitos do numero de celular")
    public void informo_Apenas_8_Digitos_Do_Numero_De_Celular() {
        signUpActions.justEightDigits();
    }

    @Então("o sistema exibe uma mensagem de erro informando que o número contem apenas 8 dígitos")
    public void O_sistema_exibe_uma_mensagem_de_erro_informando_que_o_número_contém_apenas_8_dígitos() {
        signUpActions.validateErrorJustEightDigits();
    }

    //Cenario 8  - @SignUpRespCenario8
    @Quando("informo um número de celular com DDD inválido")
    public void informoUmNúmeroDeCelularComDDDInválido() {
    }

    @Então("o sistema exibe uma mensagem de erro informando que o número de celular com DDD é inválido")
    public void oSistemaExibeUmaMensagemDeErroInformandoQueONúmeroDeCelularComDDDÉInválido() {
    }
}


