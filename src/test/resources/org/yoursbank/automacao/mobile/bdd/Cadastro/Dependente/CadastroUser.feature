#language:pt

@signUp
Funcionalidade: Cadastro de usuário
Como usuário
Eu quero me cadastrar no App
Para poder realizar login

  Contexto: Cadastro
    Dado que eu esteja na página de cadastro
    Então clico no botão signUp

  Cenario: Validação autenticação
    Dado que estou na página de autenticacao
    E verifico os componentes da tela
    Então volto para página de login

  Cenario: Validação de cadastro
    Dado que eu esteja na pagina de login
    E a recem tenha me cadastrado e me autenticado
    Então realizo o login