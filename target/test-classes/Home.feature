#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>

@tag
Feature: POC - QA Santander
  I want to use this template for my feature file

  @tag1
  Scenario: Simular o finaciamento de um imóvel
    Given Acessei a tela de financiamento de imovel
    And Informei os dados obrigatorios
    When Clico em proximo
    Then Sou direcionado para a pagina Dados da Proposta
