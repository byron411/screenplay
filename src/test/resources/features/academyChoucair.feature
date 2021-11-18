# Autor: Byron Trejo
@stories
Feature: Academy Choucair
  As a user, I want to learn nhow to auutomate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline: Search for a automation course
    Given than Bryan wants to learn automation at the academy Choucair
    |strUser  |strPassword|
    |<strUser>|<strPassword>|
    When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
      |strCourse  |
      |<strCourse>|
    Then he finds the course called resources Recuros Automatización Bancolombia
      |strCourse  |
      |<strCourse>|
    Examples:
      |strUser  |strPassword|strCourse|
      |rbtrejo|ByTrejo|Metodología bancolombia|