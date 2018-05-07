$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Home.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    }
  ],
  "line": 12,
  "name": "POC - QA Santander",
  "description": "I want to use this template for my feature file",
  "id": "poc---qa-santander",
  "keyword": "Feature",
  "tags": [
    {
      "line": 11,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 16,
  "name": "Simular o finaciamento de um im�vel",
  "description": "",
  "id": "poc---qa-santander;simular-o-finaciamento-de-um-im�vel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Acessei a tela de financiamento de imovel",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Informei os dados obrigatorios",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Clico em proximo",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Sou direcionado para a pagina Dados da Proposta",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});