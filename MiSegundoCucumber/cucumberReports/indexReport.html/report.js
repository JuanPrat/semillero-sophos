$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BuscarEnGoogle.Feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: juanprat96@gmail.com"
    }
  ],
  "line": 5,
  "name": "Buscar en google",
  "description": "quiero abrir google y hacer una busqueda",
  "id": "buscar-en-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Busqueda exitosa",
  "description": "",
  "id": "buscar-en-google;busqueda-exitosa",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Que abro el navegador",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "que voy a google",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "realizo una busqueda de \"surf\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "valido que busco lo que muestra es relacionado con \"surf\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinitions.que_abro_el_navegador()"
});
formatter.result({
  "duration": 3633384345,
  "status": "passed"
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinitions.que_voy_a_google()"
});
formatter.result({
  "duration": 2932599390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "surf",
      "offset": 25
    }
  ],
  "location": "BuscarEnGoogleStepDefinitions.realizo_una_busqueda_de(String)"
});
formatter.result({
  "duration": 1522646788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "surf",
      "offset": 52
    }
  ],
  "location": "BuscarEnGoogleStepDefinitions.valido_que_busco_lo_que_muestra_es_relacionado_con(String)"
});
formatter.result({
  "duration": 8457076,
  "status": "passed"
});
});