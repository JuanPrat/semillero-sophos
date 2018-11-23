#Author: juanprat96@gmail.com


@tag 
Feature: Buscar en google
  quiero abrir google y hacer una busqueda

  @tag1
  Scenario: Busqueda exitosa
Given Que abro el navegador
When que voy a google
And realizo una busqueda de "surf"
Then valido que busco lo que muestra es relacionado con "surf"

  