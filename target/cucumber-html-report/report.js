$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Use the website to find restaurants",
  "description": "So that I can order food\r\nAs a hungry customer\r\nI want to be able to find restaurants in my area",
  "id": "use-the-website-to-find-restaurants",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8048293896,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Search for restaurants in an area",
  "description": "",
  "id": "use-the-website-to-find-restaurants;search-for-restaurants-in-an-area",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I want food in \"AR51 1AA\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for restaurants",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see some restaurants in \"AR51 1AA\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "AR51 1AA",
      "offset": 16
    }
  ],
  "location": "StepDefinition.iWantFoodIn(String)"
});
formatter.result({
  "duration": 238597844,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iSearchForRestaurants()"
});
formatter.result({
  "duration": 2377177835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AR51 1AA",
      "offset": 34
    }
  ],
  "location": "StepDefinition.iShouldSeeSomeRestaurantsIn(String)"
});
formatter.result({
  "duration": 51121806528,
  "status": "passed"
});
});