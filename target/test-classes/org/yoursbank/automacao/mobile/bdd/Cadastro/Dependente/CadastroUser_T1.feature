#language:pt

@SignUpDep
Funcionalidade: Cadastro de usuário
  Como usuário
  Eu quero me cadastrar no App
  Para poder realizar login

  Contexto: Cadastro
    Dado que eu esteja na página de cadastro
    E clico no botão signUp
    E verifico se estou na tela de cadastro
    Então clico na opção dependente

  @SignUpDepCenario1
  Cenario: Apenas o primeiro nome
    Dado que estou na tela de cadastro
    Quando informo apenas meu primeiro nome
    Então o sistema exibe uma mensagem de erro

  @SignUpDepCenario2
  Cenario:  Nome com espaços em branco no final
    Dado  que estou na tela de cadastro
    Quando informo meu nome com espaços em branco no final
    Então o sistema exibe uma mensagem de erro informando que o nome não pode conter espaços em branco no final

  @SignUpDepCenario3
  Cenario:  Nome com espaços em branco no inicio
    Dado que estou na tela de cadastro
    Quando informo meu nome com espaços em branco no inicio
    Então o sistema exibe uma mensagem de erro informando que o nome pode conter espaços em branco no começo

  @SignUpDepCenario4
  Cenario:  Número no inicio do nome
    Dado que estou na tela de cadastro
    Quando informo meu nome e um número no inicio
    Então o sistema exibe uma mensagem de erro informando que não pode usar numeros

  @SignUpDepCenario5
  Cenario:  Número no final do nome
    Dado que estou na tela de cadastro
    Quando informo meu nome e um número no final
    Então o sistema exibe uma mensagem de erro informando que não pode usar numeros

  @SignUpDepCenario6
  Cenario:  Dados de conta informando o número sem o dígito 9
    Dado  que estou na tela de cadastro
    Quando informo um número de celular sem o digito 9
    Então o sistema exibe uma mensagem de erro informando que o número de celular sem o digito 9

  @SignUpDepCenario7
  Cenario:  Dados de conta informando o número com apenas 8 dígitos
    Dado  que estou na tela de cadastro
    Quando informo apenas 8 digitos do numero de celular
    Então o sistema exibe uma mensagem de erro informando que o número contem apenas 8 dígitos

  @SignUpDepCenario8
  Cenario:  Dados de conta com DDD inválido
    Dado  que estou na tela de cadastro
    Quando informo um número de celular com DDD inválido
    Então o sistema exibe uma mensagem de erro informando que o número de celular com DDD é inválido

  @SignUpDepCenario9
  Cenario:  Dados de conta com e-mail já cadastrado
    Dado  que estou na tela de cadastro
    Quando informo um e-mail já cadastrado
    Então o sistema exibe uma mensagem de erro informando que o e-mail já está em uso

  @SignUpDepCenario10
  Cenario:  Dados de conta com e-mail em formato inválido
    Dado  que estou na tela de cadastro
    Quando informo um e-mail em formato inválido
    Então o sistema devera deixar o botão continuar desabilitado

  @SignUpDepCenario11
  Cenario:  Dados de conta com e-mail em formato inválido
    Dado  que estou na tela de cadastro
    Quando informo um e-mail com espaço em branco
    Então o sistema exibe uma mensagem de erro informando que o e-mail não pode conter espaços em branco

  @SignUpDepCOMPLETE
  Cenario: Dados de conta válido
    Dado  que estou na tela de cadastro
    Quando informo meu nome completo
    E informo um número de celular válido
    E informo um e-mail válido
    Então é enviado um código pin para o email informado