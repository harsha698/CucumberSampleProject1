$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Public/CucumberPractice1/src/main/java/featureFiles/TestFeature1.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login Logout Feature",
  "description": "",
  "id": "login-logout-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 23,
  "name": "Valid LoginTest",
  "description": "",
  "id": "login-logout-feature;valid-logintest",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "CLick on Login/Enter",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User will be logged into the application",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "able to seelanding page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest.navigateToLoginPage()"
});
formatter.result({
  "duration": 269258936,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.enterUsernamePassword()"
});
formatter.result({
  "duration": 509592,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.clickLogin()"
});
formatter.result({
  "duration": 134968,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.successfulLogin()"
});
formatter.result({
  "duration": 133428,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.navigateToLandingPage()"
});
formatter.result({
  "duration": 265829,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Logout",
  "description": "",
  "id": "login-logout-feature;logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "User clicks on Logout",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User will be logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "LogOut.clickLogout()"
});
formatter.result({
  "duration": 265317,
  "status": "passed"
});
formatter.match({
  "location": "LogOut.successfulLogout()"
});
formatter.result({
  "duration": 213998,
  "status": "passed"
});
});