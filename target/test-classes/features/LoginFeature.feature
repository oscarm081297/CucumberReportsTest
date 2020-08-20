Feature: Login Succesfully

	
	
@login
Scenario: Check login is successful with valid credentials
Given user is on login page
When Enter valid user name and password
And clicked on login button
Then User redirected to mainpage

