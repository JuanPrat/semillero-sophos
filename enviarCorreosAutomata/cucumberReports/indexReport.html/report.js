$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/EntrarAGmail.Feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: juanprat96@gmail.com"
    }
  ],
  "line": 3,
  "name": "Entrar a gmail y enviar un correo",
  "description": "quiero poder entrar a gmail y enviarme un correo de prueba",
  "id": "entrar-a-gmail-y-enviar-un-correo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Exitoso",
  "description": "",
  "id": "entrar-a-gmail-y-enviar-un-correo;exitoso",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "abro navegador",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "entro a gmail",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "ingreso \u003cCuenta\u003e y \u003cPass\u003e",
  "rows": [
    {
      "cells": [
        "Cuenta",
        "pass"
      ],
      "line": 11
    },
    {
      "cells": [
        "impala",
        "5"
      ],
      "line": 12
    },
    {
      "cells": [
        "emilio",
        "3"
      ],
      "line": 13
    },
    {
      "cells": [
        "semillerosophos",
        "semillerosophos2018"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "valido que halla ingresado a la cuenta \"semillerosophos\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "envio correo",
  "keyword": "Then "
});
formatter.match({
  "location": "EntrarAGmailStepDefinitions.abro_navegador()"
});
formatter.result({
  "duration": 3373198039,
  "status": "passed"
});
formatter.match({
  "location": "EntrarAGmailStepDefinitions.entro_a_gmail()"
});
formatter.result({
  "duration": 3419255084,
  "status": "passed"
});
formatter.match({
  "location": "EntrarAGmailStepDefinitions.ingreso_Cuenta_y_Pass_validando_con_id(DataTable)"
});
formatter.result({
  "duration": 1265512097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "semillerosophos",
      "offset": 40
    }
  ],
  "location": "EntrarAGmailStepDefinitions.valido_que_halla_ingresado_a_la_cuenta(String)"
});
formatter.result({
  "duration": 13611069262,
  "status": "passed"
});
formatter.match({
  "location": "EntrarAGmailStepDefinitions.envio_correo()"
});
formatter.result({
  "duration": 5449714228,
  "status": "passed"
});
});