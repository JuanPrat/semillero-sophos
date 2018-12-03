#Author: juanprat96@gmail.com
@tag
Feature: Log in
  juan wants to login into tuboleta page

  @tag1
  Scenario: login into tuboleta page
    Given juan is in the tuboleta page
    When juan clicks ingresar button
    And juan login with his account and his password
      | email                | pass           |
      | juanprat96@gmail.com | hobu1214737259 |
    Then juan checks he has logedin
