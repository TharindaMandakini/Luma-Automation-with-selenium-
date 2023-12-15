@tag
Feature: Luma Cloths Purchase

  @tag1
  Scenario: Luma Assignment
    Given I navigate to the Home Page
    Then I navigate to the SignIn Page
    When I enter the email address
    And I enter the password
    And I click the Login button
    Then I navigate to the Cloths page
    And I selects short in size and color
    And I clicks short Add to cart
    And I selects tshirt in size and color
    And I clicks add to cart
    And I clicks cart button
    Then I clicks on Proceed to Checkout button
    And I clicks Next button
    Then I clicks Place Order button
    And Verifies the order