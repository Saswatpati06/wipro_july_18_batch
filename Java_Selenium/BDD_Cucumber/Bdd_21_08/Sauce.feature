Feature: SauceDemo Login Functionality

Background: Given User is on the login page

  Scenario: Valid login with standard user
    Given User is on the SauceDemo login page
    When User enters "standard_user" and "secret_sauce"
    And User clicks on the login button
    Then User should see the Products page

  Scenario: Invalid login with wrong password
    Given User is on the SauceDemo login page
    When User enters "standard_user" and "wrong_password"
    And User clicks on the login button
    Then User should see an error message "Epic sadface: Username and password do not match any user in this service"

  Scenario Outline: Login with different user credentials
    Given User is on the SauceDemo login page
    When User enters "<username>" and "<password>"
    And User clicks on the login button
    Then User should see "<expectedResult>"

    Examples:
      | username       | password     | expectedResult |
      | standard_user  | secret_sauce | Products       |
      | locked_out_user| secret_sauce | Epic sadface   |
      | standard_user  | wrong_pass   | Epic sadface   |
