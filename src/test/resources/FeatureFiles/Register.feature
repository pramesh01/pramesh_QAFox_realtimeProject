Feature: validating for the registration scenarios

Scenario: verify if user is able to register in application
Given I launch application
And I navigate to account navigation page
When I provide all the below mentioned vlid credentials
|  FirstName   | Pramesh                | 
|  LastName    | Kumar                  | 
|  Email       |  pramesh.cs@gmail.com  | 
|  Telephone   |  9999284128            | 
|  Password    |  parthik               |
And I selected privacy policy
And I click on continue button
Then user account should be created successfully
