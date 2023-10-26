package org.yoursbank.automacao.mobile.bdd.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Login {
    //---→ LOGIN VÁLIDO ←---//
    @Dado("que eu esteja na página de login")
    public void que_eu_esteja_na_página_de_login() {
        log.info("Validar a página de autenticação.");
        org.yoursbank.automacao.mobile.bdd.actions.Login.validatePage();
    }

    @E("faça o preenchimento dos dados de login com usuário {string} e senha {string}")
    public void faça_o_preenchimento_dos_dados_válidos_de_dados_de_login_com_usuário(String usuario, String senha) {

        log.info("Realizar o preenchimento dos dados de usuário [" + usuario + "] e senha [" + senha + "]");
        org.yoursbank.automacao.mobile.bdd.actions.Login.fillLogin(usuario, senha);
    }

    @Quando("submeter os dados do login")
    public void submeter_os_dados_de_autenticação() {
        log.info("Submeter os dados");
        org.yoursbank.automacao.mobile.bdd.actions.Login.submit();
    }

    @Então("a página inicial será exibida")
    public void a_página_inicial_será_exibida() {
        log.info("Validar a pagina de permissionamento de bluetooth e localização");
    }

    //---→ LOGIN INVÁLIDO ←---//
    @Dado("que eu esteja na página de login inválido")
    public void que_Eu_Esteja_Na_Página_De_Login_Inválido() {
        log.info("Validar a página de autenticação.");
        org.yoursbank.automacao.mobile.bdd.actions.Login.validatePage();
    }

    @E("faço o preenchimento dos dados de login com inválido")
    public void faço_O_Preenchimento_Dos_Dados_De_Login_Com_Inválido() {
        log.info("Realizar o preenchimento dos dados de usuário");
        org.yoursbank.automacao.mobile.bdd.actions.Login.fillInvalidLogin();
    }

    @Quando("submeter os dados do login inválido")
    public void submeter_Os_Dados_Do_Login_Inválido() {
        log.info("Submeter os dados");
        org.yoursbank.automacao.mobile.bdd.actions.Login.submit();
    }

    @Então("não deverá fazer login inválido")
    public void não_Deverá_Fazer_Login_Inválido() {
        org.yoursbank.automacao.mobile.bdd.actions.Login.validateLoginInvalid();

    }
}