$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFeature.feature");
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
  "duration": 10183995500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_valid_user_name_and_password()"
});
formatter.result({
  "duration": 313562700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clicked_on_login_button()"
});
formatter.result({
  "duration": 177150300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_redirected_to_inbox()"
});
formatter.result({
  "duration": 8581715400,
  "status": "passed"
});
});