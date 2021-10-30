#Author: monica_8617@hotmail.com

@tag
Feature: Consultar recursos na aplicacao
  Eu como usuario quero realizar uma consulta na aplicacao

Background: Consultar recursos
  Given que esteja na home
  When clicar na documentacao
  
  Scenario: CT01 - Validar recurso People
    And clicar em People
    Then visualizo as informacoes
    
    Scenario: CT02 - Validar recurso Films
    And clicar em Films
    Then visualizo as informacoes
     
     Scenario: CT03 - Teste negativo
     But clicar em About
     Then nao visualizo as informacoes 
