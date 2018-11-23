#Author: juanprat96@gmail.com
@tag
Feature: Entrar a gmail y enviar un correo
  quiero poder entrar a gmail y enviarme un correo de prueba

  @tag1
  Scenario: Exitoso
    Given abro navegador
    When entro a gmail
    And ingreso <Cuenta> y <Pass>
      | Cuenta          | pass                |
      | impala          |                   5 |
      | emilio          |                   3 |
      | semillerosophos | semillerosophos2018 |
    Then valido que halla ingresado a la cuenta "semillerosophos"
    Then envio correo
