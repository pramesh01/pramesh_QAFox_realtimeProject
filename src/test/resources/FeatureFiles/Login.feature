@feature2
Feature: verifying Login feature of application

@tag_login1
Scenario: verify that user is able to login with correct credentials
Given I launch application
And I am navigation towards login account page
When i am entering username "pramesh.cs@gmail.com" and password "parthik"
Then user account dashboard should get appeared

@tag_login2
Scenario: verify that user is not able to login with incorrect login credentials
Given I launch application
And I am navigation towards login account page
When i am entering username "pintu@gmail.com" and password "pintu"
Then warning message should get displayed
And user should not be allowed to login

@tag_login3
Scenario: verify that user is not able to login with blank credentials
Given I launch application
And I am navigation towards login account page
When i am entering username "" and password ""
Then warning message should get displayed
And user should not be allowed to login


