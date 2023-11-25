@feature3
Feature: Validating the search functionality of application

  @tag_search1
  Scenario: verify if user gets search results for valid items
   Given I launch application
   And I am navigation towards login account page
   When i am entering username "pramesh.cs@gmail.com" and password "parthik"
   And I search for the product "Samsung" in search textbox
   Then I get the result for the searched items
   
   @tag_search2
  Scenario: verify gets proper search message for unknown products
   Given I launch application
   And I am navigation towards login account page
   When i am entering username "pramesh.cs@gmail.com" and password "parthik"
   And I search for the product "manohar" in search textbox
   Then gets the message regarding item not found

