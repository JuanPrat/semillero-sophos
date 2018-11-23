$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginNewTours.Feature");
formatter.feature({
  "name": "login in new tours",
  "description": "  quiero logearme en new tours",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "The newtours login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.the_newtours_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i fill the user and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_fill_the_user_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i access to a new page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_access_to_a_new_page()"
});
formatter.result({
  "status": "passed"
});
});