#Author: juanprat96@gmail.com
Feature: buy ticket for a concert
  juan wants to buy a ticket for his selected concert
  Background: juan wants to register into tuboleta page 
  	Given juan goes to tu boleta page
  	Then juan should see the tu boleta main page
    When juan clicks register button
    When juan fills the requested data
      | email                     | pass          | id        | salute | firstName | lastName | dayOfBirth | monthOfBirth | yearOfBirth | areaCode | telefone | city     | departament | country  |
      | semillerosophos@gmail.com | semillero2018 | 123456789 | Sr     | juan      | sosa     |         15 |           12 |        1996 |       57 | 12345678 | medellin | Antioquia   | Colombia |
    Then juan clicks join now
    Then juan clicks the tuboleta Homebutton
    When juan search for concerts 
    Then juan randomly pick one concert

  Scenario: juan is going to buy a ticket for a concert
  	Then juan should see a yellow buy button
  	Then juan stores the concert name
    Given juan clicks the buy button
    When juan choose the ticket info
    And juan clicks the next button
    Then juan validates the name of the concert
    When juan clicks the go to pay button
    When juan clicks again a go to pay button
    When juan fills the financial requested data
      | creditCardNumber | ownerCardName | monthOfExpirity | yearOfExpirity | cvv  | address     | postalCode |
      | xxxxxxxx         | juan          |              12 |           2020 | 9612 | the address |         57 |
    Then juan clicks send payment button
