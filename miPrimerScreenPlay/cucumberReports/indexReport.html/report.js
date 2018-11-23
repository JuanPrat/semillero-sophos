$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resourses/features/googleTranslate.Feature");
formatter.feature({
  "name": "Google translate",
  "description": "  As a web user\n  I want to use google translate\n  to translate the word amazing ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Translate from english to spanish",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that zoe want to translate a word",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.thatZoeWantToTranslateAWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she translate the word amazing to spanish",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.sheTranslateTheWordAmazingToSpanish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she should see the word amazing in the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.sheShouldSeeTheWordAmazingInTheScreen()"
});
formatter.result({
  "status": "passed"
});
});