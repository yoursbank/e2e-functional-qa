#language:pt

@local
Funcionalidade: Criação de Locais
  Como usuário
  Eu desejo criar um local no aplicativo
  Para organizar diferentes locais, como minha casa, casa de praia, sítio, loja, etc.

  Contexto: Criação de Locais
    Dado que eu esteja na página de login
    E faça o preenchimento dos dados de login com usuário "Melissa56@gmail.com" e senha "Stella@2023"
    E submeter os dados do login
    E que estou na página de permissões para Bluetooth e Localização
    E concedo permissão para Bluetooth e Localização
    E devo ser redirecionado para a página de security Factor
    E que eu esteja na tela Security Factor
    Então eu selecionar a opção Not now

  @newLocal
  Cenário: Criar um Novo Local com Nome Válido
    Dado eu inserir um nome de local válido com até 25 caracteres
    E eu clico no botão Add
    Então o novo local deve ser adicionado à lista de locais

  @writeSpace
  Cenário: Tentar Criar um Novo Local com Nome Iniciando com Espaço em Branco
    Quando eu inserir um nome de local que começa com um espaço em branco
    E eu clico no botão Add
    Então o novo local deve ser adicionado à lista de locais

  @listaLocal
  Cenário: Criar um Novo Local e Verificar a Ordem na Lista
    Dado que existam locais cadastrados na lista
    Quando eu criar um novo local
    Então o novo local deve ser inserido no final da lista