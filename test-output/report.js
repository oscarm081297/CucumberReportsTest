$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Background.feature");
formatter.feature({
  "line": 1,
  "name": "My Backgraund test",
  "description": "",
  "id": "my-backgraund-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "my-backgraund-test;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Facebook page",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundSteps.open_the_browser()"
});
formatter.result({
  "duration": 7172957500,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundSteps.i_navigate_to_Google_page()"
});
formatter.result({
  "duration": 3739375800,
  "status": "passed"
});
formatter.uri("LoginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Login Succesfully",
  "description": "",
  "id": "login-succesfully",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Check login is successful with valid credentials",
  "description": "",
  "id": "login-succesfully;check-login-is-successful-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter valid user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clicked on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User redirected to mainpage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 9040849600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_valid_user_name_and_password()"
});
formatter.result({
  "duration": 382554900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clicked_on_login_button()"
});
formatter.result({
  "duration": 249667300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_redirected_to_inbox()"
});
formatter.result({
  "duration": 8029215900,
  "status": "passed"
});
});