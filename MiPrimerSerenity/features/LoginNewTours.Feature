#Author: juanprat96@gmail.com
@tag
Feature: login in new tours
  quiero logearme en new tours

  @tag1
  Scenario: login 
    Given The newtours login page
    When i fill the user and password
    And click submit button
    Then i access to a new page
