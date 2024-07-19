$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\features\\multiplebooking.feature");
formatter.feature({
  "name": "Demo of flight booking seperate",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user clicks on the round trip",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the \"\u003cfrom\u003e\" info",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter the \"\u003cto\u003e\" info",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on the search flight",
  "keyword": "When "
});
formatter.step({
  "name": "user should get the list of flight info",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "from",
        "to"
      ]
    },
    {
      "cells": [
        "dxb",
        "cok"
      ]
    },
    {
      "cells": [
        "dxb",
        "trv"
      ]
    }
  ],
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the round trip",
  "keyword": "And "
});
formatter.match({
  "location": "Booking.userClicksOnTheRoundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"dxb\" info",
  "keyword": "And "
});
formatter.match({
  "location": "Booking.userEnterTheInfo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the \"cok\" info",
  "keyword": "And "
});
formatter.match({
  "location": "Booking.userShouldEnterTheInfo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the search flight",
  "keyword": "When "
});
formatter.match({
  "location": "Booking.userClicksOnTheSearchFlight()"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user should get the list of flight info",
  "keyword": "Then "
});
formatter.match({
  "location": "Booking.userShouldGetTheListOfFlightInfo()"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the round trip",
  "keyword": "And "
});
formatter.match({
  "location": "Booking.userClicksOnTheRoundTrip()"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"dxb\" info",
  "keyword": "And "
});
formatter.match({
  "location": "Booking.userEnterTheInfo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the \"trv\" info",
  "keyword": "And "
});
formatter.match({
  "location": "Booking.userShouldEnterTheInfo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the search flight",
  "keyword": "When "
});
formatter.match({
  "location": "Booking.userClicksOnTheSearchFlight()"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Started- Dhiva");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user should get the list of flight info",
  "keyword": "Then "
});
formatter.match({
  "location": "Booking.userShouldGetTheListOfFlightInfo()"
});
formatter.result({
  "status": "passed"
});
formatter.write("finished- Dhiva");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});