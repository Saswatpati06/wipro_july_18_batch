Feature: Login Functionality

  @regression
  Scenario: Verify the login functionality with invalid credentials
    Given User is on the login page
    When User enters an invalid username
    And User enters an invalid password
    And User clicks on the login button
    Then User should see an error message
