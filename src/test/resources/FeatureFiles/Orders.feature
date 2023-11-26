@feature4
Feature: end to end place order feature validation

  @tag_order1
  Scenario: verifying end to end place order scenario
    Given Login to application
    And add product to bag and checkout
    When I place a complete order
    Then order placed message should get displayed

