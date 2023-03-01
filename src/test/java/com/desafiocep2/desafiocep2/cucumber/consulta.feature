Feature: Consulta de endereço pelo CEP

  Como usuário
  Eu quero consultar um endereço pelo CEP
  Para obter informações do endereço

  Scenario: Consulta de endereço válido
    Given que eu tenho o CEP "01001-000"
    When eu realizo uma consulta de endereço
    Then o sistema retorna o endereço "Praça da Sé" com a cidade "São Paulo" e o estado "SP"

  Scenario: Consulta de endereço inválido
    Given que eu tenho o CEP "99999-999"
    When eu realizo uma consulta de endereço
    Then o sistema retorna uma mensagem de erro