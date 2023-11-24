Feature: validating for the registration scenarios

@tag_sc1
Scenario: verify if user is able to register in application
Given I launch application
And I navigate to account navigation page
When I provide all the below mentioned credentials
|  FirstName   | Pramesh                | 
|  LastName    | Kumar                  | 
|  Email       |  pramesh.cs@gmail.com  | 
|  Telephone   |  9999284128            | 
|  Password    |  parthik               |
And I selected privacy policy
And I click on continue button
Then user account should be created successfully

@tag_sc2
Scenario: verify that duplicate user is not allowed to register
Given I launch application
And I navigate to account navigation page
When I provide following duplicate user details
|  FirstName   |      Pramesh           | 
|  LastName    |      Kumar             | 
|  Email       |  pramesh.cs@gmail.com  | 
|  Telephone   |     9999284128         | 
|  Password    |     parthik            |
And I selected privacy policy
And I click on continue button
Then user should get the error warning message

@tag_sc3
Scenario: verify that subscribed user is able to register account
Given I launch application
And I navigate to account navigation page
When I provide all the below mentioned credentials
|  FirstName   |      Ishu           | 
|  LastName    |      Verma             | 
|  Email       |  ishu.verma@gmail.com  | 
|  Telephone   |     9999284128         | 
|  Password    |     parthik            |
And I selected privacy policy
And I selected subscribed radio button
And I click on continue button
Then user account should be created successfully

@tag_sc4
Scenario: verify user is Not able to register without mandatory field selections
Given I launch application
And I navigate to account navigation page
And I click on continue button
Then I must see that user is not registered
And error message should be displayed related to mandatory fields warnings

